package m07_streams02;

import java.util.Arrays;
import java.util.List;

public class E01_palavrasGrandes {
    
    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("casa","cama","paralelepipedo","baú","congelador","pá","pneumoultramicroscopicossilicovulcanoconiótico");

        palavras.stream().filter(p -> p.length() < 6)
                         .forEach(p -> System.out.println(p+" - "+p.length()));



    }
}
