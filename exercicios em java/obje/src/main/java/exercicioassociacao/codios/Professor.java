package exercicioassociacao.codios;

public class Professor {
    private String nome;
    private Seminario[] seminario;
    private String especialidade;

    public Professor(String nome){
        this.nome = nome;

    }

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;

    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void imprimir(){
        System.out.println("------Professor-------");
        System.out.println("nome: " + getNome());
        System.out.println("Especialidade: " + getEspecialidade());
        if (seminario == null) return;
        System.out.println("seminarios:");
        for (Seminario cont : seminario){
            System.out.println("titulo: " + cont.getNome());
        }
    }
}
