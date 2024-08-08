package m07_streams02;

import java.util.Arrays;
import java.util.List;

public class Filters {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,3,5,6,8,9,10,12,15,16,18,20,21,24,27,28,30,60);

        numeros.stream().filter(x ->x % 3 == 0 && x % 4 == 0).forEach(System.out::println);
    }
}
