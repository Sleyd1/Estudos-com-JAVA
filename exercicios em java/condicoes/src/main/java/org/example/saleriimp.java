package org.example;

public class saleriimp {
    public static void main(String[] args) {
        float salaraioAnual = 36000;
        double primeiraFixa = salaraioAnual / 9.7;
        double segundaFaixa = salaraioAnual / 37.35;
        double terceiraFaixa =  salaraioAnual / 49.5;
        float imposto;
        if (salaraioAnual >= 0 && salaraioAnual <= 34712) {
            System.out.println("você paga 9,70% de imposto anual");
            imposto = (float) primeiraFixa;
        } else if (salaraioAnual >= 34713 && salaraioAnual <= 68507) {
            System.out.println("você paga 37,35% de imposto anual");
            imposto = (float) segundaFaixa;
        } else {
            System.out.println("você paga 49,5% de imposto anual");
            imposto = (float) terceiraFaixa;
        }

        System.out.println("$" + imposto + " de imposto pago");
    }
}
