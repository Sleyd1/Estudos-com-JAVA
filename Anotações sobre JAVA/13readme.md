# 📘 Polimorfismo em Java
## 🧠 O que é Polimorfismo?
Polimorfismo vem do grego e significa "muitas formas".
Na programação, polimorfismo é a capacidade de um mesmo método ou objeto se comportar de maneiras diferentes, dependendo do contexto.

Em Java, o polimorfismo permite:

Tratar diferentes objetos de forma genérica

Usar o mesmo nome de método, mas com comportamentos diferentes

Escrever código mais flexível e reutilizável

## 📌 Tipos de Polimorfismo


| Tipo                       | Nome técnico          | Quando ocorre                    |
| -------------------------- | --------------------- | -------------------------------- |
| **Em tempo de compilação** | Polimorfismo estático | Usando **sobrecarga de métodos** |
| **Em tempo de execução**   | Polimorfismo dinâmico | Usando **herança + sobrescrita** |


 1. Polimorfismo Estático (Sobrecarga de Métodos)
Vários métodos com o mesmo nome, mas parâmetros diferentes.

````java
class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }

    double somar(double a, double b) {
        return a + b;
    }

    int somar(int a, int b, int c) {
        return a + b + c;
    }
}
````

2. Polimorfismo Dinâmico (Sobrescrita + Herança)
Um método definido na superclasse é redefinido (sobrescrito) nas subclasses.
````java
class Animal {
    void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Latindo");
    }
}

class Gato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Miando");
    }
}
````

Exemplo de uso:
````java
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.emitirSom(); // Latindo
        a2.emitirSom(); // Miando
    }
}
````
Exemplo de uso no mercado de trabalho
1. Sistema de pagamentos
````java
interface Pagamento {
    void pagar(double valor);
}

class CartaoCredito implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento com cartão: R$" + valor);
    }
}

class Pix implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento via PIX: R$" + valor);
    }
}

// Código principal
public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new CartaoCredito();
        Pagamento p2 = new Pix();

        p1.pagar(100); // Cartão
        p2.pagar(50);  // Pix
    }
}
````
## Vantagens do Polimorfismo
Reutilização de código

Flexibilidade no desenvolvimento

Facilita manutenção e extensão

Permite trabalhar com tipos genéricos (superclasses ou interfaces)

🔐 Combinações comuns com polimorfismo

| Conceito              | Usado com polimorfismo? | Explicação                                               |
| --------------------- | ----------------------- | -------------------------------------------------------- |
| **Interfaces**        | ✅ Sim                   | Você chama métodos genéricos sem saber a classe concreta |
| **Herança**           | ✅ Sim                   | Subclasses podem ter comportamento específico            |
| **Métodos abstratos** | ✅ Sim                   | Forçam implementação diferente nas subclasses            |

## 📌 Boas práticas
Use polimorfismo para desacoplar o código.

Evite usar instanceof e cast manual sempre que puder — isso quebra o polimorfismo.

Prefira interfaces ou superclasses como tipo de referência.

Combine com design patterns, como Strategy, Factory, Template Method, etc.

