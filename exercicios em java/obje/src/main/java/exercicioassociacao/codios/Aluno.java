package exercicioassociacao.codios;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno (String nome){
        this.nome = nome;
    }

    public Aluno(String nome, Seminario seminario){
        this.nome = nome;
        this.seminario = seminario;

    }


    public String getNome() {
        return nome;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void imprimir(){
        System.out.println("------Aluno-------");
        System.out.println("Nome: "+getNome());
        System.out.println("idade: " + getIdade());
        System.out.println("seminario: "+ seminario.getNome());
    }
}
