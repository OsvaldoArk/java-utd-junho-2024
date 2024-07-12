package m04_programacao_estruturada.A01_ifelse;

import java.util.Scanner;

public class E04_aprovacao {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("digite a primeira nota");
        double nota01 = leitor.nextDouble();

        System.out.println("digite a segunda nota");
        double nota02 = leitor.nextDouble();

        double media = (nota01 + nota02) / 2;

        if(media >= 7.0 && media <= 10.0){
            System.out.println("o aluno foi aprovado com média: "+media);
        }
        else if(media >= 3.0 && media<7.0){

            System.out.println("Digite a nota da recuperação.");
            double recuperacao = leitor.nextDouble();

            double resultadoFinal = (media + recuperacao)/2;

            if(resultadoFinal >= 5.0 && resultadoFinal <=10.0){
                System.out.println("o aluno foi aprovado com média: "+resultadoFinal);
            }
            else if(resultadoFinal >= 0.0 && resultadoFinal <5.0){
                System.out.println("o aluno foi reprovado com média: "+resultadoFinal);
            }
            else{
                System.err.println("nota inválida");
            }
        }
        else if(media>= 0.0 && media<3){
            System.out.println("o aluno foi reprovado com média: "+media);
        }
        else{
            System.err.println("nota inválida");
        }

        leitor.close();
    }
}
