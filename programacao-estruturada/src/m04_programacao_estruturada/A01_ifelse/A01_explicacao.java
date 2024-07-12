package m04_programacao_estruturada.A01_ifelse;

public class A01_explicacao {
    
    public static void main(String[] args) {
        int x = 0;


        if(x==0){
            System.out.printf("%d é nulo.\n",x);
        }
        else if(x > 0){
            System.out.printf("%d é positivo.\n",x);
        }
        else{
            System.out.printf("%d é negativo.\n",x);
        }
    }
}
