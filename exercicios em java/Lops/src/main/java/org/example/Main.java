package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /* ArrayList<String> exemploFor = new ArrayList<>();

        for (int numero = 10; exemploFor.size() < numero; exemploFor.add("Ola, mundo!")) {
            System.out.println(exemploFor);
            }
        */


            String[] nomes = new String[10];

            nomes[0] = "wesley";
            nomes[1] = "Feliz";
            nomes[2] = "dinheiro";


        /*
        for (int nem = 0; nem < nomes.length; nem++) {
            System.out.println(nomes[nem]);
        }
        */

        /*
        for (String obj : nomes) {
            System.out.println(obj);
        }
        */

        int contador = 0;
        while(contador <= 10) {
            contador++;

            if (contador <= 10) {
                System.out.println("contador menor q 10");
            }else {
                System.out.println("contador igual a 10");
            }

        }


    }
}
