package m04_programacao_estruturada.A06_exercicios;

public class A01_funcaoRecursiva {
    
    public static void main(String[] args) {
        
        System.out.println(fatorialRecursivo(6));
    }
    //15 + 14 + 13 + 12 + 11 + 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0;
    public static int somaRecursiva(int numero){
        if(numero==0) return numero;

        return numero + somaRecursiva(numero-1);
    }
    //5 * 4 * 3 * 2 * 1
    public static int fatorialRecursivo(int numero){
        if(numero==1) return numero;

        return numero * fatorialRecursivo(numero-1);
    }
}
