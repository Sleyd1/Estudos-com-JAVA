# sobrecarga de construtores


É quando você define vários construtores com o mesmo nome (da classe), mas com diferentes listas de parâmetros.

Assim como métodos sobrecarregados, os construtores são diferenciados pelo tipo, número e ordem dos parâmetros.
Ex:
````java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor 1: sem parâmetros
    public Pessoa() {
        this.nome = "Desconhecido";
        this.idade = 0;
    }

    // Construtor 2: com nome
    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 0;
    }

    // Construtor 3: com nome e idade
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
````

















