package m07_revisao;

import java.util.Arrays;
import java.util.List;

public class E03_projetandoIds {
    
    public static void main(String[] args) {
        
        List<Filme> filmes = Arrays.asList(
            new Filme(70111470L
                ,"Die Hard"
                ,"http://cdn-0.nflximg.com/images/2891/DieHard.jpg"
                ,"http://api.netflix.com/catalog/titles/movies/70111470"
                ,4
                ,new BookMark(432534L, "65876586")),
            
            new Filme(654356453L,
                "Bad Boys"
                ,"http://cdn-0.nflximg.com/images/2891/BadBoys.jpg"
                ,"http://api.netflix.com/catalog/titles/movies/70111470"
                ,5
                ,null)
        );

        filmes.stream()
              .map(filme -> new IdTitulo(filme.id(), filme.title()))
              .forEach(System.out::println);

        


    }
}
