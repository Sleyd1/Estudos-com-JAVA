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
