package m04_programacao_estruturada.A03_arrays;

public class A02_matrizes {
    
    public static void main(String[] args) {
        //int[] notas = new int[10];
        //int[][] quadroDeNotas = new int[10][3];
        //{{10,9,10},{10,9,9},{9,9,9},{10,8,8},{8,8,8},{9,8,7}};
        int[][] quadroPreenchido = {
                                    {10,9,10},
                                    {10,3,9},
                                    {9,9,9},
                                    {10,8,8,10,4,6,3,9},
                                    {8,8,8},
                                    {9,8,7}
                                    };

        quadroPreenchido[1][1] = 6;

        System.out.println(quadroPreenchido[3].length);

        System.out.println(quadroPreenchido[5][(quadroPreenchido[5].length-1)]);
    }
}
