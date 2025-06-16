package classsesAbstrat.outrasclasseAbst;

public abstract class Funcionario {
    private String nome;
    private double salario;


    public Funcionario( String nome, double salario) {
        this.salario = salario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
