package m05_orientacaoaobjeto.tarefaDeCasa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import m05_orientacaoaobjeto.tarefaDeCasa.enums.StatusEnum;

public abstract class Pessoa {
    
    private static Integer populacao = 0;
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private StatusEnum status;
    private Boolean ativo;

    {
        this.ativo = true;
        status = StatusEnum.ATIVO;
        populacao++;
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

    public static void imprimePopulacao(){
        System.out.println(populacao);
    }

    public static void aumentaPopulacao(){
        populacao++;
    }

    public String getStatus(){
        return status.getDescricao();
    }

    public void setStatus(StatusEnum status){
        this.status = status;
    }

    public abstract String toString();
}
