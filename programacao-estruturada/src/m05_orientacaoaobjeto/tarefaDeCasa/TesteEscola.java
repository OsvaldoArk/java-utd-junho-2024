package m05_orientacaoaobjeto.tarefaDeCasa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class TesteEscola {
    
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno();

        Aluno aluno02 = new Aluno(1L,"12346","André",LocalDate.of(1960, Month.APRIL, 1),"Clipper");

        //Aluno aluno03 = new Aluno();

        Professor professor = new Professor(9l,"Larissa",LocalDate.of(1991, Month.DECEMBER, 3),BigDecimal.valueOf(3600),"Professor",LocalDate.of(2019, Month.OCTOBER, 12),"8599988776655",Arrays.asList(new Disciplina(1L,"Java"), new Disciplina(2L, "Javascript")));

        aluno01.setMatricula("12345");
        aluno01.setNome("Luana");
        aluno01.setDataNascimento(LocalDate.of(2001, Month.JULY, 27));
        aluno01.setCurso("Java");

        //System.out.println(aluno02.cancelarMatricula());

        //System.out.println(aluno01.getStatus());

        //System.out.println(aluno02);

       // Pessoa.aumentaPopulacao();

        Pessoa.imprimePopulacao();

        System.out.println(professor.fgts());
    }
}
