package m05_orientacaoaobjeto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {
    
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private Boolean ativo;

    {
        this.ativo = true;
    }

    public Pessoa(){}

    public Pessoa(Long id,String nome,LocalDate dataNascimento){
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDataNascimento(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        return this.dataNascimento.format(dtf);
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public Boolean isAtivo(){
        return this.ativo;
    }

    public void setAtivo(Boolean ativo){
        this.ativo = ativo;
    }

    public abstract String toString();
}
