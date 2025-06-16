package classsesAbstrat.outrasclasseAbst;

public class Desenvolvedor extends Funcionario {
    private String atividade;
    public Desenvolvedor(String nome, double salario, String atividade) {
        super(nome, salario);
        this.atividade = atividade;
    }

    public String getAtividade() {
        return atividade;
    }

    public void exibir(){
        System.out.println(getNome());
        System.out.println(getSalario());
        System.out.println(getAtividade());

    }
}
