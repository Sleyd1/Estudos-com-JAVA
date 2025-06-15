package enumeracao;

import enumeracao.outrasclass.Cliente;
import enumeracao.outrasclass.TipoCliente;
import enumeracao.outrasclass.TipoDePagamento;

public class Testenum {
    public static void main(String[] args) {
        Cliente clientetest = new Cliente("Wesley", TipoCliente.CLIENTE_FISICA);
        Cliente clientetest2 = new Cliente("Google",TipoCliente.CLIENTE_JURIDICO);
        clientetest.exibir();
        clientetest2.exibir();



        System.out.println(TipoDePagamento.DEBITO.desconto(20));
        System.out.println(TipoDePagamento.CREDITO.desconto(30));


        System.out.println("--------------");
        TipoCliente tipoDClient = TipoCliente.encontrarCliente("Juridica");
        System.out.println(tipoDClient);
    }
}
