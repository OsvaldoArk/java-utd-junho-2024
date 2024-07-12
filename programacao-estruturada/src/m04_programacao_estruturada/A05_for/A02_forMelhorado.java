package m04_programacao_estruturada.A05_for;

public class A02_forMelhorado {
    
    public static void main(String[] args) {
        
        //int[] notas = {10,8,6,10,5};

        String[] bandasDeRockNacional = {"Paralamas do Sucesso", "Skank", "Legião Urbana"};

        for(String banda : bandasDeRockNacional){
            System.out.println(banda);
        }
    }
}
