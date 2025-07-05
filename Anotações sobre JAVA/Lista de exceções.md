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

