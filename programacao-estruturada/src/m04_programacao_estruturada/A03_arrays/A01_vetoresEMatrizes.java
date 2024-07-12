package m04_programacao_estruturada.A03_arrays;

public class A01_vetoresEMatrizes {
    
    public static void main(String[] args) {
        //0..(n-1)
        //int[] notas = new int[10];
        //                      0  1 2 3 4  5  6 7 8  9
        int[] notasImbutidas = {10,8,2,9,10,10,7,5,10,7};

        notasImbutidas[9] = 3;

        System.out.println(notasImbutidas[(notasImbutidas.length-1)]);
    }
}
