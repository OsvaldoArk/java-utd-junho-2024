package m07_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A01_map {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(2,4,6,8,10,12);

        List<Double> quadrados = numeros.stream()
                                        .map(numero -> Math.pow(numero, 2))
                                        .collect(Collectors.toList());

       // quadrados.stream().forEach(System.out::println);

       numeros.stream().map(A01_map::mudaNumero)
                        .forEach(System.out::println);
    }

    public static Integer mudaNumero(int numero){

        numero*=2;

        numero+=100;

        numero/=4;

        return numero;
    }
}
