package polimorfismo.dominio;

public class Computador extends Produto {
    private static final double IMPOSTO = 0.20;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Imposto do computador class");
        return this.valor * IMPOSTO;
    }
}
