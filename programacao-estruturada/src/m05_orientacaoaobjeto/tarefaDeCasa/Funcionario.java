package m05_orientacaoaobjeto.tarefaDeCasa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import m05_orientacaoaobjeto.tarefaDeCasa.interfaces.Descontos;

public class Funcionario extends Pessoa implements Descontos{

    private BigDecimal salario;
    private String cargo;
    private LocalDate dataAdmissao;

    public Funcionario(Long id,String nome,LocalDate dataNascimento,BigDecimal salario,String cargo,LocalDate dataAdmissao){
        super(id, nome, dataNascimento);
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }

    public BigDecimal getSalario(){
        return salario;
    }

    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getDataAdmissao(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        return dataAdmissao.format(dtf);
    }

    public void setDataAdmissao(LocalDate dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

    @Override
    public BigDecimal valeAlimentacao() {
        
        return salario.multiply(BigDecimal.valueOf(0.04));
    }

    @Override
    public BigDecimal fgts() {

        return salario.multiply(BigDecimal.valueOf(0.08));
    }

    @Override
    public BigDecimal impostoDeRenda() {
        
        if(salario.doubleValue() <= 2259.20)
            return BigDecimal.ZERO;
        if(salario.doubleValue() >= 2259.21 && salario.doubleValue() <=2826.65)
            return salario.multiply(BigDecimal.valueOf(0.075));
        if(salario.doubleValue() >= 2826.66 && salario.doubleValue() <=3751.05)
            return salario.multiply(BigDecimal.valueOf(0.15));
        if(salario.doubleValue() >= 3751.06 && salario.doubleValue() <=4664.68)
            return salario.multiply(BigDecimal.valueOf(0.225));
        else
            return salario.multiply(BigDecimal.valueOf(0.275));
    }
}
