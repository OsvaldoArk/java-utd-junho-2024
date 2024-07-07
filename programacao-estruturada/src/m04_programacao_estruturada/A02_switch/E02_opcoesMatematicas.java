package m04_programacao_estruturada.A02_switch;

import java.util.Scanner;

public class E02_opcoesMatematicas {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número.");
        int numero01 = leitor.nextInt();

        System.out.println("Digite o segundo número.");
        int numero02 = leitor.nextInt();

        System.out.println("Escolha uma das opções."+
                            "\n1- média entre os números digitados."+
                            "\n2- o primeiro elevado ao segundo."+
                            "\n3- o produto entre os números digitados"+
                            "\n4- divisão do primeiro pelo segundo");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1: double media = (numero01 + numero02) / 2;

                    System.out.println(media);

                    break;
            
            case 2: System.out.println(Math.pow(numero01, numero02));

                    break;

            case 3: int produto = numero01 * numero02;

                    System.out.println(produto);

                    break;

            case 4: if(numero02 != 0){
                        double resultado = numero01 / numero02;

                        System.out.println(resultado);
                    }
                    else{
                        System.out.println("Erro! Divisão por zero!");
                    }
                    break;
            
            default: System.out.println("Opção Inválida!");
        }

        leitor.close();
    }
}
