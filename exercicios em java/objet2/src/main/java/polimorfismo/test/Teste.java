package polimorfismo.test;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Tomate;
import polimorfismo.servico.CalculadoraImposto;

public class Teste {
    public static void main(String[] args){
        Tomate tipoTomate = new Tomate("italiano", 4.5);
        Computador nomeCoputador = new Computador("lenovo",4500);

        CalculadoraImposto.calcularImposto(nomeCoputador);
        CalculadoraImposto.calcularImposto(tipoTomate);

/* se não estivermo acessando nenhum atributo de uma classe podemos transformas
os metodo em estaticos*/





    }
}
