package org.example;

public class Main{

    public static void main(String[] args) {

        byte valorMenor = 50;
        short valorMedio = 100;
        int ValorInt = 200;
        long valorMaior = 400L;
        float valorDecimalS = 50.4f;
        double decimalM = 100.7;
        String mensage = "Olá, mundo!";
        char caractereUnico = 'v';
        boolean valor = true;

        if (valorMenor < valorMedio ) {
            System.out.println(valor);
        } else {
            System.out.println("oi");
        }

        if (mensage.isBlank()){
            // isBlank verifica se a variavel mensage esta vazia
            System.out.println("Você não tem nenhuma mensagem!!!");
        } else {
            System.out.println(mensage);
        }


        if (mensage.equals("Olá, mundo!")) {
            // equals() toma um objeto como parâmetro e retorna um valor booleano indicando se os objetos são iguais ou não.
            System.out.println("iguais");
        } else {
            System.out.println("não iguais");
        }


        // operador ternario
        // condição ? valor_se_verdadeiro : valor_se_falso;
        int idade = 17;
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println(status);


    }

 }