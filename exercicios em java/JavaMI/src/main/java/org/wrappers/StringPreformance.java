package org.wrappers;

public class StringPreformance {
    public static void main(String[] args) {
    //tempo de execução
       long inicio = System.currentTimeMillis();//tempo em milisegundo
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+ (fim - inicio) + "ms");


        long inicio2 = System.currentTimeMillis();//tempo em milisegundo
        concatStringB(100000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder "+ (fim2 - inicio2) + "ms");



        long inicio3 = System.currentTimeMillis();//tempo em milisegundo
        concatStringBF(100000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer "+ (fim3 - inicio3) + "ms");
    }

    public static void concatString(int tamanho){
        String texto =  "";
        for (int i = 0; i < tamanho; i++){
            texto += 1;
        }
    }

    public static void concatStringB(int tamanho){
        StringBuilder texto =  new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++){
            texto.append(i);
        }
    }

    public static void concatStringBF(int tamanho){
        StringBuffer texto =  new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++){
            texto.append(i);
        }
    }







}
