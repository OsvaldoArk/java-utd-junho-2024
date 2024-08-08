package m07_revisao;
import java.util.Arrays;
import java.util.List;

public class E02_listaNomes {
    
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ben", "Jafar", "Matt", "Priya", "Brian");

        nomes.stream().forEach(nome -> System.out.println(nome));

        nomes.stream().forEach(System.out::println);
    }
}
