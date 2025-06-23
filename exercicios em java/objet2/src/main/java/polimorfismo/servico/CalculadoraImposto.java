package polimorfismo.servico;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void  calcularImposto(Computador computador){
        System.out.println("Imposto do computador");
        double imposto = computador.calcularImposto();

        System.out.println("nome do computador: "+ computador.getNome());
        System.out.println("valor "+ computador.getValor());
        System.out.println("imposto a ser pago: "+ imposto);
    }

    public static void calcularImposto(Tomate tomate){
        System.out.println("Imposto do tomate");
        double imposto = tomate.calcularImposto();

        System.out.println("nome do tomate: "+ tomate.getNome());
        System.out.println("valor "+ tomate.getValor());
        System.out.println("imposto a ser pago: "+ imposto);
    }

}
