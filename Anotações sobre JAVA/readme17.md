# Generics em Java – Guia Completo 🧠

Um README completo sobre **Generics em Java**, cobrindo desde o básico até os tópicos mais avançados. Este documento é ideal para incluir na documentação de projetos ou estudar o tema com profundidade.

---

## 1. O que são Generics?

Generics permitem que classes, interfaces e métodos operem com **tipos parametrizados**, proporcionando **reutilização** e **segurança de tipo em tempo de compilação**. Java introduziu isso para gerar código mais limpo e reduzir a necessidade de casts explícitos.

Exemplo de classe genérica:

```java
public class Caixa<T> {
  private T conteudo;
  public void set(T t) { this.conteudo = t; }
  public T get() { return conteudo; }
}
```

Uso:

```java
Caixa<String> caixaTexto = new Caixa<>();
caixaTexto.set("Olá");
String s = caixaTexto.get(); // Sem cast, tipo garantido
```

O compilador garante que o tipo `T` é `String`, evitando erros em tempo de execução.

---

## 2. Métodos Genéricos

Você também pode escrever **métodos genéricos**, com tipo próprio:

```java
public static <T> List<T> copia(List<T> lista) {
  return new ArrayList<>(lista);
}
```

Exemplo clássico no JDK:

```java
public static <T> void copy(List<T> dest, List<? extends T> src) { ... }
```

Neste caso o compilador infere `T` automaticamente.

---

## 3. Bounded Type Parameters (Limites)

### 3.1. Upper bounds (`extends`)

```java
public class CaixaNumerica<T extends Number> {
  private T numero;
  public CaixaNumerica(T numero) { this.numero = numero; }
  public double dobro() { return numero.doubleValue() * 2; }
}
```

Isso garante que `T` será `Number` ou subclasse, permitindo chamar `doubleValue()`.

### 3.2. Multiple Bounds

```java
class D<T extends A & B & C> { ... }
```

Quando combinamos classe e interfaces, a classe deve ser a primeira bound.

---

## 4. Wildcards (`?`) e o PECS

### 4.1. Unbounded wildcard (`<?>`)

Aceita qualquer tipo, mas só permite leitura como `Object`:

```java
List<?> qualquer = new ArrayList<String>();
```

### 4.2. `? extends X` (covariância)

Você pode **ler** como `X`, mas **não adicionar**:

```java
List<? extends Number> nums = List.of(1, 2.5);
Number n = nums.get(0); // OK
nums.add(3);            // ERRO de compilação
```

### 4.3. `? super X` (contravariância)

Você pode **escrever** `X`, mas ler como `Object`:

```java
List<? super Integer> li = new ArrayList<Object>();
li.add(42);                     // OK
Object o = li.get(0);           // OK
Integer i = li.get(0);          // ERRO de compilação
```

### 4.4. O mnemonico **PECS** – *Producer Extends, Consumer Super*

* Use `? extends T` quando você está **produzindo** (`lendo`)
* Use `? super T` quando você está **consumindo** (`escrevendo`)

---

## 5. Type Erasure (Eliminação de Tipo)

Generics em Java existem **apenas em tempo de compilação**. Após compilação, todos os parâmetros são substituídos pela bound ou `Object`, e casts são inseridos automaticamente.

### Consequências:

* Não é possível verificar em runtime se um `List<String>` ou `List<Integer>` foi usado
* Não é permitido criar arrays genéricos: `new T[]` é inválido
* Não dá para usar `instanceof List<String>`
* Classes genéricas não ganham múltiplas versões em bytecode – uma só versão é gerada
* Em alguns casos o compilador gera **bridge methods** para manter compatibilidade

---

## 6. Restrições Importantes

* **Não usar tipos primitivos como parâmetro genérico** — sempre use wrappers (`Integer`, `Double`, etc.)
* **Não é possível instanciar `new T()`**, declarar array de `T`, usar `instanceof` com tipos genéricos
* **Não é permitido membros estáticos com T** (`static T x;`) ou `throws T`
* **Não é permitido usar generics com exceções**

---

## 7. Recursos Avançados

### 7.1. Generic Constructors

Construtores genéricos em classes (mesmo que não genéricas):

```java
class MyClass<X> {
  <T> MyClass(T valor) { /* ... */ }
}
```

### 7.2. Recursive Type Bounds (CRTP)

```java
class SelfReferencing<T extends SelfReferencing<T>> {
  T self() { return (T) this; }
}
```

Usado em `Enum<E extends Enum<E>>`, builders encadeados, etc.

### 7.3. Diamond Operator (`<>`)

Desde Java 7:

```java
List<String> lista = new ArrayList<>();
```

---

## 8. Boas Práticas

* **Evite raw types**: `List` sem `<T>` quebra segurança de tipo
* Prefira **wildcards adequados** (`extends`/`super`) para APIs flexíveis
* Use **diamond operator** para reduzir repetição
* Entenda as **limitações do type erasure**
* Comente ou documente usos avançados como `builders`, `CRTP`, `wildcards aninhados`

---

## 9. 📜 Resumo Geral

| Tema                 | Benefício / Cuidados                                                 |
| -------------------- | -------------------------------------------------------------------- |
| `Caixa<T>`           | Segurança de tipo + reutilização                                     |
| `<T extends Number>` | Permite usar métodos específicos do bound                            |
| `List<? extends T>`  | Leitura segura, adição restrita                                      |
| `List<? super T>`    | Adição segura, leitura como `Object`                                 |
| **PECS**             | *Producer Extends*, *Consumer Super*                                 |
| Type Erasure         | Segurança em tempo de compilação; sem info de tipo em runtime        |
| Limitações           | Sem generics com primitive, arrays, instanceof, exceptions genéricas |
| Generic Constructors | Construtores independentes de classe genérica                        |
| Recursive Bounds     | Permitem padrões poderosos (builders, enums)                         |
| Diamond (`<>`)       | Código mais curto e limpo                                            |

---

### Conclusão

Os **Generics em Java** são fundamentais para escrever código **limpo**, **seguro**, e **reutilizável**. Dominar desde o básico até padrões avançados — como wildcard variance, type erasure, generic constructors e recursive type bounds — eleva muito o nível de APIs e frameworks em Java moderno.

Caso deseje aprofundar ainda mais, podemos explorar exemplos com **reflexão**, **annotations**, ou **capture conversion**!
