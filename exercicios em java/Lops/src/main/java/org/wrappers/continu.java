package org.wrappers;

public class continu {
    public static void main (String[] args){
        double valorTOtal = 30000;
        for (int parcela = (int) valorTOtal; parcela >= 1; parcela--){
            double valorParcela = valorTOtal / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
