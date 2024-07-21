package m04_programacao_estruturada.A06_exercicios;

public class E02_fibonacci {
    
    public static void main(String[] args) {
        //1 1 2 3 5 8 13 21 34 55
        int a = 1, b = 0, c = 0, contador = 1;

        while(contador <= 10){
            c = a + b;
            a = b;
            b = c;

            contador++;

            System.out.println(c);
        }
    }
}
