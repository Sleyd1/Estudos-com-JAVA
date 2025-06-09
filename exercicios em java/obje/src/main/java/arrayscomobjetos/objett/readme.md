# Associação entre classes (Conceito de POO)
Na Programação Orientada a Objetos (POO), associação é o relacionamento entre duas classes. Por exemplo, uma Pessoa pode ter um Endereço.
````java
class Endereco {
    String rua;
    String cidade;
}

class Pessoa {
    String nome;
    Endereco endereco; // Associação com a classe Endereco
}
````

Nesse caso, Pessoa tem um Endereco, mas as duas classes são independentes.

# Tipos de Associação

Tipos de Associação
Existem 3 tipos principais de associação:

Associação Simples: Uma classe usa outra.

Agregação (tem-um): Uma classe contém outra, mas elas podem existir separadamente.

Composição (parte-de): Uma classe contém outra, e a existência de uma depende da outra.

🔸 Exemplo de Agregação:

````java
class Departamento {
    String nome;
}

class Universidade {
    Departamento departamento; // Agregação
}
````

````java
class Motor {
    // só existe dentro de Carro
}

class Carro {
    private Motor motor = new Motor(); // Composição
}
`````

## Associação em Coleções
Você pode associar várias instâncias com listas:
````java
class Aluno {
    String nome;
}

class Turma {
    List<Aluno> alunos = new ArrayList<>();
}
````
## Associação Unidirecional

Associação unidirecional significa que uma classe conhece a outra, mas não o contrário.

Por exemplo, se a classe ``Pessoa`` conhece a classe Endereco, mas Endereco não conhece Pessoa, temos uma associação unidirecional.

Exemplo pratico:

````java
class Endereco {
    private String rua;

    public Endereco(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }
}

class Pessoa {
    private String nome;
    private Endereco endereco; // Pessoa conhece Endereco

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void mostrarEndereco() {
        System.out.println("Endereço: " + endereco.getRua());
    }
}
````

O que acontece aqui:
* Pessoa tem um Endereco.

* Endereco não sabe nada sobre Pessoa.









