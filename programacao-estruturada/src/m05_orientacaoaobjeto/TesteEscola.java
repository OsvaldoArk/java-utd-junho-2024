package m05_orientacaoaobjeto;

import java.time.LocalDate;
import java.time.Month;

public class TesteEscola {
    
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno();

        Aluno aluno02 = new Aluno(1L,"12346","André",LocalDate.of(1960, Month.APRIL, 1),"Clipper");

        aluno01.setMatricula("12345");
        aluno01.setNome("Luana");
        aluno01.setDataNascimento(LocalDate.of(2001, Month.JULY, 27));
        aluno01.setCurso("Java");

        System.out.println(aluno02.cancelarMatricula());

        System.out.println(aluno01);

        System.out.println(aluno02);
    }
}
