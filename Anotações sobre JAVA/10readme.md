# 📚 Enumeração (`enum`) em Java

## 🔰 O que é uma Enumeração?

**Enumeração (ou `enum`)** em Java é um tipo especial de classe que representa um **conjunto fixo de constantes**. Ela é usada quando você tem um número limitado de valores possíveis para uma variável.

> 📌 Exemplo típico: dias da semana, direções (NORTE, SUL, LESTE, OESTE), status de pedido (PENDENTE, ENVIADO, ENTREGUE).

---

## 📦 Sintaxe Básica

```java
public enum DiaDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}
```

---

## ⚙️ Como usar uma Enumeração?

### ✅ Declaração e uso em variáveis

```java
DiaDaSemana hoje = DiaDaSemana.SEGUNDA;

if (hoje == DiaDaSemana.SEGUNDA) {
    System.out.println("Começo da semana!");
}
```

---

## 💡 Casos de Uso Comuns

### 1. **Controle de Fluxo com `switch`**

```java
switch (hoje) {
    case SEGUNDA:
        System.out.println("Início da semana.");
        break;
    case SEXTA:
        System.out.println("Sextou!");
        break;
    default:
        System.out.println("Dia comum.");
}
```

### 2. **Usar em Classes de Modelo (ex: status de pedido)**

```java
public enum StatusPedido {
    PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE
}

public class Pedido {
    private StatusPedido status;

    public Pedido() {
        this.status = StatusPedido.PENDENTE;
    }

    public void avancarStatus() {
        switch (status) {
            case PENDENTE -> status = StatusPedido.PROCESSANDO;
            case PROCESSANDO -> status = StatusPedido.ENVIADO;
            case ENVIADO -> status = StatusPedido.ENTREGUE;
            default -> System.out.println("Pedido já entregue.");
        }
    }
}
```

---

## 🔍 Métodos Especiais de `enum`

### `values()`

Retorna um array com todos os valores do `enum`.

```java
for (DiaDaSemana dia : DiaDaSemana.values()) {
    System.out.println(dia);
}
```

### `name()` e `ordinal()`

```java
DiaDaSemana dia = DiaDaSemana.QUARTA;
System.out.println(dia.name());     // "QUARTA"
System.out.println(dia.ordinal());  // 2 (posição começa do 0)
```

---

## 🧠 Enum com Atributos e Métodos

Enums podem ter **atributos, construtores e métodos**, como uma classe normal.

```java
public enum NivelAcesso {
    ADMIN(3), MODERADOR(2), USUARIO(1);

    private int nivel;

    NivelAcesso(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}
```

**Uso:**

```java
NivelAcesso acesso = NivelAcesso.ADMIN;
System.out.println(acesso.getNivel());  // 3
```

---

## 📊 Comparação: Enum vs. Constantes `final static`

| Característica          | `enum` | `final static` |
| ----------------------- | ------ | -------------- |
| Tipo seguro (type-safe) | ✅ Sim  | ❌ Não          |
| Suporta métodos         | ✅ Sim  | ❌ Não          |
| Mais organizado         | ✅ Sim  | ❌ Não          |
| Uso em `switch`         | ✅ Sim  | ✅ Sim          |
| Imutável                | ✅ Sim  | ✅ Sim          |

> ✅ **Enum é mais eficiente para representar estados fixos com regras e comportamentos associados.**

---

## 🧪 Exemplos Reais de Uso

### ✅ Em Aplicações Web (Spring, REST APIs)

```java
public enum TipoUsuario {
    CLIENTE, FUNCIONARIO, ADMIN
}
```

Usado em DTOs ou Models para indicar papéis no sistema.

---

### ✅ Em Sistemas Bancários

```java
public enum TipoConta {
    CORRENTE(0.05f), POUPANCA(0.02f);

    private float taxaJuros;

    TipoConta(float taxa) {
        this.taxaJuros = taxa;
    }

    public float getTaxa() {
        return taxaJuros;
    }
}
```

---

## 🛠️ Dicas e Boas Práticas

* Use `enum` quando os valores possíveis forem **fixos e previsíveis**.
* Prefira `enum` no lugar de constantes `public static final`.
* Evite lógica complexa demais dentro do `enum`, mas usar **métodos auxiliares simples** é ótimo.
* Nome dos valores deve ser em **CAIXA\_ALTA**, por convenção Java.

---

