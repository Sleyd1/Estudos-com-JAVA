package org.example.trabalhandcomobj1.objetoex;

import org.example.trabalhandcomobj1.objetoex.objetoex.Calculadora1;


public class Calc {
    public static void main (String[] args){
        Calculadora1 exemplo = new Calculadora1();
        int resultado = (int) exemplo.dividirDoisNumeros(2,0);
        System.out.println("Resultado: "+ resultado);

        System.out.println("*----------------*");
        int[] exmploA = {1,3,3,45,5};
        Calculadora1 resultadoo = new Calculadora1();
        resultadoo.somarArreys(exmploA);
        // outra forma:
        resultadoo.somarArreys(new int[] {1,5,7,9,4,4});


        // outra forma com outra sintaxe
        resultadoo.somarArreysut(1,4,56,78,9,9,9,6,5,4,0);





    }

}
