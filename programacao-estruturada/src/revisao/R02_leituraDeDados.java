package revisao;

import java.util.Scanner;

public class R02_leituraDeDados{

    public static void main(String[] args) {
        
        //Criando o responsável por ler os dados.
        Scanner leitor = new Scanner(System.in);

        int idade = 0;

        System.out.println("Digite a sua idade.");

        idade = leitor.nextInt();

        System.out.println("Sua idade é: "+idade);

        leitor.close();
    }
}
