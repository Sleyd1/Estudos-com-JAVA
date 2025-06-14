# Associação entre classes (Conceito de POO)
Na Programação Orientada a Objetos (POO), associação é o relacionamento entre duas classes. Por exemplo, uma ``Pessoa`` pode ter um ``Endereço``.
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

Nesse caso, ``Pessoa`` tem um ``Endereco``, mas as duas classes são independentes.

# Tipos de Associação

Tipos de Associação
Existem 3 tipos principais de associação:

* **Associação Simples**: Uma classe usa outra.

* **Agregação** (tem-um): Uma classe contém outra, mas elas podem existir separadamente.

* **Composição** (parte-de): Uma classe contém outra, e a existência de uma depende da outra.

🔸 Exemplo de Agregação:

````java
class Departamento {
    String nome;
}

class Universidade {
    Departamento departamento; // Agregação
}
````
🔸 Exemplo de Composição:
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

Por exemplo, se a classe ``Pessoa`` conhece a classe ``Endereco``, mas ``Endereco`` não conhece Pessoa, temos uma associação unidirecional.

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
* ``Pessoa`` tem um ``Endereco``.

* ``Endereco`` não sabe nada sobre ``Pessoa``.

## Associação Bidirecional
Na associação bidirecional, as duas classes sabem uma da existência da outra. Ou seja, cada instância mantém uma referência à outra.

Exemplo clássico:

* Um Aluno sabe quem é seu Professor;

* Um Professor sabe quais são seus Alunos.

  ````java
  import java.util.ArrayList;
  import java.util.List;

  class Aluno {
    private String nome;
    private Professor professor;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNome() {
        return nome;
    }
  }

    class Professor {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();

    public Professor(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.setProfessor(this); // relação bidirecional
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }
    }
    
    ````

Explicando:
* A classe Aluno possui um atributo do tipo Professor;

* A classe Professor possui uma lista de Alunos;

* Quando um aluno é adicionado ao professor, o professor é também definido no aluno — isso garante a bidirecionalidade da relação.

Exemplos típicos de associação bidireciona:

* Cliente e Conta Bancária

* Pedido e Produto

* Médico e Paciente




