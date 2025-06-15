# o que é "Associação" em Java
Imagine que objetos em Java são como pessoas.
E às vezes, essas pessoas têm relacionamentos umas com as outras.

Por exemplo:

* O João (aluno) tem uma professora (Maria).

* A professora Maria dá aula para vários alunos.

Esse tipo de relacionamento entre pessoas (ou objetos) é o que a gente chama de associação.

## Associação Unidirecional (um lado só olha pro outro)

Aluno conhece o Professor, mas o Professor não sabe quem é o Aluno.

É como se o aluno olhasse para a professora, mas a professora não prestasse atenção naquele aluno em específico.

````java
class Professor {
    String nome;
}

class Aluno {
    String nome;
    Professor professor; // Aluno conhece o Professor
}
````

O Aluno tem um professor, mas o Professor não tem nenhum aluno registrado.


## Associação Bidirecional (um olha pro outro)
🧒↔️👩
Aluno conhece o Professor e o Professor conhece o Aluno.

Agora sim, os dois se conhecem. É uma amizade de verdade!

````java
class Aluno {
    String nome;
    Professor professor; // conhece o professor
}

class Professor {
    String nome;
    List<Aluno> alunos; // conhece vários alunos
}
````

