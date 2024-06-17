package variaveis;

import java.util.Scanner;

public class A04_comandosDeEntrada {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome = leitor.nextLine();
        int idade = leitor.nextInt();
        float altura = leitor.nextFloat();
        double peso = leitor.nextDouble();
        String tipoSanguineo = leitor.next();
        char fatorRh= leitor.next().charAt(0);

        leitor.close();

        System.out.printf("o rato roeu a roupa do rei de roma que se chamava %s\n",nome);
        System.out.printf("idade: %d\n",idade);
        System.out.printf("altura: %.2f\n",altura);
        System.out.printf("peso: %.2f\n",peso);
        System.out.printf("tipo sanguíneo: %s%c\n",tipoSanguineo,fatorRh);
    }
}
