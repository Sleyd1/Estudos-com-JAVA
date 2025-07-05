package org.wrappers;

public class swiitch {
    public static void main(String[] args) {
        int diasDaSemana = 7;
        switch (diasDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3 :
                System.out.println("Terça");
                break;
            case 4 :
                System.out.println("Quarta");
                break;
            case 5 :
                System.out.println("Quinta");
                break;
            case 6 :
                System.out.println("Sexta");
                break;
            case 7 :
                System.out.println("Sabado");
                break;
            default:
                System.out.println("dia invalido");
        }

        switch (diasDaSemana) {
            case 1, 7:
                System.out.println("fim de semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("dia util");

        }

    }
}
