package m05_orientacaoaobjeto.interfacesFuncionais;

public class TesteSmi {
    
    public static void main(String[] args) {
        
        Quadrado q =  x -> Math.pow(x, 2);

        Operacao soma = (x, y) -> {
            double resultado = Math.pow(x, 2) + 2 * x * y + Math.pow(y, 2);

            return resultado;
        };

        Operacao subtracao  = (int x, int y) -> x - y;

        Operacao multiplicacao = (x , y) -> x * y;

        Operacao divisao = (x,y) -> x / y;

        System.out.println(executar(soma, 20, 4));
        System.out.println(executar(subtracao, 20, 4));
        System.out.println(executar(multiplicacao, 20, 4));
        System.out.println(executar(divisao, 20, 4));
        System.out.println(executar((a,b)-> Math.pow(a, b), 2, 10));
        
        /*
        System.out.println(soma.calculo(10,5));
        System.out.println(subtracao.calculo(10, 5));
        System.out.println(multiplicacao.calculo(10, 5));
        System.out.println(divisao.calculo(10, 5));
        */
    }

    public static double executar(Operacao op, int a, int b){
        return op.calculo(a, b);
    }
}
