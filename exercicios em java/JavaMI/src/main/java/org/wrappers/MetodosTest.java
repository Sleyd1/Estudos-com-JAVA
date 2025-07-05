package org.wrappers;

public class MetodosTest {
    public static void main(String[] args) {
        //testatndo metodos
        String nome= "  luffy";
        String numeros = "012345";

        System.out.println(nome.charAt(0));//é usado para acessar
        // um caractere específico em uma string, com base em sua posição (índice).
        // Ele retorna o caractere encontrado no índice especificado dentro da string
        System.out.println(nome.length());//length() para classes e legth para tipos primitivos
        System.out.println(nome.replace("f","l"));//substituir partes de uma string por outras.
        // Basicamente, ela busca por uma substring específica na string original e a troca por
        // outra substring que você fornecer, retornando uma nova string com as alterações.
        System.out.println(nome.toLowerCase());//converte uma string para letras minúsculas.
        System.out.println(nome.toUpperCase());//converte uma string para letras maiúsculas.
        System.out.println(numeros.substring(3));//permite extrair uma parte específica de uma string,
        // Essa extração é feita a partir de uma posição inicial e, em alguns casos,
        // um comprimento específico dentro da string original.
        System.out.println(nome.trim());//método ou função que remove espaços em branco



    }

}
