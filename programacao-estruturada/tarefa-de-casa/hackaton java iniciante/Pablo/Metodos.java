

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
   

    public static void contadorTentativas(){
        for (int tentativas = 10; tentativas >= 0; tentativas--){
            if (tentativas == 0) {
                System.out.println("você esgotou suas tentativas");
                         
           
            }else{
                System.out.println("você possui mais "+(10 - tentativas));
                }
                }
    }
   
    
   }



