

import java.util.Scanner;




public class Metodos {
   Scanner s = new Scanner(System.in);
   static int numAleatório;
   Double Resposta;
   public Metodos(){}
    public static int gerarNumeroAleatorio(){

        numAleatório = (int)(Math.random() *100 +1);
        return numAleatório;
    }
}  



