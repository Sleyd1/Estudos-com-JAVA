package org.example;

class Pessoa{
    String nome;
    public Pessoa(String nome){
        this.nome = nome;
    }
}

public class Evit {
    public static void main(String[] args){
        //Como evitar perder objetos (e poder reutilizá-los).
        Pessoa p = new Pessoa("João");
        Pessoa backup = p;  // Você ainda pode usar backup mesmo que p = null

    }
}
