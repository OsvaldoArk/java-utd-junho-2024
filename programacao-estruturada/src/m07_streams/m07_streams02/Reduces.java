package m07_streams02;

import java.util.Arrays;
import java.util.List;

public class Reduces {
    
    public static void main(String[] args) {
        

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

       int resultado = numeros.stream().reduce((total,numero)-> total+=numero).orElse(0) / numeros.size();

       System.out.println(resultado);

    }
}
