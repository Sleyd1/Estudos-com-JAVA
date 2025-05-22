# Estrutura Básica de um Programa

```
public class NomeDaClasse {
    public static void main(String[] args) {
        // Código principal aqui
        System.out.println("Olá, Mundo!");
    }
}
```
* public class: Define uma classe pública. O nome da classe deve corresponder ao nome do arquivo (ex.: NomeDaClasse.java).
* main: O método main é o ponto de entrada do programa. Ele deve ser public, static, retornar void e aceitar um array de String como argumento.



# Variáveis

* É um espaço na memoria do computador que podem ser usadas para armazenar valores.
* Java é uma linguagem fortemente tipada, ou seja, toda variável deve ter um tipo declarado.


# Palavras-chave

Java possui palavras reservadas que não podem ser usadas como identificadores (nomes de variáveis, classes, etc.). Exemplos:
* `class`, `public`, `static`, `void`, `int`, `if`, `else`, `for`, `while`, `return`, entre outras


# Tipos de Dados
Java é uma linguagem fortemente tipada, ou seja, toda variável deve ter um tipo declarado. Os tipos são divididos em:
Tipos Primitivos:
Inteiros: `byte`, `short`, `int`, `long`

Ponto flutuante: `float`, `double`

Caractere: `char´`

Booleano: `boolean`

Tipos de Referência:
Classes, interfaces, arrays, enums e `String`.
Exemplo:

`String nome = "João";`

# Variáveis e Constantes
Declaração de variáveis: ``tipo nome = valor;``

Constantes: Usam a palavra-chave ``final``.

``final double PI = 3.14159;``

Operadores
* Aritméticos: ``+``, ``-``, ``*``, ``/``, ``%``

* Relacionais: ``==``, ``!=``, ``>``, ``<``, ``>=``, ``<=``

* Lógicos: ``&&``, ``||``, ``!``

* Atribuição: ``=``, ``+=``, ``-=``, ``etc``.

* Outros: ``instanceof``, ``new``

Modificadores e Métodos:

* Classes usam modificadores (public, private) para controlar acesso a atributos e métodos.

* Métodos dentro de classes implementam lógica (ex.: calcularTotal).

* Exemplo: private Item[] itens; (atributo encapsulado) e public double calcularTotal() (método exposto).



