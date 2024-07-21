package m04_programacao_estruturada.A08_exercicios;

public class E01_equacaoDoSegundoGrau {
    
    public static void main(String[] args) {

        int a = 4, b = 8, c = 6;

        double delta =  Math.pow(b, 2) - 4 * a * c;

        if(delta > 0){

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);

            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("A equação possuí duas raízes diferentes.");
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
        else if(delta == 0){

            double x = -b / (2 * a);

            System.out.println("A equação possuí duas raízes iguais.");
            System.out.println("x = "+x);
        }
        else if(delta < 0){

            System.out.println("A equação não possuí resolução no conjunto dos reais.");
        }

    }
}
