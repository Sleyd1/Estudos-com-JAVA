package org.example.trabalhandcomobj1.objetoex.objetoex;

public class Calculadora1 {
    public void somar(int numero1, int numero2){
        System.out.println(numero1 + numero2 );
        // void é quando o metodo não retorna nada

    }

    public float somarDoisNumeros(float numero1, float numero2){

        return numero1 + numero2;
    }

    public float subtrairDoisNumeros(float numero1, float numero2){
        return numero1 - numero2;
    }

    public float multiplicarDoisNumeros(float numero1, float numero2){
        return numero1 * numero2;
    }

    public float dividirDoisNumeros(float numero1, float numero2){
       if (numero2 == 0){
           return 0;
       }
        return numero1 / numero2;
    }

    public void somarArreys (int[] numeros) {
        int valor = 0;
        for (int va : numeros){
            valor += va;
        }
        System.out.println(valor);
    }


    public void somarArreysut (int... numeros) {
        int valor = 0;
        for (int va : numeros){
            valor += va;
        }
        System.out.println(valor);
    }



}
