import java.util.Scanner;

public class Teste {
    Metodos metodos = new Metodos();
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner s = new Scanner(System.in);
        int numeroOculto = metodos.gerarNumeroAleatorio();
        int tentativas;
        int contador = 1;
        int acertos = 0;


        System.out.println("bem vindo Usuário: A seguir temos um desafio");
        System.out.println("você deve acertar um número aleatório de 0 a 100 em 10 tentativas");
        for (contador = 9 ; contador >= 0; contador--) {
            System.out.println("digite a seguir sua Tentativa");
            tentativas = s.nextInt();
            if (tentativas == numeroOculto) {
                System.out.println("Parabéns Jogador, você acertou o numero secreto");
                contador++;
                System.out.println("agora você tem que adivinhar um novo numero");
                numeroOculto = metodos.gerarNumeroAleatorio();
                acertos++;            
            }else{
            System.out.println("você errou jogador mas não desanime você possui ainda "+(contador--)+" tentativas");
                contador++;
            }
          
        }
        if (acertos>=1) {
            System.out.println("parabéns jovem. você acertou "+acertos+"vezes");            
        }else{System.out.println("Please Insert a Coin to continue"); }
        
    }
}


