package m04_programacao_estruturada.A07_projetoCaixaEletronico;

import javax.swing.JOptionPane;

public abstract class CaixaEletronico {
    
    public static Double saldo = 0.0;

    public static void deposito(Double valor){
        saldo+=valor;   
    }

    public static void saque(Double valor){
        if(valor>saldo){
            JOptionPane.showMessageDialog(null, "Você não tem saldo suficiente");
        }
        else{
            saldo-=valor;
        }
    }

    public static int mostraMenu(){        
        return Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma dentre as opções.\n1 - ver saldo\n2 - deposito\n3 - saque\n4 - encerrar programa"));
    }

    public static void imprimeSaldo(){
        JOptionPane.showMessageDialog(null,"O seu saldo é: "+saldo.toString());
    }

    public static Double pedeValor(String mensagem){
        return Double.parseDouble(JOptionPane.showInputDialog(null,mensagem));
    }

    public static void MensagemPadrao(String mensagem){
        JOptionPane.showMessageDialog(null,mensagem);
    }
}
