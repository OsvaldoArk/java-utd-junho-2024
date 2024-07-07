package m04_programacao_estruturada.A04_while;

public class A02_facaEnquanto {
    
    public static void main(String[] args) {
        
        int[] notas02 = {10,8,6,10,5};
        int cont = 0;

        do{
            System.out.println(notas02[cont]);

            cont++;
        }while(cont<notas02.length);
    }
}
