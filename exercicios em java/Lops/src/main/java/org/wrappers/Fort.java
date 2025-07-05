package org.wrappers;

public class Fort {
    public static void main(String[] args) {
        int contador = 1;
        do {

            if (contador % 2 == 0){
                System.out.println("contando " + contador);
            }
            contador+=1;

        }while (contador <= 1000);
    }
}
