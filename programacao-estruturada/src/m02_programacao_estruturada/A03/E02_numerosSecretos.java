package m02_programacao_estruturada.A03;

import java.util.Scanner;

public class E02_numerosSecretos {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int nS01 =(int) Math.round(Math.random()*5)+1;
        int nS02 =(int) Math.round(Math.random()*5)+1;
        int nS03 =(int) Math.round(Math.random()*5)+1;
        int nS04 =(int) Math.round(Math.random()*5)+1;

        int contador = 0;

        System.out.println("Digite o primeiro palpite");
        int palpite01 = leitor.nextInt();

        contador = verificaNumeroSecreto(nS01, nS02, nS03, nS04, contador, palpite01);

        System.out.println("Digite o segundo palpite");
        int palpite02 = leitor.nextInt();

        contador = verificaNumeroSecreto(nS01, nS02, nS03, nS04, contador, palpite02);

        System.out.println("Digite o terceiro palpite");
        int palpite03 = leitor.nextInt();

        contador = verificaNumeroSecreto(nS01, nS02, nS03, nS04, contador, palpite03);

        System.out.println("Digite o quarto palpite");
        int palpite04 = leitor.nextInt();

        contador = verificaNumeroSecreto(nS01, nS02, nS03, nS04, contador, palpite04);

        System.out.println(nS01+" "+nS02+" "+nS03+" "+nS04);
        System.out.println(palpite01+" "+palpite02+" "+palpite03+" "+palpite04);
        System.out.println("acertos: "+contador);

        leitor.close();
    }

    public static int verificaNumeroSecreto
            (int ns01,int ns02,int ns03,int ns04,int contador,int palpite){
        contador = palpite == ns01 ? contador+1 : contador;
        contador = palpite == ns02 ? contador+1 : contador;
        contador = palpite == ns03 ? contador+1 : contador;
        contador = palpite == ns04 ? contador+1 : contador;
        
        return contador;
    }
}

