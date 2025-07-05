package org.wrappers;

//Classes Utilitárias
public class Main {
    public static void main(String[] args) {
        //autoboxing
        //quando o java faz transforma no automatico valores primitivos em variaveis do tipo wrappers
        //ex:
        Integer num = 1;  //o valor 1 foi transformado em uma variavel do tipo wrappers
        Short num2 = 2;
        Byte num3 = 3;
        Long num4 = 4l;
        Float num5 = 5f;
        Boolean TF = null;
        Character cara = null;
        Double num6 = 0d;

      //unboxing
        //quando o java transforma uma variavel do tipo wrapper em uma variavel primitiva.
        //ex:
        int i = num;

        //métodos das classes wrappers
        Integer test = Integer.parseInt("1");//é um método estático usado para converter uma string em um valor inteiro
        Boolean b = Boolean.parseBoolean("TruE");//é usado para converter uma string em um valor booleano
        Character n = Character.forDigit(5,2);//converte um valor inteiro em seu equivalente de
        // caractere, considerando uma base específica
        //Ele retorna o caractere que representa o dígito fornecido na
        // base especificada. Por exemplo, em base 10 (decimal), Character.
        // forDigit(5, 10) retornaria '5'. Em bases maiores que 10, como ahexadecimal,
        // ele retorna 'a' para 10, 'b' para 11 e assim por diante.

        Character.isDigit('a');// verifica se um caractere fornecido é um dígito
        // numérico. Ele retorna true se o caractere
        // for um dígito (0 a 9) e false caso contrário
        Character.isDigit('9');
        Character.isLetterOrDigit('!');//verifica se um caractere fornecido é uma letra ou um dígito.
        // Em outras palavras, retorna true se o caractere for uma letra
        Character.isLowerCase('A');//verifica se um caractere fornecido é uma letra minúscula
        Character.toLowerCase('A');//é usado para converter um caractere para sua versão em minúsculas, se possível
        Character.toUpperCase('a');//converte caracteres ou strings em suas versões maiúsculas. Ele não modifica
        // a string original, mas retorna uma nova string com todas as letras em maiúsculas
        System.out.println(b);

    }
}