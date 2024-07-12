package m04_programacao_estruturada.A02_switch;

import java.util.Scanner;

public class A01_explicacao {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o código do produto");
        int codigo = leitor.nextInt();

        String resposta = "";

        switch (codigo) {
            case 1 : resposta = "Alimento não-perecível"; break;
            case 2 : 
            case 3 :
            case 4 : resposta = "Alimento perecível"; break;
            case 5 :
            case 6 : resposta = "Vestuário"; break;
            case 7 : resposta = "Higiene pessoal"; break;
            case 8 : resposta = "Limpeza e utensílios domésticos"; break;
            default: resposta = "Código inválido";
        }

        System.out.println(resposta);

        leitor.close();
    }
}
