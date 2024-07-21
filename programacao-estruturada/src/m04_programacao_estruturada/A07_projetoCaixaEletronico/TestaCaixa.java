package m04_programacao_estruturada.A07_projetoCaixaEletronico;

public class TestaCaixa {
    
    public static void main(String[] args) {
        
        boolean ativo = true;
        int opcao = 0;
        double valor = 0;

        while(ativo){

            opcao = CaixaEletronico.mostraMenu();
            
            switch (opcao) {
                case 1: 
                
                    CaixaEletronico.imprimeSaldo();
                    break;

                case 2: 
                    
                    valor = CaixaEletronico.pedeValor("Digite o valor a ser depositado.");
                    
                    CaixaEletronico.deposito(valor);
                    break;

                case 3: 
                
                    valor = CaixaEletronico.pedeValor("Digite o valor a ser sacado"); 
                    
                    CaixaEletronico.saque(valor);
                    break;
                
                case 4: ativo = false;                 
                    break;

                default: CaixaEletronico.MensagemPadrao("Opção inválida.");
            }
        }
    }
}
