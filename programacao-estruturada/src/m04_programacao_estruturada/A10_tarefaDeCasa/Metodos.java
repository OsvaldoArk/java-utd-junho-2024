package m04_programacao_estruturada.A10_tarefaDeCasa;

import java.util.Map;
import java.util.TreeMap;

public class Metodos {
    
    public static double calculaMediaIdades(Object[][] matrix){

        int somaIdades = 0;

        for(int linha = 0; linha < matrix.length;linha++){

            for(int coluna = 0; coluna < matrix[linha].length; coluna++){
                if(coluna==1) 
                    somaIdades+=(int)matrix[linha][coluna];
            }
        }

        return somaIdades/(double)matrix.length;
    }

    public static TreeMap<Integer,String> rankingDosProdutos(Object[][] matrix){

        TreeMap<Integer,String> ranking = new TreeMap<>();

        int contA = 0, contB = 0, contC = 0;

        for(int linha = 0; linha < matrix.length;linha++){

            for(int coluna = 0; coluna < matrix[linha].length; coluna++){
                if(coluna==4 && matrix[linha][coluna].toString()=="a")
                    contA++;
                
                if(coluna==4 && matrix[linha][coluna].toString()=="b")
                    contB++;

                if(coluna==4 && matrix[linha][coluna].toString()=="c")
                    contC++;
            }
        }        

        ranking.put(contA, "A");
        ranking.put(contB, "B");
        ranking.put(contC, "C");

        for(Map.Entry<Integer,String> produto : ranking.entrySet()){
            System.out.println(produto.getValue()+" "+produto.getKey());
        }

        return ranking;
    }

    public static void calcularPorcentagemDosProdutos(TreeMap<Integer,String> produtos){

        double porcentagemA = 0,porcentagemB = 0, porcentagemC = 0;

        for(Map.Entry<Integer,String> produto : produtos.entrySet()){
           if( produto.getValue()== "A"){
                porcentagemA = produto.getKey() /(double) 11 * 100;
           } 
           
           if( produto.getValue()== "B"){
            porcentagemB = produto.getKey() /(double) 11 * 100;
           }     

           if( produto.getValue()== "C"){
            porcentagemC = produto.getKey() /(double) 11 * 100;
           } 
        }

        System.out.println(porcentagemA);
        System.out.println(porcentagemB);
        System.out.println(porcentagemC);
    }

    public static void porcentagemNivelSuperior(Object[][] matrix){

        int somaNivelSuperior = 0;

        for(int linha = 0; linha < matrix.length;linha++){

            for(int coluna = 0; coluna < matrix[linha].length; coluna++){

                if(coluna==3 && (boolean)matrix[linha][coluna]==true){
                    somaNivelSuperior++;     
                }
            }
        }

        // total * porcentagem / 100 = somaNivelSuperior;
        double porcentagemNS = somaNivelSuperior /(double) matrix.length * 100;

        System.out.println("possuí nível superior: "+porcentagemNS);

        System.out.println("Não possuí nível superior: "+(100-porcentagemNS));


    }
}

/*
 
        for(int linha = 0; linha < matrix.length;linha++){

            for(int coluna = 0; coluna < matrix[linha].length; coluna++){

            }
        }

 */
