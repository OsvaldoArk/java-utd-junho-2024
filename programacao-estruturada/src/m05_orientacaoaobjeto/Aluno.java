package m05_orientacaoaobjeto;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    
    private String matricula;
    private String curso;

    public Aluno(){
    }

    public Aluno(Long id,String matricula, String nome, LocalDate dataNascimento,String curso){
        
        super(id, nome, dataNascimento);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome(){
        return getMatricula()+" "+super.getNome();
    }

    //público acessar >> String 
    public String getMatricula(){
       return matricula;
    }

    //público modificar
    public void setMatricula(String matricula){

        this.matricula = matricula;
    }

    public String getCurso(){
        return this.curso;
    }    

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String cancelarMatricula(){
        setAtivo(false);

        return "Cancelamento realizado com sucesso";
    }

    public String toString(){
        return "Aluno(a): matricula: "+getMatricula()+", nome: "+getNome()+", data de nascimento: "+
        getDataNascimento()+", curso: "+getCurso()+" situação:"+isAtivo();
    }

}
