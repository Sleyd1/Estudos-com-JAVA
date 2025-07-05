package org.wrappers;

public class cont {
    public static void main (String[] args) {
        int valorTotal = 50;

        for (int contador=0 ; contador < valorTotal; contador++){

            if (contador > 25){
                break;
            }
            System.out.println(contador);
        }
    }
}
