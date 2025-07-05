# 📋 Exceções Comuns em Java

### — com Hierarquia (pai → filho)

---

## 🔷 Raiz

```
java.lang.Throwable
```

## 🔷 Duas grandes categorias:

```
├── java.lang.Exception (Checked)
│
└── java.lang.Error (não tratável normalmente)
```

---

# ✅ Checked Exceptions (filhas de Exception)

(O compilador exige tratamento)

```
java.lang.Exception
 ├── IOException
 │    ├── FileNotFoundException
 │    ├── EOFException
 │    ├── SocketException
 │    └── MalformedURLException
 │
 ├── SQLException
 │
 ├── ClassNotFoundException
 │
 ├── InstantiationException
 │
 ├── InterruptedException
 │
 ├── NoSuchMethodException
 │
 ├── ParseException
 │
 └── InvocationTargetException
```

---

# 🔷 Unchecked Exceptions (filhas de RuntimeException)

(Não obrigatórias de tratar — acontecem em tempo de execução)

```
java.lang.RuntimeException
 ├── NullPointerException
 ├── ArithmeticException
 ├── ArrayIndexOutOfBoundsException
 │    ├── IndexOutOfBoundsException
 │         ├── StringIndexOutOfBoundsException
 │
 ├── IllegalArgumentException
 │    ├── NumberFormatException
 │
 ├── IllegalStateException
 │
 ├── UnsupportedOperationException
 │
 ├── ClassCastException
 │
 ├── ConcurrentModificationException
 │
 └── SecurityException
```

---

# 🚨 Errors (filhas de Error — raramente tratáveis)

(Não são “exceções” normais — indicam falhas graves)

```
java.lang.Error
 ├── OutOfMemoryError
 ├── StackOverflowError
 ├── VirtualMachineError
 │    ├── InternalError
 │    ├── UnknownError
 │
 └── AssertionError
```

---

# 📄 Resumo Visual

```
Throwable
├── Exception
│   ├── IOException
│   │   ├── FileNotFoundException
│   │   ├── EOFException
│   │   ├── SocketException
│   │   └── MalformedURLException
│   ├── SQLException
│   ├── ClassNotFoundException
│   ├── InstantiationException
│   ├── InterruptedException
│   ├── NoSuchMethodException
│   ├── ParseException
│   └── InvocationTargetException
│
├── RuntimeException
│   ├── NullPointerException
│   ├── ArithmeticException
│   ├── ArrayIndexOutOfBoundsException
│   │   └── StringIndexOutOfBoundsException
│   ├── IllegalArgumentException
│   │   └── NumberFormatException
│   ├── IllegalStateException
│   ├── UnsupportedOperationException
│   ├── ClassCastException
│   ├── ConcurrentModificationException
│   └── SecurityException
│
└── Error
    ├── OutOfMemoryError
    ├── StackOverflowError
    ├── VirtualMachineError
    │   ├── InternalError
    │   └── UnknownError
    └── AssertionError
```

## 🔷 Checked Exceptions

*(obrigatório tratar ou declarar com `throws`)*

### 🟢 `Exception` — GENÉRICA

> Pai de todas as exceções verificáveis.
> Usada como um "guarda-chuva" para capturar qualquer exceção que herde dela.
> Não use diretamente, prefira tratar as filhas.

---

### 🟢 `IOException` — GENÉRICA

> Erros de entrada/saída: ler arquivos, streams ou rede.
> Ocorre ao tentar ler ou escrever algo e falhar.

```java
FileReader reader = new FileReader("arquivo.txt");
```

---

### 🔵 `FileNotFoundException` — ESPECÍFICA

> Arquivo não encontrado no caminho especificado.
> Subclasse de `IOException`.

---

### 🔵 `EOFException` — ESPECÍFICA

> Final inesperado de um arquivo ou stream.
> Geralmente ao ler um arquivo até o fim e tentar continuar.

---

### 🔵 `SocketException` — ESPECÍFICA

> Problemas ao trabalhar com sockets (rede).
> Conexão quebrada, socket fechado.

---

### 🔵 `MalformedURLException` — ESPECÍFICA

> URL inválida passada para a classe `URL`.
> Exemplo: `new URL("ht!tp://...")`.

---

### 🟢 `SQLException` — GENÉRICA

> Erros relacionados a banco de dados: conexão inválida, SQL errado, tabela inexistente.

---

### 🔵 `ClassNotFoundException` — ESPECÍFICA

> Classe não encontrada no classpath ao usar `Class.forName()`.

---

### 🔵 `InstantiationException` — ESPECÍFICA

> Tentou instanciar uma interface ou classe abstrata com reflexão.

---

### 🔵 `InterruptedException` — ESPECÍFICA

> Uma thread foi interrompida enquanto estava aguardando ou dormindo.

---

### 🔵 `NoSuchMethodException` — ESPECÍFICA

> Tentou acessar um método que não existe usando reflexão.

---

### 🔵 `ParseException` — ESPECÍFICA

> Erro ao converter texto em data, número ou outro formato específico.

---

### 🔵 `InvocationTargetException` — ESPECÍFICA

> Quando um método chamado via reflexão lança uma exceção.

---

---

## 🔷 Unchecked Exceptions

*(não obrigatórias de tratar — tempo de execução)*

---

### 🟢 `RuntimeException` — GENÉRICA

> Pai de todas as exceções de tempo de execução.
> Não requer tratamento explícito.

---

### 🔵 `NullPointerException` — ESPECÍFICA

> Quando você tenta acessar algo através de uma referência `null`.
> Exemplo: `obj.toString()` onde `obj == null`.

---

### 🔵 `ArithmeticException` — ESPECÍFICA

> Operação aritmética inválida, como dividir por zero.

---

### 🟢 `IndexOutOfBoundsException` — GENÉRICA

> Índice inválido em arrays, listas ou strings.

---

### 🔵 `ArrayIndexOutOfBoundsException` — ESPECÍFICA

> Índice inválido em um **array**.

---

### 🔵 `StringIndexOutOfBoundsException` — ESPECÍFICA

> Índice inválido em uma **String**.

---

### 🟢 `IllegalArgumentException` — GENÉRICA

> Argumento inválido passado a um método.

---

### 🔵 `NumberFormatException` — ESPECÍFICA

> Tentativa de converter uma string inválida em número.
> Exemplo: `Integer.parseInt("abc")`.

---

### 🔵 `IllegalStateException` — ESPECÍFICA

> Estado do objeto não permite realizar a operação.

---

### 🔵 `UnsupportedOperationException` — ESPECÍFICA

> Método chamado não é suportado naquela implementação.

---

### 🔵 `ClassCastException` — ESPECÍFICA

> Tentativa de converter para um tipo incompatível.

---

### 🔵 `ConcurrentModificationException` — ESPECÍFICA

> Modificação indevida de uma coleção enquanto ela é percorrida.

---

### 🔵 `SecurityException` — ESPECÍFICA

> Operação não permitida por causa das políticas de segurança.

---

---

## 🔷 Errors

*(erros graves no ambiente ou JVM, raramente tratáveis)*

---

### 🟢 `Error` — GENÉRICA

> Pai de todos os erros graves.

---

### 🔵 `OutOfMemoryError` — ESPECÍFICA

> JVM sem memória.

---

### 🔵 `StackOverflowError` — ESPECÍFICA

> Estouro da pilha, geralmente por recursão infinita.

---

### 🟢 `VirtualMachineError` — GENÉRICA

> Problemas críticos na JVM.

---

### 🔵 `InternalError` — ESPECÍFICA

> Erro interno grave na JVM.

---

### 🔵 `UnknownError` — ESPECÍFICA

> Erro desconhecido dentro da JVM.

---

### 🔵 `AssertionError` — ESPECÍFICA

> Falha em uma assertiva (instrução `assert`).

---

---

# 📌 Resumo do padrão:

| Exceção                           | Tipo          | Quando ocorre?                        |
| --------------------------------- | ------------- | ------------------------------------- |
| `Exception`                       | 🟢 Genérica   | Base para todas as checked exceptions |
| `IOException`                     | 🟢 Genérica   | Entrada/saída                         |
| `FileNotFoundException`           | 🔵 Específica | Arquivo inexistente                   |
| `EOFException`                    | 🔵 Específica | Final de stream inesperado            |
| `SocketException`                 | 🔵 Específica | Problemas em sockets                  |
| `SQLException`                    | 🟢 Genérica   | Erros de SQL/banco de dados           |
| `ClassNotFoundException`          | 🔵 Específica | Classe não encontrada                 |
| `InstantiationException`          | 🔵 Específica | Instanciar abstrata ou interface      |
| `InterruptedException`            | 🔵 Específica | Thread interrompida                   |
| `ParseException`                  | 🔵 Específica | Conversão inválida de texto           |
| `RuntimeException`                | 🟢 Genérica   | Base para todas unchecked exceptions  |
| `NullPointerException`            | 🔵 Específica | Acesso a referência nula              |
| `ArithmeticException`             | 🔵 Específica | Erro aritmético (divisão por zero)    |
| `IndexOutOfBoundsException`       | 🟢 Genérica   | Índice fora do intervalo              |
| `ArrayIndexOutOfBoundsException`  | 🔵 Específica | Índice inválido em array              |
| `StringIndexOutOfBoundsException` | 🔵 Específica | Índice inválido em string             |
| `IllegalArgumentException`        | 🟢 Genérica   | Argumento inválido                    |
| `NumberFormatException`           | 🔵 Específica | String → número inválido              |
| `IllegalStateException`           | 🔵 Específica | Estado incorreto do objeto            |
| `ClassCastException`              | 🔵 Específica | Conversão inválida                    |
| `ConcurrentModificationException` | 🔵 Específica | Modificação durante iteração          |
| `Error`                           | 🟢 Genérica   | Erros graves do sistema               |
| `OutOfMemoryError`                | 🔵 Específica | Sem memória                           |
| `StackOverflowError`              | 🔵 Específica | Recursão infinita                     |
| `VirtualMachineError`             | 🟢 Genérica   | Falha crítica da JVM                  |
| `InternalError`                   | 🔵 Específica | Erro interno grave                    |
| `UnknownError`                    | 🔵 Específica | Erro desconhecido                     |
| `AssertionError`                  | 🔵 Específica | Falha de assertiva                    |

---

