package m05_orientacaoaobjeto.tarefaDeCasa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Professor extends Funcionario{
    
    private List<Disciplina> disciplinas;
    private String telefone;

    public Professor(Long id,String nome,LocalDate dataNascimento, BigDecimal salario,String cargo,LocalDate dataAdmissao,String telefone, List<Disciplina> disciplinas){
        super(id, nome, dataNascimento,salario,cargo,dataAdmissao);
        this.telefone = telefone;
        this.disciplinas = disciplinas;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getDisciplinas(){
        String resultado = "";

        for(Disciplina disciplina : disciplinas){
            resultado+=" "+disciplina.toString();
        }

        return resultado;
    }

    public void setLista(List<Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }

    public String toString(){
        return "Professor: id: "+getId()+", nome: "+getNome()+", data de nascimento: "+getDataNascimento()
                +", cargo: "+getCargo()+", salário:"+getSalario()+", telefone: "+getTelefone()+", status: "+getStatus()+", data de admissão: "+getDataAdmissao()+", disciplinas: "+getDisciplinas();
    }
}
