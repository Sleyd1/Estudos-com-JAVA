package polimorfismo.test;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Telefone;
import polimorfismo.dominio.Tomate;
import polimorfismo.servico.CalculadoraImposto;

public class Teste {
    public static void main(String[] args){
        Tomate tipoTomate = new Tomate("italiano", 4.5);
        Computador nomeCoputador = new Computador("lenovo",4500);
        Telefone nomeTelefone = new Telefone("readmw", 2000);



        CalculadoraImposto.calcularImposto(nomeCoputador);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(tipoTomate);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(nomeTelefone);
/* se não estivermo acessando nenhum atributo de uma classe podemos transformas
os metodo em estaticos*/





    }
}
