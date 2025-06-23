package polimorfismo.servico;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Imposto do produto");
        double imposto = produto.calcularImposto();

        System.out.println("nome do produto: "+ produto.getNome());
        System.out.println("valor "+ produto.getValor());
        System.out.println("imposto a ser pago: "+ imposto);
    }


}
