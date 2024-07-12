package Java;

import java.util.Scanner;

public class RiquelmeGAME {

    public static void main(String[] args) {
        // LEITOR DE RESPOSTAS:
        Scanner leitor = new Scanner(System.in);

        // DEFINE UM NÚMERO ALEATÓRIO, E A QUANTIDADE DE TENTATIVAS POSSÍVEIS:
        int numeroAdivinhado = (int) (Math.random() * 100) + 1;
        int tentativas = 10;

        // INSTRUÇÕES DO GAME:
        System.err.println("Bem Vindo ao jogo de adivinhação!");
        System.err.println("Você terá 10 tentativas para descobrir o número secreto de 0 a 100.");
        System.err.println("BOA SORTE!");

        // DEFINIRÁ O RESULTADO, INICIANDO COMO "FALSE" POIS AINDA NÃO HOUVE PALPITES:
        boolean correto = false;

        // INÍCIO DAS 10 TENTATIVAS PARA DESCOBRIR O NÚMERO:
        while (tentativas > 0) {
            System.out.print("Digite seu palpite: ");
            int palpite = leitor.nextInt();
            tentativas--;

            // DIZ AO CÓDIGO, QUE O USUÁRIO ACERTOU O NÚMERO:
            if (palpite == numeroAdivinhado) {
                correto = true;
                break;
            
                // AINDA POSSUI TENTATIVAS, COM DICAS EM RELAÇÃO AO ÚLTIMO PALPITE:    
            } else if (palpite < numeroAdivinhado) {
                System.out.println("O número secreto é maior.");
            } else {
                System.out.println("O número secreto é menor.");
            }
            
            // INFORMA AO USUÁRIO QUANTAS TENTATIVAS RESTAM:
            System.out.println("Tentativas restantes: " + tentativas);
        }

        // SE O USUÁRIO ACERTAR  OU ERRAR TODAS AS TENTATIVAS:
        if (correto) {
            System.out.println("Parabéns! Você acertou o número secreto.");
        } else {
            System.out.println("Suas tentativas acabaram. O número secreto era: " + numeroAdivinhado);
        }

        
        leitor.close();

    }
    
}
