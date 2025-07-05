package org.wrappers;

public class StringTest {
    public static void main(String[] args) {
        String nome = "William";//String constant pool
        //nome cria um objeto "william" e william e guardado em um endereço de mémoria.
        String nom2 = "William";//faiz referencia ao mesmo
        // endereço de mémoria que a vária nome faz referéncia.

        nome = nome.concat(" trust");
        //nome cria um novo objeto "William trust". 'trust' fui adicionado junto com 'william'
        String nome3 = new String("William");//Cria um novo objeto em um endereço de
        //memoria diferente
        System.out.println(nome);
        System.out.println(nome == nom2);
        // o operador == vai comparar se as variaveis fazem referéncia ao mesmo endereço de mémoria

        System.out.println(nom2 == nome3.intern());

         //O método intern() Verifica no String pool se já existe uma String com aquele conteúdo.
        // Se já existir, ele devolve a referência para a String do pool.
        // Se não existir, ele adiciona essa String no pool e devolve essa nova referência.
        //Quando você chama nome3.intern(), ele devolve exatamente a mesma referência de nome2.
    }
}
