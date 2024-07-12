package m04_programacao_estruturada.A05_for;

public class E01_somador {
    
    public static void main(String[] args) {
        
        int contador = 1, somador = 0;

        while(contador <=15){

            //somador = somador + contador;
            somador+=contador;

            contador++;
        }
        System.out.println(somador);
    }
}
