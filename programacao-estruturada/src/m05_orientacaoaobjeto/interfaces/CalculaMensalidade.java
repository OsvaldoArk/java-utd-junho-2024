package m05_orientacaoaobjeto.interfaces;

public interface CalculaMensalidade {
    
    public double mensalidade(int faixa);

    public double atrasoPagamento(int dias);

    public double calculoMatricular(int faixa);
}
