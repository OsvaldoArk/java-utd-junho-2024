package revisao;

import javax.swing.JOptionPane;

/*
 * Programa de revisão do módulo 01
 * 
 * autor: Osvaldo Souza
 * data 22/06/2024
 */
public class R01_tiposPrimitivos{

    public static void main(String[] args) {
        //Descrição do produto
        String descricao = "arroz";
        int quantidade = 3;
        double preco = 5.2;
        boolean valido = true;
        char tipo = 'A';

        JOptionPane.showMessageDialog(null, "Descrição: "+descricao+"\nquantidade:"+
        +quantidade+"\npreço: "+preco+"\nválido: "+valido+"\ntipo: "+tipo);

    }
}