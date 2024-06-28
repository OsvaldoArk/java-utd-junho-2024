package m02_programacao_estruturada.A01;

import java.util.Scanner;

public class E02_salarioVendedor {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do vendedor");
        String nome = leitor.nextLine();

        System.out.println("Digite o salário fixo");
        double salarioFixo = leitor.nextDouble();

        System.out.println("Digite o total de vendas efetudas.");
        double totalDeVendasEfetuadas = leitor.nextDouble();

        double comissaoSalario = totalDeVendasEfetuadas * 15/100;

        double salarioFinal = salarioFixo + comissaoSalario;

        System.out.printf("nome: %s",nome);
        System.out.printf("\nsalário fixo: %.2f",salarioFixo);
        System.out.printf("\ntotal de vendas: %.2f",totalDeVendasEfetuadas);
        System.out.printf("\nsalário final: %.2f\n",salarioFinal);
    }
}
