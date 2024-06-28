package m02_programacao_estruturada.A01;

public class E01_separandoOsNumeros {
    
    public static void main(String[] args) {
        
        int numeroQualquer = 74;

        int unidade = numeroQualquer % 10;

        int dezena = (numeroQualquer % 100)/10;

        int centena = numeroQualquer /100;


        System.out.printf("centena : %d\ndezena: %d\nunidade: %d\n",centena,dezena,unidade);
    }
}
