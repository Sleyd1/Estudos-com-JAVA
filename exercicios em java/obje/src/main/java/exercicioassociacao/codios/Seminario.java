package exercicioassociacao.codios;

public class Seminario {
    private String nome;
    private Aluno[] aluno;
    private Local local;


    public Seminario(String nome){
        this.nome = nome;
    }
    public Seminario (String nome, Local local){
        this.nome = nome;
        this.local = local;
    }

    public Seminario (String nome, Local local, Aluno... alunos){
        this.nome = nome;
        this.local = local;
        this.aluno = alunos;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("------seminario-------");
        System.out.println("titulo: " + getNome());
        System.out.println("local: " + local.getLocal());
        if (aluno == null) return;
        System.out.println("alunos:");
        for (Aluno cont : aluno){
            System.out.println("nome: " + cont.getNome());
        }
    }
}
