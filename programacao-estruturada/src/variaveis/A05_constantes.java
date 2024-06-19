package variaveis;

import java.util.Scanner;

public class A05_constantes {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);

        final double TAXA_ANUAL_DE_FINANCIAMENTO = scan.nextDouble();

        //minha mudança. 
        final double PI = 3.14;

        final double AVOGRADO = 6.02 * Math.pow(10,23);

        final double GRAVIDADE_NA_TERRA = 9.8;

        scan.close();

       System.out.println(TAXA_ANUAL_DE_FINANCIAMENTO);

       System.out.println(PI);
    }
}
