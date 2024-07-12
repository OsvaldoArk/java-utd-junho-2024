
import java.util.Scanner;

public class AlexDesafio{
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int numeroAleatorio = (int) ((Math.random() *100) + 1);
        
        System.out.println("Olá, seja bem-vindo ao jogo do Adivinha. Você tem 10 chances para adivinhar um número aleatório entre 1 e 100. Boa sorte!");
        
        for(int contador = 10; contador >= 0; contador--){
            if(contador == 0){
                System.out.println("Você esgotou suas chances. Obrigado por participar.");
                break;
            }

            System.out.println("Digite seu palpite");
            int palpite = leitor.nextInt(); 
            
            
            if(palpite == numeroAleatorio){
                System.out.printf("Parabéns, voce acertou! o número %d%n", numeroAleatorio);
                break;
            }
            else{
                if(palpite > numeroAleatorio){
                    System.out.println("Tente novamente! O número que você procura é menor que " + palpite + " Agora você tem " + (contador - 1) + " Tentaivas");
                }
                else if(palpite < numeroAleatorio){
                    System.out.println("Tente novamente! O número que você procura é maior que " + palpite + " Agora você tem " + (contador - 1) + " Tentaivas");                   
                }
            }
            
        }


    }

}