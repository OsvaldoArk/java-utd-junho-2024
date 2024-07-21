package m04_programacao_estruturada.A10_tarefaDeCasa;

import java.util.TreeMap;

public class Teste {
    
    public static void main(String[] args) {
        
        Object[][] data = {
            { "ana", 24, 3000, true, "a", true, 250, true },
            { "lúcia", 35, 4200, false, "b", false, 0, true },
            { "carlos", 19, 1460, false, "a", true, 150, false },
            { "carla", 24, 1800, false, "c", true, 100, false },
            { "armando", 27, 0, true, "a", false, 0, false },
            { "jorge", 41, 3800, false, "c", false, 0, false },
            { "ronaldo", 50, 4000, true, "b", true, 400, true },
            { "sara", 42, 3200, true, "b", false, 0, true },
            { "arlindo", 32, 1950, true, "a", true, 200, false },
            { "livia", 18, 2400, false, "a", true, 140, false },
            { "evanilda", 27, 3000, false, "b", false, 0, false }
        };

        System.out.println(Metodos.calculaMediaIdades(data));

        TreeMap<Integer,String> ranking = Metodos.rankingDosProdutos(data);

        Metodos.calcularPorcentagemDosProdutos(ranking);

        Metodos.porcentagemNivelSuperior(data);
    }
}
