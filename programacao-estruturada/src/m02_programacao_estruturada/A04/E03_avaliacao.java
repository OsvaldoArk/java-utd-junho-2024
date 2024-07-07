package m02_programacao_estruturada.A04;

import java.util.Scanner;

public class E03_avaliacao {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String avaliacao = "";

        System.out.println("Quantas questões você acertou?");
        int acertos = scan.nextInt();

        avaliacao = acertos >= 1 && acertos <=3 ? "RUIM" : avaliacao;
        avaliacao = acertos >= 4 && acertos <=6 ? "REGULAR" : avaliacao;
        avaliacao = acertos >= 7 && acertos <=12 ? "BOM" : avaliacao;
        avaliacao = acertos >= 13 && acertos <=15 ? "ÓTIMO" : avaliacao;

        System.out.println("RESULTADO: "+avaliacao);

        scan.close();
    }
}
