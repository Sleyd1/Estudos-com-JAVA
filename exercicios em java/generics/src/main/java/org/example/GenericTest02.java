package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenericTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(),new Cachorro());
        printConsulta(cachorros);
        List<Animal> animals = new ArrayList<>();
        printconsultaAnimal(animals);

    }
    public static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals){
            animal.consulta();
        }
    }

    public static void printconsultaAnimal(List<? super Cachorro>animals){
        animals.add(new Cachorro());
    }

}
