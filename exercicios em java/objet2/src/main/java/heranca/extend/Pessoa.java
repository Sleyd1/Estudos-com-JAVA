package heranca.extend;

public class Pessoa {
    private String nome;
    private int cpf;
    private Endereco endereco;


    public Pessoa(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("cpf: " + getCpf());
        System.out.println("Rua: " + this.endereco.getRua() + " cep: " + this.endereco.getCep());
    }
}

