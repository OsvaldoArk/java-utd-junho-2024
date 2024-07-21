package m04_programacao_estruturada.A06_exercicios;

public class E01_somaAteCem {
    
    public static void main(String[] args) {
        
        double somador = 0;
        //1 + 1/2 + 1/3 + 1/4 + .... + 1/100
        for(double cont = 1; cont<=100;cont++){
            somador+=1/cont;
        }

        System.out.println(somador);
    }
}
