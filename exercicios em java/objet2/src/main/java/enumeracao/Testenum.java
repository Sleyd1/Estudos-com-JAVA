package enumeracao;

import enumeracao.outrasclass.Cliente;
import enumeracao.outrasclass.TipoCliente;

public class Testenum {
    public static void main(String[] args) {
        Cliente clientetest = new Cliente("Wesley", TipoCliente.CLIENTE_FISICA);
        Cliente clientetest2 = new Cliente("Google",TipoCliente.CLIENTE_JURIDICO);
        clientetest.exibir();
        clientetest2.exibir();
    }
}
