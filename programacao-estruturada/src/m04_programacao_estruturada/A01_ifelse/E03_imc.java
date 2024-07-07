package m04_programacao_estruturada.A01_ifelse;

import java.util.Scanner;

public class E03_imc {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = leitor.nextDouble();

        System.out.println("Digite seu peso.");
        double peso = leitor.nextDouble();

        double imc = peso / Math.pow(altura,2);

        if(imc < 18.5){
            System.out.println("abaixo do peso");
        }
        else if(imc >= 18.5 && imc < 25){
            System.out.println("peso normal.");
        }
        else if(imc >= 25 && imc < 30){
            System.out.println("acima do peso");
        }
        else{
            System.out.println("obesidade");
        }

        leitor.close();
        int idade = 18;

        String categoria = (idade < 13) ? "Criança" 
        : (idade < 18) ? "Adolescente" 
        : (idade < 65) ? "Adulto" 
        : "Idoso";

        System.out.println(categoria);
    }
}
