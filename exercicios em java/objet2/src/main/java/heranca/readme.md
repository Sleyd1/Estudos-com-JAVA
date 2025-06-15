# 🧬 Herança em Java — Explicação Clara e Detalhada

Herança é um **mecanismo de reutilização de código** na programação orientada a objetos.
Com ela, uma **classe pode herdar atributos e métodos de outra classe**.

Em Java:

* A **classe que herda** é chamada de **subclasse** ou **classe filha**.
* A **classe que é herdada** é chamada de **superclasse** ou **classe pai**.

> **Sintaxe básica:**

```java
class Subclasse extends Superclasse {
    // código da subclasse
}
```

> A palavra-chave `extends` é usada para indicar que uma classe está herdando outra.

---

## 🧪 Exemplo Prático:

```java
public class Animal {
    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

public class Cachorro extends Animal {
    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
}
```

### 🧠 O que acontece aqui?

* `Cachorro` herda o método `emitirSom()` de `Animal`, mesmo sem declarar esse método.
* Pode também **adicionar novos comportamentos** como `abanarRabo()`.

---

## 🛠️ O que é `super`?

A palavra-chave `super` é usada dentro da subclasse para **acessar membros da superclasse**, ou seja:

* Chamar **construtores** da superclasse
* Chamar **métodos sobrescritos**
* Acessar **atributos com mesmo nome**

---

## 🔎 Detalhamento: As 3 formas de usar `super`

### 1. `super()` – Chamar o construtor da superclasse

Se a superclasse tiver um construtor com parâmetros, você **é obrigado** a chamá-lo usando `super(...)`.

> ⚠️ Deve ser **a primeira linha** no construtor da subclasse.

```java
public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}

public class Aluno extends Pessoa {
    int matricula;

    public Aluno(String nome, int matricula) {
        super(nome); // Chama o construtor da superclasse
        this.matricula = matricula;
    }
}
```

📌 Aqui, `super(nome)` evita que a subclasse tenha que repetir a lógica de inicialização de `nome`.

---

### 2. `super.metodo()` – Chamar método da superclasse (mesmo sobrescrito)

Se a subclasse sobrescrever um método da superclasse, você ainda pode acessar o original com `super.metodo()`.

```java
public class Animal {
    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        super.emitirSom(); // Chama o método original da superclasse
        System.out.println("Miau");
    }
}
```

### 🟡 O que é `@Override`?

A anotação `@Override` **informa ao compilador** que aquele método está **sobrescrevendo** um método da superclasse.

* Se você errar o nome ou a assinatura, o compilador vai avisar.
* Não é obrigatório, mas é **boa prática**.

---

### 3. `super.atributo` – Acessar atributo da superclasse com mesmo nome

Se a subclasse tiver um atributo com o **mesmo nome** da superclasse, use `super.atributo` para acessar o original.

```java
public class Veiculo {
    int velocidade = 60;
}

public class Carro extends Veiculo {
    int velocidade = 100;

    public void mostrarVelocidades() {
        System.out.println("Velocidade do carro: " + velocidade);       // 100
        System.out.println("Velocidade do veículo: " + super.velocidade); // 60
    }
}
```

---

## 🧠 Resumo Geral

| Conceito         | Explicação curta                                | Exemplo                          |
| ---------------- | ----------------------------------------------- | -------------------------------- |
| `extends`        | Indica que uma classe herda outra               | `class Filho extends Pai`        |
| `super()`        | Chama o construtor da superclasse               | `super(parametros);`             |
| `super.metodo()` | Chama método da superclasse (mesmo sobrescrito) | `super.emitirSom();`             |
| `super.atributo` | Acessa atributo da superclasse com mesmo nome   | `super.nome;`                    |
| `@Override`      | Indica que um método está sendo sobrescrito     | `@Override public void metodo()` |

---

## 📍 Quando usar herança?

Use herança quando:

* Há uma **relação de "é um"** entre as classes
  Ex: `Cachorro é um Animal`, `Aluno é uma Pessoa`
* Você precisa **reutilizar comportamentos comuns**
* Quer **especializar** uma classe base

> Evite herança se a relação for "tem um" – nesse caso, **use composição**.

---


   






