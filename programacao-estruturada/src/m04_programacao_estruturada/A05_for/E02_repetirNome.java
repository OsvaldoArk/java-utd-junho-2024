package m04_programacao_estruturada.A05_for;

import java.util.Scanner;

public class E02_repetirNome {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um nome");
        String nome = leitor.nextLine();

        System.out.println("Digite quantas vezes esse nome será repetido");
        int vezes = leitor.nextInt();

        int contador = 0;

        while(contador<vezes){
            System.out.println(nome);

            contador++;
        }

        leitor.close();
    }
}
