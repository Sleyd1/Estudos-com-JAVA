# 🧠 O que é **Stack** (Pilha) em termos de memória – Java e programação

---

## 📌 Definição técnica

A **Stack** (ou **pilha**) é uma **área de memória usada em tempo de execução**, **gerenciada pela JVM**, para armazenar:

* Chamadas de métodos
* Variáveis locais
* Endereços de retorno (pra onde voltar depois de um método terminar)

Ela funciona como uma **pilha LIFO** (último que entra, primeiro a sair).

---

## 🧱 Stack vs Heap – Memória na JVM

| Área      | O que armazena                        | Quem gerencia?    | Tempo de vida              |
| --------- | ------------------------------------- | ----------------- | -------------------------- |
| **Stack** | Variáveis locais, chamadas de métodos | JVM               | Durante execução do método |
| **Heap**  | Objetos e dados dinâmicos             | Garbage Collector | Enquanto houver referência |

---

## 🔄 Como funciona a stack na memória

Quando um método é chamado:

* É criado um **frame** (bloco de memória) para esse método na stack
* Esse frame guarda:

  * Parâmetros do método
  * Variáveis locais
  * Endereço para onde retornar após a execução

Quando o método termina, o frame **é removido da stack** automaticamente.

---

### 🔁 Exemplo em memória (simulado)

```java
public class Exemplo {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        b();
    }

    public static void b() {
        int x = 10;
        System.out.println(x);
    }
}
```

📦 Durante execução, a stack estará assim:

```
[Frame de b()]      ← método b está ativo
[Frame de a()]      ← a chamou b
[Frame de main()]   ← main chamou a
```

Quando `b()` termina, seu frame é retirado da stack, e o controle volta para `a()`.

---

## 💥 O que é **Stack Overflow** (rompimento da stack)

### 🔴 Definição

Um **StackOverflowError** ocorre quando a **stack de chamadas cresce demais e ultrapassa o limite de memória**.

Isso acontece geralmente por chamadas recursivas infinitas (ou quase infinitas), como:

```java
public class LoopInfinito {
    public static void main(String[] args) {
        chamar();
    }

    public static void chamar() {
        chamar(); // chamada recursiva infinita
    }
}
```

➡ Cada vez que `chamar()` é executado, um novo **frame** é adicionado à stack, sem nunca remover os anteriores.

### 🚨 Resultado:

```
Exception in thread "main" java.lang.StackOverflowError
```

---

## 🔧 Quanto de memória tem a stack?

* O tamanho da **stack** é **limitado** (por padrão, depende da JVM e do sistema operacional).
* No Java, o tamanho padrão pode variar entre **256 KB a 1 MB por thread**.
* Pode ser ajustado com a flag:

  ```bash
  java -Xss512k MinhaClasse
  ```

---

## 🧠 Resumo rápido

| Termo                     | Significado técnico                                      |
| ------------------------- | -------------------------------------------------------- |
| **Stack (memória)**       | Área da RAM para chamadas de métodos e variáveis locais  |
| **Frame**                 | Bloco de memória criado por cada método chamado          |
| **Rompimento (overflow)** | Quando há chamadas demais, a stack ultrapassa o limite   |
| **StackOverflowError**    | Erro que ocorre quando a pilha não comporta mais métodos |
| **Heap**                  | Onde vivem os objetos criados com `new`                  |

