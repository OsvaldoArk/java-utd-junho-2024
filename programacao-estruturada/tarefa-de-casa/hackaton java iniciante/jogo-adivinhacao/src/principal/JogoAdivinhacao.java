package principal;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
        int tentativas = 10;
        int palpite;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.\n");
        System.out.println("Você tem 10 tentativas.");

        while (tentativas > 0) {
            System.out.printf("Tentativa %d. Qual é o seu palpite? ", 11 - tentativas);
            palpite = scanner.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("Dica: O número secreto é maior que " + palpite + ".");
            } else if (palpite > numeroSecreto) {
                System.out.println("Dica: O número secreto é menor que " + palpite + ".");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto \n" + numeroSecreto + ".");
                return; // Encerra o jogo
            }

            tentativas--;
            if (tentativas > 0) {
                System.out.println("Tentativas restantes: " + tentativas);
            }
        }

        System.out.println("Suas tentativas acabaram. O número secreto era " + numeroSecreto + ".");
    }
}
