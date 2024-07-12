package m02_programacao_estruturada.A02;

import java.util.Scanner;

public class E02_conta{

    public static void main(String[] args) {
        
        String conta = "999", senha = "456";

        double saldo = 100;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número da sua conta");
        String numConta = leitor.nextLine();

        System.out.println("Digite sua senha");
        String numSenha = leitor.nextLine();

        System.out.println("Digite o valor a ser sacado.");
        double numValor = leitor.nextDouble();

        String resposta = (numConta.equals(conta) && numSenha.equals(senha) && 
                            numValor <= saldo) ? "Saque autorizado! Saldo restante: "+
                            (saldo - numValor) : "Saque recusado! Verifique os dados fornecidos.";

        System.out.println(resposta);

        leitor.close();
    }
}