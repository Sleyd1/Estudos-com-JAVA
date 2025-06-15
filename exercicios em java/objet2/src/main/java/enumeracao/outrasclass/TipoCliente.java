package enumeracao.outrasclass;

public enum TipoCliente {
    CLIENTE_JURIDICO(1),
    CLIENTE_FISICA(2);

    private final int valor;
    TipoCliente(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
