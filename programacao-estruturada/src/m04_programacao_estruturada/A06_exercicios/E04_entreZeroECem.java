package m04_programacao_estruturada.A06_exercicios;

public class E04_entreZeroECem {
    
    public static void main(String[] args) {
        
        int[] numeros = {37,7,-23,-33,32,100,105,59,73,69,172,17,-50,27,84,129,-67,71,3,13};

        int[] resposta = new int[numeros.length];

        int indice = 0, contador = 0, contadorResposta = 0;

        while(indice < numeros.length){

            if(numeros[indice]>= 0 && numeros[indice] <= 100){
                contador++;
                resposta[contadorResposta] = numeros[indice];
                contadorResposta++;
            }
            
            System.out.println(numeros[indice]);
 
            indice++;
        }

        System.out.printf("Existem %d números entre 0 e 100\n",contador);
        System.out.printf("Existem %d números que não estão entre 0 e 100\n",numeros.length - contador);

        for(int numero : resposta){
            if(numero > 0)
                System.out.print(numero+" ");
        }

        System.out.println();
    }
}
