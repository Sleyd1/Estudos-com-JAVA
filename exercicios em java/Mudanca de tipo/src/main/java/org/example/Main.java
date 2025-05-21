package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * para mudar um valor de uma variavel para ser reatribuida
        * a outra  variavel usamos o conceito de casting
        *  nos vamos mudar o tipo do valor de uma variavel
        * para ser atribuida a outra
        * ou seja somente o valor da variavel tera seu tipo mudado.
        * */

        double caractere = 1.1;
        int mundacaDeTipo = (int ) caractere;

        int meint = 10;
        double doub = meint;


        /*
        * mudando um valor string para valores inteiros
        * */

        String meuStr = "11";
        int number = Integer.parseInt(meuStr);


        /*
        * mudando valores inteiros para string
        * */
         int inteir = 200;

         String meuValor = String.valueOf(inteir);


        System.out.println(mundacaDeTipo);

    }
}