package org.example;

import Exemple2.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Classes anonimas
public class AnonimasEx {
    public static void main(String[] args) {
        List<Barco> barcol = new ArrayList<>(List.of(new Barco("blala"),new Barco("queroquro")));

        //Criando Classe Anônima
        barcol.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return 0;
            }
        });

        System.out.println(barcol);



    }
}
