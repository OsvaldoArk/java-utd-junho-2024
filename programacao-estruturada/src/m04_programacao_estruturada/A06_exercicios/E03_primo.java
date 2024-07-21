package m04_programacao_estruturada.A06_exercicios;

public class E03_primo {
    
    public static void main(String[] args) {
        
        int numero = 97,divisor = 1,contador = 0;

        while(divisor <= numero){

            if(numero % divisor == 0) 
                contador++;

            divisor++;
        }

        if(contador == 2){
            System.out.printf("o número %d é primo, pois tem %d divisores\n",numero,contador);
        }
        else{
            System.out.printf("o número %d não é primo, pois tem %d divisores\n",numero,contador);
        }

    }
}
