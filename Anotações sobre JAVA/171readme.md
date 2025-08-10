# 📚 Classes Utilitárias em Java

Este documento apresenta um guia completo sobre **classes utilitárias em Java**, com foco em:

* Wrapper Classes
* Manipulação de Strings e desempenho (`String` vs `StringBuilder`)
* APIs de Data e Hora (`Date`, `Calendar`, `DateFormat`)
* Exemplos reais aplicados ao mercado de trabalho

---

## 🔶 1. Wrapper Classes (Classes Envolventes)

### ✅ O que são

Wrapper Classes são versões *objetos* dos tipos primitivos do Java:

| Primitivo | Wrapper     |
| --------- | ----------- |
| `int`     | `Integer`   |
| `double`  | `Double`    |
| `char`    | `Character` |
| `boolean` | `Boolean`   |

### ✅ Por que usar

* Permite trabalhar com coleções genéricas (`List<Integer>`, etc.)
* Suporte a valores `null`
* Métodos utilitários (`parseInt`, `valueOf`, `MIN_VALUE`, etc.)

### ⚠️ Cuidados

* Mais lentos que primitivos (alocam memória na heap)
* Envolvem autoboxing/unboxing (sobrecarga de desempenho)
* Em operações de alto volume, prefira primitivos

### 📌 Exemplo

```java
List<Integer> lista = new ArrayList<>();
for (int i = 0; i < 1_000_000; i++) {
    lista.add(i); // autoboxing
}

long soma = 0;
for (Integer valor : lista) {
    soma += valor; // unboxing
}
```

---

## 🧵 2. Strings: Desempenho e StringBuilder

### 🔍 Desempenho com String

`String` é **imutável**, logo cada concatenação cria um novo objeto.

```java
String s = "";
for (int i = 0; i < 1000; i++) {
    s += i; // Cria novo objeto em cada iteração
}
```

### 🚀 Solução: `StringBuilder`

Classe mutável para manipulação de strings em loops ou concatenações pesadas.

```java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i);
}
String resultado = sb.toString();
```

**💡 Quando usar:** Geração de logs, construção dinâmica de mensagens, templates, arquivos CSV/JSON, etc.

---

## 🕓 3. Datas: Date, Calendar e DateFormat

### 🗓️ Date

Classe legada que representa um instante no tempo. Muitos métodos estão obsoletos.

### 🧮 Calendar

Permite manipular campos individuais (ano, mês, dia...). Substitui vários métodos antigos de `Date`.

```java
Calendar cal = Calendar.getInstance();
cal.set(Calendar.YEAR, 2025);
Date data = cal.getTime();
```

### 🧷 DateFormat e SimpleDateFormat

Permite formatar e analisar datas como texto. Suporte a internacionalização.

```java
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
String dataFormatada = sdf.format(new Date());

Date dataConvertida = sdf.parse("04/08/2025 10:00:00");
```

⚠️ **Não são thread-safe!**
Use uma instância por thread ou considere `java.time` no Java 8+.

---

## 💼 4. Aplicação no Mercado de Trabalho

### 💰 Exemplo: Registro de Transações Financeiras

```java
public class Transacao {
    private Integer id;           // null antes da persistência
    private BigDecimal valor;     // precisão para valores monetários
    private Date dataHora;

    private static final DateFormat SDF =
        new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Transacao(Integer id, BigDecimal valor, Date dataHora) {
        this.id = id;
        this.valor = valor;
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("Transacao [")
            .append("id=").append(id != null ? id : "novo")
            .append(", valor=").append(valor)
            .append(", data=").append(SDF.format(dataHora))
            .append("]")
            .toString();
    }
}
```

### 🌐 Exemplo: Formatação de Data Internacionalizada

```java
DateFormat dfBr = DateFormat.getDateTimeInstance(
    DateFormat.MEDIUM, DateFormat.MEDIUM, new Locale("pt", "BR"));

String dataBR = dfBr.format(new Date());
```

---

## 🧾 Resumo

| Tópico              | Quando Usar                           | Cuidados / Vantagens                               |
| ------------------- | ------------------------------------- | -------------------------------------------------- |
| **Wrapper Classes** | Coleções, valores nulos, métodos      | Mais lentos que primitivos. Atenção ao desempenho. |
| **StringBuilder**   | Concatenar em loops ou grandes blocos | Evita alocação excessiva de memória com `String`   |
| **Date/Calendar**   | APIs legadas ou bibliotecas antigas   | Substituído por `java.time` em novos projetos      |
| **DateFormat**      | Formatar datas com padrões locais     | Não é thread-safe. Ideal para logs ou visualização |

---

## ✅ Recomendações Modernas

Para novos projetos Java (Java 8+), use:

* `LocalDate`, `LocalDateTime` → datas imutáveis e seguras
* `DateTimeFormatter` → thread-safe e flexível

---
