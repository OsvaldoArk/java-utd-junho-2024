import java.math.BigDecimal;

public interface Descontos {
    public BigDecimal valeAlimentacao(BigDecimal salario);

    public BigDecimal fgts(BigDecimal salario);

    public BigDecimal impostoDeRenda(BigDecimal salario);
}
