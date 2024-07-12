package m02_programacao_estruturada.A04;

import java.util.Scanner;

public class E04_conversoDeEscalasTermicas {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor a ser convertido para Celsius!");
        double temperaturaFahrenheigt = leitor.nextDouble();

        double temperaturaCelsius = (temperaturaFahrenheigt - 32)*(5.0/9.0);

        double temperaturacelsius = (temperaturaFahrenheigt - 32)*(5/9);

        System.out.println(temperaturaCelsius);
        System.out.println(temperaturacelsius);

        leitor.close();
    }
}
