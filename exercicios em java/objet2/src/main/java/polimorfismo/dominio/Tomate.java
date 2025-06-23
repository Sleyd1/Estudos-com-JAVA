package polimorfismo.dominio;

public class Tomate extends Produto {
    private static final double IMPOSTO = 0.15;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }


    @Override
    public double calcularImposto() {
        System.out.println("impoto do tomate class");
        return this.valor * IMPOSTO;
    }
}
