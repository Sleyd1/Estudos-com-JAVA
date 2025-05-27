package org.example;

public class perce {
    public static void main(String[] args) {

        float valorDoCarro = 100000;

        for (int parcela = 1 ; parcela <= valorDoCarro ;parcela++){
            float valorDaParcela = valorDoCarro / parcela;

            System.out.println("parcela: "+ parcela + " valor da parcela: $"+ valorDaParcela);
            if (valorDaParcela <= 1000) {
                break;
            }
        }








    }
}
