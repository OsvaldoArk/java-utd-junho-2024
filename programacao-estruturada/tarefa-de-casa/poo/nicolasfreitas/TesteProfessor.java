
import java.math.BigDecimal;
import java.time.LocalDate;

public class TesteProfessor {
    public static void main(String[] args) {
        Professor professor01 = new Professor();

        professor01.setNome("Carlos Augusto");
        professor01.setDataNascimento(LocalDate.of(1980, 04, 26));
        professor01.setSalario(new BigDecimal(2500));
        professor01.setCargo("Professor substituto");
        professor01.setDataAdmissao(LocalDate.of(2022, 05, 05));

        Disciplina historia = new Disciplina(1, "História", "Conhecendo o passado para entender o futuro\n");
        Disciplina filosofia = new Disciplina(2, "Filosofia", "Módulo acerca dos filósofos gregos\n");
        Disciplina biologia = new Disciplina(3, "Biologia", "Estudos em genética\n");

        professor01.addDisciplina(historia);
        professor01.addDisciplina(filosofia);
        professor01.addDisciplina(biologia);

        System.out.println(professor01);
        System.out.println("");
        System.out.println("Disciplinas do professor " + professor01.getNome());

        for (Disciplina disciplina : professor01.getListaDisciplinas()) {
            System.out.println(disciplina);
        }
    }
}
