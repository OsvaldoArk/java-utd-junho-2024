package m04_programacao_estruturada.A01_ifelse;

import java.util.Scanner;

public class E02_ordemDecrescente {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número.");
        int numero01 = leitor.nextInt();

        System.out.println("Digite o segundo número.");
        int numero02 = leitor.nextInt();

        System.out.println("Digite o terceiro número.");
        int numero03 = leitor.nextInt();

        if(numero01 > numero02){

            if(numero01 > numero03){

                if(numero02 > numero03){
                    System.out.printf("%d > %d > %d",numero01,numero02,numero03);
                }
                else{
                    System.out.printf("%d > %d > %d",numero01,numero03,numero02);
                }
            }else{
                System.out.printf("%d > %d > %d",numero03,numero01,numero02);
            }
        }
        else if(numero03 > numero01){

            if(numero03 > numero02){
                System.out.printf("%d > %d > %d",numero03,numero02,numero01);
            }
            else{
                System.out.printf("%d > %d > %d",numero02,numero03,numero01);
            }
        }
        else{

            if(numero02 > numero03){
                
                System.out.printf("%d > %d > %d",numero02,numero01,numero03);
            }
        }
        leitor.close();
    }
}
