package m02_programacao_estruturada.A01;

public class A01_operadores {
    
    public static void main(String[] args) {
        //exemplo de operador de atribuíção.
        //String nome = "Osvaldo";

        int idade = 37;

        //operadores aritméticos: + - * / %

        int diferenca = 2038 - 2024;

        int resultado = idade + diferenca;

        System.out.println("a minha idade em 2038 é de: "+resultado);

        double mediaDoAlunoNoCurso = (10 + 6 + 4 + 8)/ 4;

        System.out.println(mediaDoAlunoNoCurso);

        //Operadores relacionais: > < >= <= == !=
        int idadeOsvaldo = 37;
        //double idadePrecisa = 36.6;
        long idadeLong = 38L;
        //int idadeCarlos = 26;

        System.out.println(idadeOsvaldo > idadeLong);
        //System.out.println(nome.equalsIgnoreCase("osvaldo"));

        //Operador lógico && & || | ^
        //System.out.println(false&false);
        //System.out.println(false&&true);
        //System.out.println(true&&false);
        //System.out.println(true&&true);

        //System.out.println(false||false);
        //System.out.println(false||true);
        //System.out.println(true|false);
        //System.out.println(true||true);

        //System.out.println(false^false);
        //System.out.println(false^true);
        //System.out.println(true^false);
        //System.out.println(true^true);

        //operador ternário: se(condição)?"verdadeiro":"falso
        
        
    }
}
