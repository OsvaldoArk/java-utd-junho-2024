Claro, aqui está um exemplo de um programa Java para controle de medicamentos em um hospital, com um banco de dados MySQL e uma interface gráfica simples utilizando Swing. Esse exemplo cobre as seguintes funcionalidades:

1. Cadastro de usuários com senha.
2. Conexão com o banco de dados MySQL.
3. Interface gráfica para adicionar e listar usuários.

### Passos Pré-requisitos:
1. Configurar o banco de dados MySQL com a tabela adequada.
2. Adicionar a biblioteca MySQL Connector JAR ao seu projeto Java.

### Script SQL para criar o banco de dados e a tabela de usuários:
```sql
CREATE DATABASE hospital_db;

USE hospital_db;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL
);
```

### Estrutura do Projeto Java:
- `src/`
  - `com/hospital/control/`
    - `Main.java`
    - `DBConnection.java`
    - `User.java`
    - `UserDAO.java`
    - `UserManagementUI.java`

### Código Fonte:

#### `DBConnection.java`:
```java
package com.hospital.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável pela conexão com o banco de dados MySQL.
 */
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/hospital_db";
    private static final String USER = "root";
    private static final String PASSWORD = "yourpassword";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
```

#### `User.java`:
```java
package com.hospital.control;

/**
 * Classe modelo para representar um usuário.
 */
public class User {
    private int id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
```

#### `UserDAO.java`:
```java
package com.hospital.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por operações de banco de dados relacionadas a usuários.
 */
public class UserDAO {
    public void addUser(User user) throws SQLException {
        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.executeUpdate();
        }
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                User user = new User(rs.getString("username"), rs.getString("password"));
                user.setId(rs.getInt("id"));
                users.add(user);
            }
        }
        return users;
    }
}
```

#### `UserManagementUI.java`:
```java
package com.hospital.control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

/**
 * Classe responsável pela interface gráfica de gerenciamento de usuários.
 */
public class UserManagementUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextArea usersListArea;
    private UserDAO userDAO;

    public UserManagementUI() {
        userDAO = new UserDAO();
        setTitle("User Management");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        panel.add(usernameField);

        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        JButton addButton = new JButton("Add User");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addUser();
            }
        });
        panel.add(addButton);

        JButton listButton = new JButton("List Users");
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listUsers();
            }
        });
        panel.add(listButton);

        usersListArea = new JTextArea();
        usersListArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(usersListArea);
        panel.add(scrollPane);

        add(panel);
    }

    private void addUser() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        User user = new User(username, password);
        try {
            userDAO.addUser(user);
            JOptionPane.showMessageDialog(this, "User added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding user!");
        }
    }

    private void listUsers() {
        try {
            List<User> users = userDAO.getAllUsers();
            usersListArea.setText("");
            for (User user : users) {
                usersListArea.append(user.getUsername() + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error listing users!");
        }
    }
}
```

#### `Main.java`:
```java
package com.hospital.control;

/**
 * Classe principal para iniciar a aplicação.
 */
public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UserManagementUI ui = new UserManagementUI();
                ui.setVisible(true);
            }
        });
    }
}
```

### Como Executar:
1. Compile os arquivos Java.
2. Execute a classe `Main` para iniciar a aplicação.

### Notas Finais:
- As credenciais do banco de dados (`DBConnection.java`) devem ser ajustadas conforme seu ambiente.
- Para fins de segurança, recomenda-se criptografar as senhas antes de armazená-las no banco de dados.
- Esse exemplo utiliza uma interface gráfica simples. Para um sistema mais robusto, considere utilizar frameworks como JavaFX ou bibliotecas web para criar uma interface mais sofisticada.