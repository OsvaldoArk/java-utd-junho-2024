package m04_programacao_estruturada.A04_while;

public class A01_explicacao {
    
    public static void main(String[] args) {
        //int[] notas = {8,8,8,8,8,7,7,8,7,8,9,9,8,7,8,9,10,10,10,10,7,8,9,10};

        int[] notas02 = {10,8,6,10,5};

        imprimeArray(notas02);
    }

    public static void imprimeArray(int[] numeros){

        int contador = 0;

        while(contador<numeros.length){
            System.out.print(numeros[contador]+" ");
            
            contador++;
        }
    }
}
