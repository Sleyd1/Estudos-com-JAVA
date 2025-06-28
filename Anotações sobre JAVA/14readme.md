# 📘 Exceções em Java (`try`, `catch`, `finally`, `throw`, `throws`)

## 🧠 O que são Exceções?

**Exceções** são eventos que ocorrem durante a execução de um programa e interrompem o fluxo normal de instruções. Quando algo inesperado acontece (ex: divisão por zero, arquivo não encontrado), o Java lança uma **exceção**.

> Exceções são objetos que representam erros.

---

## 📂 Hierarquia de Exceções

Todas as exceções herdam da classe `Throwable`.

```
Throwable
├── Error → Erros graves (ex: falta de memória) → Não tratamos
└── Exception → Erros que podemos tratar
    ├── Checked Exceptions → Obrigam tratamento (ex: IOException)
    └── Unchecked Exceptions → Não obrigam tratamento (ex: NullPointerException)
```

---

## ⚠️ Checked vs Unchecked

| Tipo                   | O que é?                       | Exemplo                       | Precisa tratar (`try/catch`)? |
| ---------------------- | ------------------------------ | ----------------------------- | ----------------------------- |
| `Checked Exceptions`   | Erros previsíveis do sistema   | `IOException`, `SQLException` | ✅ Sim                         |
| `Unchecked Exceptions` | Erros de lógica do programador | `NullPointerException`        | ❌ Não (mas é recomendável)    |

---

## 🧪 Como tratar Exceções

### ✅ Bloco `try-catch`

```java
try {
    // Código que pode lançar exceção
} catch (TipoDaExcecao nomeVariavel) {
    // Código para tratar a exceção
}
```

### Exemplo:

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro: divisão por zero!");
}
```

---

## ➕ Vários `catch`

Você pode capturar exceções diferentes em blocos separados:

```java
try {
    int[] numeros = {1, 2, 3};
    System.out.println(numeros[5]);
} catch (ArithmeticException e) {
    System.out.println("Erro de matemática!");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Índice fora do limite!");
}
```

---

## 🔁 Bloco `finally`

O bloco `finally` **sempre é executado**, com ou sem exceção. Ideal para **fechar conexões**, **liberar recursos**, etc.

```java
try {
    int resultado = 10 / 2;
} catch (Exception e) {
    System.out.println("Algo deu errado.");
} finally {
    System.out.println("Sempre executa!");
}
```

---

## 🚀 Lançando Exceções com `throw`

Você pode **lançar** uma exceção manualmente:

```java
throw new IllegalArgumentException("Valor inválido!");
```

### Exemplo prático:

```java
public void setIdade(int idade) {
    if (idade < 0) {
        throw new IllegalArgumentException("Idade não pode ser negativa.");
    }
    this.idade = idade;
}
```

---

## 📤 Método que lança exceções: `throws`

Se um método pode lançar uma exceção **checada**, você precisa declarar isso com `throws`.

```java
public void lerArquivo(String nome) throws IOException {
    FileReader leitor = new FileReader(nome);
}
```

Você pode **delegar** o tratamento para quem chama o método.

---

## ✅ Exemplo completo

```java
import java.io.*;

public class LeitorArquivo {
    public void ler(String caminho) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
        br.close();
    }

    public static void main(String[] args) {
        LeitorArquivo leitor = new LeitorArquivo();
        try {
            leitor.ler("arquivo.txt");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            System.out.println("Processo finalizado.");
        }
    }
}
```

---

## 🧪 Boas práticas

* Use exceções para **casos excepcionais**, não para lógica comum.
* Prefira **exceptions específicas** (ex: `NumberFormatException`).
* Sempre **libere recursos** com `finally` ou **try-with-resources**.
* Crie suas **exceções personalizadas**, se necessário:

```java
public class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}
```

---

## 🧠 Resumo Rápido

| Conceito    | Explicação Rápida                         |
| ----------- | ----------------------------------------- |
| `try`       | Onde o código pode falhar                 |
| `catch`     | Onde você trata a falha                   |
| `finally`   | Sempre executa (com ou sem falha)         |
| `throw`     | Lança uma exceção manualmente             |
| `throws`    | Declara que um método pode lançar exceção |
| `checked`   | Obrigatório tratar                        |
| `unchecked` | Opcional, mas recomendado                 |

---
