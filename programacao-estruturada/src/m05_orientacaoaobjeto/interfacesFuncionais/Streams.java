package m05_orientacaoaobjeto.interfacesFuncionais;

import java.util.Arrays;
import java.util.List;

public class Streams {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        List<Integer> resultado = numeros.stream().map( x -> (int) Math.pow(x, 2)).toList();

        numeros.stream().map(x -> (int) Math.pow(x, 2)).forEach(System.out::println);

        for(int numero : resultado){
            System.out.println(numero);
        }
    }
}
