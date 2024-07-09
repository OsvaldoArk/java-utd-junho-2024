import java.util.Scanner;
import java.util.Random;

public class Miguel
{
    public static void main(String args[])
    {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();
        
        int numeroSecreto = rand.nextInt(100) + 1;
        boolean acertou = false;
        
        for (int i = 0; i < 10; i++)
        {
            if (!acertou)
            {
                System.out.printf("Restam %d tentativas! Chute um número: ", 10 - i);
                int numeroUsuario = ler.nextInt();
                
                if (numeroUsuario == numeroSecreto)
                { 
                    System.out.println("\nVocê acertou o número!");
                    acertou = true;
                }
                
                else if (numeroUsuario < numeroSecreto)
                { System.out.println("\nO número secreto é maior!"); }
                
                else
                { System.out.println("\nO número secreto é menor!"); }
            }
        }
        
        if (!acertou)
        { System.out.println("\n\nQue pena! Esgotaram as tentativas! :("); }
    }
}
