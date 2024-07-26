import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private List<Disciplina> listaDisciplinas = new ArrayList<>();

    public Professor() {
    }

    public Professor(
            List<Disciplina> listaDisciplinas,
            String nome,
            LocalDate dataNascimento,
            BigDecimal salario,
            String cargo,
            LocalDate dataAdmissao) {
        super(nome, dataNascimento, salario, cargo, dataAdmissao);

        this.listaDisciplinas = listaDisciplinas;
    }

    public List<Disciplina> getListaDisciplinas() {
        return this.listaDisciplinas;
    }

    public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = new ArrayList<>(listaDisciplinas);
    }

    public void addDisciplina(Disciplina disciplina) {
        this.listaDisciplinas.add(disciplina);
    }
}
