import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa implements Descontos {
    private BigDecimal salario;
    private String cargo;
    private LocalDate dataAdmissao;

    public Funcionario() {
    }

    public Funcionario(
            String nome,
            LocalDate dataNascimento,
            BigDecimal salario,
            String cargo,
            LocalDate dataAdmissao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }

    public BigDecimal getSalario() {
        return this.salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        DateTimeFormatter padraoBR = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        return this.dataAdmissao.format(padraoBR);
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public BigDecimal valeAlimentacao(BigDecimal salario) {
        BigDecimal valorDoVA = new BigDecimal(800);

        return salario.subtract(valorDoVA);
    }

    @Override
    public BigDecimal fgts(BigDecimal salario) {
        return salario.multiply(new BigDecimal(0.08)).setScale(2, RoundingMode.FLOOR);
    }

    @Override
    public BigDecimal impostoDeRenda(BigDecimal salario) {
        BigDecimal taxa;

        if (salario.compareTo(new BigDecimal(2112.00)) <= 0) {
            taxa = BigDecimal.ZERO;
        } else if (salario.compareTo(new BigDecimal(2826.65)) <= 0) {
            taxa = salario.multiply(new BigDecimal(0.075)).subtract(new BigDecimal(158.40));
        } else if (salario.compareTo(new BigDecimal(3751.05)) <= 0) {
            taxa = salario.multiply(new BigDecimal(0.15)).subtract(new BigDecimal(370.40));
        } else if (salario.compareTo(new BigDecimal(4664.68)) <= 0) {
            taxa = salario.multiply(new BigDecimal(0.225)).subtract(new BigDecimal(651.73));
        } else {
            taxa = salario.multiply(new BigDecimal(0.275)).subtract(new BigDecimal(884.96));
        }

        return taxa.setScale(2, RoundingMode.FLOOR);
    }

    @Override
    public String toString() {
        return ("\n" + "\nNome do funcionário: " + getNome() + "\nData de nascimento: " + getDataNascimento()
                + "\nSalario: R$ " + getSalario() + "\nCargo: " + getCargo() + "\nData de admissão: "
                + getDataAdmissao() + "\nSalário com desconto do VA: R$ " + valeAlimentacao(salario)
                + "\nDesconto FGTS: R$ " + fgts(salario) + "\nDesconto do Imposto de Renda: R$ "
                + impostoDeRenda(salario));
    }
}