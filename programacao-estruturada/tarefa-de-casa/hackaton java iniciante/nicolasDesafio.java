import java.util.Scanner;

public class nicolasDesafio {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int randnumero = (int) ((Math.random() *100 ) + 1);
        int palpite = 0;
        System.out.println("Olá,esse é o jogo do Advinha,você possui 10 tentativas para advinhar um número aleatório entre 1 e 100. ");

        for(int cont = 0;cont <= 10;cont++){    
            if (cont > 9){
                System.out.println("Nenhuma tentativa restante!");
                break;
                
            }
            System.out.println("Digite seu palpite:");
            palpite = leitor.nextInt();
            if (cont < 9) {
                
            
                if (palpite > randnumero) {
                System.out.println("Tente Novamente.O número que você procura é menor que "+palpite+" Você possui: "+ (10 - (cont+1))+" tentativas.");      
            }
            else if (palpite < randnumero) {
                System.out.println("Tente Novamente.O número que você procura é maior que "+palpite+" Você possui: "+ (10 - (cont+1))+" tentativas.");
            }
            else{
                System.out.println("Parabéns! Você advinhou o número sorteado que é: " +randnumero);
                break;        
            }
        }
     }
        leitor.close();
    }
}
