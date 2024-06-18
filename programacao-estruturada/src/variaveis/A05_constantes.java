package variaveis;

import java.util.Scanner;

public class A05_constantes {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);

        final double TAXA_ANUAL_DE_FINANCIAMENTO = scan.nextDouble();

        final double PI = 3.14;

        scan.close();

       System.out.println(TAXA_ANUAL_DE_FINANCIAMENTO);

       System.out.println(PI);
    }
}
