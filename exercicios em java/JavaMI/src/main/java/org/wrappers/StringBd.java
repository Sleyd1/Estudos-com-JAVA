package org.wrappers;

public class StringBd {
    public static void main(String[] args) {
        String nome = "William";
        nome.concat("io");
        System.out.println(nome);//o valor que nome faz referencia não sera alterado
        StringBuilder s = new StringBuilder("digitar");
        s.append(" valor");//append metodo da classe StringBuilder
        System.out.println(s);//o valor que a variavel s faz referencia sera
        // alterado sem precisar armazenar em outra variavel
        s.delete(0,2);
    }
}
