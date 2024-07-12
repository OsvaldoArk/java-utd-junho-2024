package m04_programacao_estruturada.A01_ifelse;

import java.util.Scanner;

public class E01_parOuImpar {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número.");
        int numero = leitor.nextInt();

        if(numero % 2 == 0){
            System.out.printf("o número %d é par!\n",numero);
        }
        else{
            System.out.printf("o número %d é ímpar!\n",numero);
        }

        leitor.close();
    }
}
