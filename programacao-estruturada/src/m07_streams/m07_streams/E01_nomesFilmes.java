package m07_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E01_nomesFilmes {
    
    public static void main(String[] args) {
        
        List<Filme> filmes = Arrays
                            .asList(new Filme("Bastardos Inglorios", 2009),
                                    new Filme("Pulp Fiction",1994),
                                    new Filme("Kill Bill",2004),
                                    new Filme("Sin City",2005),
                                    new Filme("Django Livre",2012));
        /*
        List<String> nomesFilmes = filmes.stream()
                                         .map(filme -> filme.nome())
                                         .collect(Collectors.toList());

        nomesFilmes.stream().forEach(System.out::println);
        */

        filmes.stream().map(filme -> filme.nome())
                        .forEach(nome ->{ System.out.println(nome);});
    }


}


