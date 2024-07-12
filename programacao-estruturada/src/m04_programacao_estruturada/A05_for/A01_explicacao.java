package m04_programacao_estruturada.A05_for;

public class A01_explicacao {
    
    public static void main(String[] args) {
        
        int[] notas = {10,8,6,10,5};

        for(int contador = 0;contador < notas.length;contador++){
            
            System.out.print(notas[contador]+" ");
        }
        System.out.println();

        for(int contador = notas.length - 1;contador >= 0;contador--){
            
            System.out.print(notas[contador]+" ");
        }
        System.out.println();
    }
}
