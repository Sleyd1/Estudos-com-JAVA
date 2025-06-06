# O que é this?
O this é uma referência ao próprio objeto atual, ou seja, à instância da classe que está executando o código naquele momento.

## ``this`` com atributos (para evitar ambiguidade)

* usamos Quando os nomes das variáveis locais (como parâmetros) são iguais aos atributos da classe, usamos this para diferenciar.

  🔸Ex:
````java
public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;  // 'this.nome' se refere ao atributo da classe
    }
}
````

Sem o this.nome, Java iria entender que os dois nome se referem ao parâmetro.

## ``this`` com métodos
Você pode usar this para:

* Chamar outro método da mesma classe

* Deixar claro que é um método da instância (opcional)

🔸Ex:
````java
public class Pessoa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        this.falar();  // chama o método 'falar' desta mesma instância
    }

    private void falar() {
        System.out.println("Olá, meu nome é " + this.nome);
    }
}

````


## ``this()`` para chamar outro construtor
Em Java, você pode chamar outro construtor da mesma classe usando this(...), com argumentos.

🔸 Regras:
* Tem que ser a primeira linha do construtor.

* Útil para reaproveitar código entre construtores.

🔸Ex:
````java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome) {
        this(nome, 0);  // chama o outro construtor
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
````

