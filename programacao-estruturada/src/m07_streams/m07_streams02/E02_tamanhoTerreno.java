package m07_streams02;

import java.util.Arrays;
import java.util.List;

public class E02_tamanhoTerreno {
    
    public static void main(String[] args) {
        List<Terreno> terrenos = Arrays.asList(
            new Terreno(10.0,20.0),
            new Terreno(2.0,4.0),
            new Terreno(1.0,1.0),
            new Terreno(50.0,50.0)
        );

        Double resultado = terrenos.stream()
                                   .map(terreno -> terreno.largura() * terreno.comprimento())
                                   .reduce(0.0,(total, area) -> total+=area);

        System.out.println(resultado);
    }
}
