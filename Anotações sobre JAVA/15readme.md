# 🧠 O que é Regra de Negócio (Java e Programação em geral)

## 📌 Definição

**Regra de negócio** é **qualquer lógica que define o funcionamento do "mundo real" dentro do sistema**.

Ou seja, são as **regras da empresa**, da **área** ou do **problema** que seu software resolve.

---

## 🎯 Exemplos de Regras de Negócio

| Contexto            | Regra de Negócio                           |
| ------------------- | ------------------------------------------ |
| Banco               | Cliente não pode sacar mais que o saldo    |
| E-commerce          | Frete grátis para compras acima de R\$ 200 |
| Cadastro de usuário | Nome e email são obrigatórios              |
| Sistema escolar     | Aluno com nota abaixo de 6 está reprovado  |

---

## 💡 Onde colocamos regras de negócio?

As regras de negócio devem estar **na lógica principal do programa**, geralmente em:

* Métodos de **serviço** (ex: `UsuarioService`, `PedidoService`, etc.)
* Classes de **modelo** (às vezes chamadas de entidades)
* Métodos de **validação** (ex: `validarCadastro()`)

**Nunca devem ficar dentro de blocos de exceção (`catch`)**. Veja por quê:

---

# 🚫 Por que NÃO colocar regra de negócio no `catch`?

## 1. ❌ **`catch` é para tratar ERROS, não regras**

O `catch` serve para tratar **falhas inesperadas** (ex: banco caiu, arquivo não existe, número inválido).
Já regra de negócio é algo **esperado e controlado**.

---

## 2. ❌ Mistura responsabilidades

Quando você trata regra de negócio no `catch`, mistura duas responsabilidades diferentes:

* **Executar o que deve acontecer (regra)**
* **Tratar o que deu errado (exceção)**

> Isso dificulta a leitura, a manutenção e os testes.

---

## 3. ❌ Pode esconder bugs

Se você usa `catch` para "fingir" que está validando, pode acabar **escondendo erros graves**:

```java
try {
    usuario.setIdade(-5); // regra: idade negativa não pode
} catch (Exception e) {
    System.out.println("Erro, tente novamente");
}
```

🔴 **Errado!** Aqui parece que você está tratando uma exceção, mas está deixando passar uma regra errada.

---

## ✅ O que fazer corretamente

Separe a **regra de negócio** da **lógica de exceção**. Exemplo:

```java
public void setIdade(int idade) {
    if (idade < 0) {
        // regra de negócio: idade não pode ser negativa
        throw new IllegalArgumentException("Idade inválida");
    }
    this.idade = idade;
}
```

```java
try {
    usuario.setIdade(-5);
} catch (IllegalArgumentException e) {
    System.out.println("Idade inválida informada: " + e.getMessage());
}
```

---

## 🧠 Resumo Rápido

| Item                    | Finalidade                                     |
| ----------------------- | ---------------------------------------------- |
| `Regra de negócio`      | O **que** o sistema deve ou não permitir/fazer |
| `try/catch`             | **Como** o sistema reage a falhas técnicas     |
| Regra no `catch`?       | ❌ Não! Trate regras ANTES do erro ocorrer      |
| Exceções personalizadas | ✅ Sim, ajudam a sinalizar falhas de negócio    |

