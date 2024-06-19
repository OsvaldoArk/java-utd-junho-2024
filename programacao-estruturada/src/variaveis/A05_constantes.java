package variaveis;

import java.util.Scanner;

public class A05_constantes {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);

        final double TAXA_ANUAL_DE_FINANCIAMENTO = scan.nextDouble();

        //mudança do colega ( o pivô do conflito )
        final double PI = 9.1;

        scan.close();

       System.out.println(TAXA_ANUAL_DE_FINANCIAMENTO);

       System.out.println(PI);
    }
}
