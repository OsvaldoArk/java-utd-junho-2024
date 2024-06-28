package m02_programacao_estruturada.A02;

import java.util.Scanner;

public class E01_maiorEntreDoisNumeros {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero01 = leitor.nextInt();

        System.out.println("Digite o segundo número:");
        int numero02 = leitor.nextInt();

        int maior = ((numero01+numero02) + Math.abs(numero01 - numero02))/2;

        System.out.println("O maior entre os dois números é: "+maior);

        leitor.close();

    }
}
