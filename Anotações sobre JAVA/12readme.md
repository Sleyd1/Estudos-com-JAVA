# 📘 Interfaces em Java
🧠 O que é uma Interface?
Uma interface em Java é um tipo especial que define um contrato: um conjunto de métodos que devem ser implementados por qualquer classe que "assina" essa interface.

💡 Pense em uma interface como uma tomada elétrica: ela define onde e como plugar, mas quem implementa (a classe) define o que acontece quando você liga algo nela.

## 📌 Características Principais
Usam a palavra-chave interface

Todos os métodos são abstratos por padrão (até o Java 7)

A partir do Java 8, pode conter métodos default e estáticos

Não pode ter construtores

Não pode ter atributos de instância (apenas constantes: public static final)

Suporta múltipla implementação (diferente de classes abstratas)

São implementadas com a palavra implements

sintaxe basica:

````java
// Interface
interface Animal {
    void emitirSom();  // método sem corpo
}

// Classe que implementa
class Cachorro implements Animal {
    public void emitirSom() {
        System.out.println("Latindo...");
    }
}

````

Usando a interface:
````java
public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.emitirSom(); // Saída: Latindo...
    }
}
````

## 🛠️ Exemplos de Uso no Mercado de Trabalho
1. Plugins e sistemas extensíveis
Interfaces são ideais para permitir que várias classes diferentes compartilhem o mesmo comportamento esperado, sem depender de herança direta.

````java
interface Plugin {
    void iniciar();
    void parar();
}

class EditorTexto implements Plugin {
    public void iniciar() { System.out.println("Editor iniciado"); }
    public void parar()   { System.out.println("Editor parado"); }
}

class NavegadorWeb implements Plugin {
    public void iniciar() { System.out.println("Navegador iniciado"); }
    public void parar()   { System.out.println("Navegador parado"); }
}
````

2. Regras de negócio com polimorfismo

````java
interface Pagamento {
    void realizarPagamento(double valor);
}

class CartaoCredito implements Pagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com cartão: R$" + valor);
    }
}

class Boleto implements Pagamento {
    public void realizarPagamento(double valor) {
        System.out.println("Gerando boleto de: R$" + valor);
    }
}
````

## 🆕 Recursos novos em Interfaces (Java 8+)
✅ default methods
Permite fornecer uma implementação padrão, sem obrigar as classes a implementarem.

````java
interface Animal {
    default void respirar() {
        System.out.println("Respirando...");
    }
    void emitirSom();
}
````

✅ static methods
Permite métodos utilitários:

````java
interface Util {
    static void imprimir(String msg) {
        System.out.println(msg);
    }
}
````

## 📌 Interfaces Funcionais (Java 8+)
Usadas em programação funcional (como lambda). Contêm apenas um método abstrato.
````java
@FunctionalInterface
interface Operacao {
    int executar(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Operacao soma = (a, b) -> a + b;
        System.out.println(soma.executar(3, 4));  // Saída: 7
    }
}
````

## ✅ Boas Práticas
Nomeie interfaces com verbos ou adjetivos (ex: Serializable, Runnable, Pagamento)

Use interfaces para definir regras de negócio ou comportamentos comuns

Combine interfaces com injeção de dependência para código desacoplado

Prefira interfaces quando precisa de múltiplos comportamentos distintos








