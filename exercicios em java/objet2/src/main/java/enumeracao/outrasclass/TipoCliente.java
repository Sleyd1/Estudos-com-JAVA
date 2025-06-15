package enumeracao.outrasclass;

public enum TipoCliente {
    CLIENTE_JURIDICO(1, "Juridica"),
    CLIENTE_FISICA(2, "Fisica");

    private final int valor;
    private final String nome;

    TipoCliente(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public static TipoCliente encontrarCliente(String nome){
        for (TipoCliente valor : values()){
            if (valor.getNome().equals(nome)){
                return valor;
            }


        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }
}
