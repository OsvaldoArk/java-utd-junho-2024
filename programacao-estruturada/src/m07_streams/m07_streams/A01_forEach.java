package m07_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A01_forEach {
    
    public static void main(String[] args) {
        
        List<String> alunos = Arrays.asList("Amanda","Inácio","Helen","Zoe","Marcos","Lívia");
        
        List<String> resposta = new ArrayList<>();
   
        /*
        for(String aluno : alunos){
            System.out.println(aluno);
        }
    */
        alunos.stream().forEach(aluno -> {
            resposta.add(aluno);
        });
        
        System.out.println(resposta);
    }
}
