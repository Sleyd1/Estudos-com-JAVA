package classsesAbstrat.outrasclasseAbst;

public abstract class Funcionario extends Pessoa {
    private String nome;
    private double salario;


    public Funcionario( String nome, double salario) {
        this.salario = salario;
        this.nome = nome;
    }

    @Override
    public void imprimir() {
        System.out.println("imprimir");
    }

    /*
    * metodos de superclasses abstrastas so são obrigatos a serem sobrescritos apenas uma vez em uma
    * subclasse abstrata
    *
    * */

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double main();
}
