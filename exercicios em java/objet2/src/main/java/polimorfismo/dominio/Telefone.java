package polimorfismo.dominio;

public class Telefone extends Produto {
    private static final double IMPOSTO = 0.1 ;
    public Telefone(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return valor * IMPOSTO;
    }
}
