package m04_programacao_estruturada.A08_exercicios;

import java.util.Scanner;

public class E02_compra{

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        double precoFinal = 0;
        String modoPagamento = "";
        int quantidadeDeParcelas = 0;

        System.out.println("Digite o preço do produto");
        double preco = leitor.nextDouble();

        System.out.println("Digite a condição de pagamento");
        System.out.println("1 - à vista no dinheiro ou no cartão com 5% de desconto");
        System.out.println("2 - no pix com 7% de desconto.");
        System.out.println("3 - parcelado em até 3 vezes preço de etiqueta");
        System.out.println("4 - parcelado no cartão em 5 vezes 5% de taxa");
        System.out.println("5 - parcelado em dez vezes no cartão com 12% de taxa");
        int opcao = leitor.nextInt();

        switch(opcao){
            case 1: modoPagamento = "à vista dinheiro ou cartão";
                    quantidadeDeParcelas = 1;
                    precoFinal = preco - preco * (0.05);
                    break;

            case 2: modoPagamento = "à vista no pix";
                    quantidadeDeParcelas = 1;
                    precoFinal = preco - preco * (0.07);
                    break;
            
            case 3: modoPagamento = "parcelado em até 3x";
                    System.out.println("digite o número de parcelas 2 ou 3");
                    quantidadeDeParcelas = leitor.nextInt();
                    precoFinal = preco;
                    break;

            case 4: modoPagamento = "parcelado em 5x";
                    quantidadeDeParcelas = 5;
                    precoFinal = preco + preco * (0.05);
                    break;

            case 5: modoPagamento = "parcelado em 10x";
                    quantidadeDeParcelas = 10;
                    precoFinal = preco + preco * (0.12);
                    break;

            
            default: System.out.println("opção inválida!");
        }

        System.out.println("preço final: "+precoFinal);
        System.out.println("tipo de pagamento: "+modoPagamento);

        if(quantidadeDeParcelas > 1){

            System.out.println("quantidade de parcelas: "+quantidadeDeParcelas);
            System.out.println("valor de cada parcela: "+(precoFinal/quantidadeDeParcelas));
        }

        leitor.close();
    }
}