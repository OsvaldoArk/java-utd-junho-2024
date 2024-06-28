package m02_programacao_estruturada.A02;

import java.util.Scanner;

public class E03_licenca {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a idade do candidato");
        int idade = leitor.nextInt();

        boolean passouNaProva = false;

        String resultado = idade>=18 && !passouNaProva ?
                     "Está habilidado a dirigir" : "Não está habilitado a dirigir";

        System.out.println(resultado);

        leitor.close();
    }
}
