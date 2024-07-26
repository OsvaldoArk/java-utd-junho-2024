import java.math.BigDecimal;

public interface Discontos {
    public BigDecimal valeAlimentacao(BigDecimal salario);

    public BigDecimal fgts(BigDecimal salario);

    public BigDecimal impostoDeRenda(BigDecimal salario);
}
