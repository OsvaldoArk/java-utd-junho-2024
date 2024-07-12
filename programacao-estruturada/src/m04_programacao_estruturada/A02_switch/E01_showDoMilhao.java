package m04_programacao_estruturada.A02_switch;

import java.util.Scanner;

public class E01_showDoMilhao {
    
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas letras tem a palavra pneumoultramicroscopicossilicovulcanoconiótico");
        System.out.println("a - 30 b - 40 c - 46 d - 10 e - 38 ");

        char resposta = leitor.nextLine().charAt(0);

        switch(resposta) {
            case 'a':
            case 'b': System.out.println("resposta errada."); break;
            case 'c': System.out.println("resposta correta.");break;
            case 'd':
            case 'e': System.out.println("resposta errada."); break;
        
            default : System.out.println("resposta inválida.");
        }

        leitor.close();
    }
}
