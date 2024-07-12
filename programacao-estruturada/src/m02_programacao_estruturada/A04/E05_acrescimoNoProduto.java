package m02_programacao_estruturada.A04;

import java.util.Scanner;

public class E05_acrescimoNoProduto {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite o valor do produto");
        double valor = leitor.nextDouble();

        valor = valor < 100 ? valor + (valor *0.1) : valor;
        valor = valor >= 100? valor + (valor *0.2) : valor;

        System.out.println(valor);

        leitor.close();
    }
}
