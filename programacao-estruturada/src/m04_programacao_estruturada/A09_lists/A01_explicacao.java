package m04_programacao_estruturada.A09_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class A01_explicacao {
    
    public static void main(String[] args) {
        
    LinkedList<Integer> notas = new LinkedList<>();

    notas.add(9);
    notas.add(5);
    notas.add(10);
    notas.add(7);
    notas.set(notas.indexOf(5), 8);
    notas.add(1, 10);
    
    notas.sort(null);

    System.out.println(notas.contains(7));

    System.out.println(notas.addAll(notas));

    System.out.println("----------------------------");

    for(int indice = 0; indice < notas.size(); indice++){
        System.out.println(notas.get(indice));
    }
    /*
    for(int nota : notas){
        System.out.println(nota);
    }
    */
    //notas.stream().forEach(x -> System.out.println(x));
    //System.out.println(notas.size());
    //System.out.println(notas.isEmpty());

    }
}
