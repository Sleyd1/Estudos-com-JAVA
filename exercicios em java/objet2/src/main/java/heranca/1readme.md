# 🔁 Sobrescrita de Métodos e o Uso de `final` em Java

## 📌 O que é **Sobrescrita (Override)**?

**Sobrescrita de métodos** (ou *method overriding*) é quando uma **subclasse redefine** um **método herdado da superclasse** com um novo comportamento, mas **mantém a mesma assinatura**.

> A sobrescrita **substitui** o comportamento original da superclasse.

### 📦 Exemplo básico de sobrescrita:

```java
public class Animal {
    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }
}
```

### 🧠 O que aconteceu aqui?

* O método `emitirSom()` existe na superclasse `Animal`.
* A subclasse `Cachorro` **redefiniu** esse método.
* Quando você chama `emitirSom()` em um `Cachorro`, ele executa o novo comportamento: `"Latido"`.

---

## 🧪 Regras da Sobrescrita (Override)

1. A assinatura do método (nome + parâmetros) **deve ser igual**.
2. O modificador de acesso pode ser o **mesmo ou mais permissivo**.
3. O método da superclasse **não pode ser `private`, `static` ou `final`**.
4. O tipo de retorno pode ser o mesmo ou um subtipo (tipo covariante).

---

## ✅ O que é `@Override`?

É uma anotação opcional, mas **altamente recomendada**, que **informa ao compilador** que você está sobrescrevendo um método da superclasse.

> **Se você errar a assinatura**, o compilador **vai mostrar erro**.

```java
@Override
public void emitirSom() {
    System.out.println("Novo som");
}
```

---

## 🔒 O que é o modificador `final`?

O modificador `final` em Java é usado para **proibir alterações**. Ele pode ser aplicado a:

| Onde usar `final`   | O que faz                                                  |
| ------------------- | ---------------------------------------------------------- |
| `final` em variável | Impede que o valor seja alterado (constante)               |
| `final` em método   | Impede que o método seja sobrescrito em subclasses         |
| `final` em classe   | Impede que a classe seja herdada (não pode ter subclasses) |

---

### ✅ 1. `final` em métodos

Se você declarar um método como `final`, ele **não pode ser sobrescrito** por nenhuma subclasse.

```java
public class Animal {
    public final void respirar() {
        System.out.println("Respirando...");
    }
}

public class Gato extends Animal {
    // ❌ Erro! Não é possível sobrescrever método final
    /*
    @Override
    public void respirar() {
        System.out.println("Gato respirando...");
    }
    */
}
```

---

### ✅ 2. `final` em variáveis (constantes)

Variáveis `final` são **imutáveis**. Uma vez atribuído o valor, **não pode mudar**.

```java
public class Constantes {
    public static final double PI = 3.14159;
}
```

> 📌 Por convenção, constantes `final` são escritas em **letras maiúsculas**.

---

### ✅ 3. `final` em classes

Uma classe `final` **não pode ser estendida**. Nenhuma outra classe pode herdá-la.

```java
public final class SistemaOperacional {
    // código
}

// ❌ Erro! Não é possível estender uma classe final
/*
public class Linux extends SistemaOperacional {
}
*/
```

---

## 🧠 Resumo Visual

| Conceito            | Para que serve                                        | Pode ser sobrescrito? |
| ------------------- | ----------------------------------------------------- | --------------------- |
| `@Override`         | Garante que o método está sobrescrevendo corretamente | ✅ Sim                 |
| `final` em método   | Protege o método contra sobrescrita                   | ❌ Não                 |
| `final` em variável | Define uma constante (valor fixo)                     | Não aplicável         |
| `final` em classe   | Impede que outras classes herdem                      | ❌ Não                 |

---

## 💬 Dica prática: Quando usar sobrescrita?

Use sobrescrita quando:

* Quiser **mudar o comportamento** de um método herdado
* Estiver implementando **polimorfismo**
* Precisar especializar ações de uma superclasse em classes filhas

> 🧠 Exemplo comum: `toString()`, `equals()`, `hashCode()` são métodos frequentemente sobrescritos.

---

## ✅ Resumo Final (com exemplo completo):

```java
public class Animal {
    public void emitirSom() {
        System.out.println("Som genérico");
    }

    public final void respirar() {
        System.out.println("Respirando...");
    }
}

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    // ❌ Não pode sobrescrever respirar(), pois é final
}
```

---
