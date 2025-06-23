# 📘 Classes Abstratas em Java
## 🧠 O que são Classes Abstratas?
Uma classe abstrata em Java é uma classe que não pode ser instanciada diretamente. Ela serve como modelo base para outras classes. Você a usa quando quer definir uma estrutura comum (atributos e métodos), mas deixa alguns comportamentos para serem implementados pelas subclasses.

⚠️ Pense nela como uma planta de um prédio: define a estrutura, mas cada andar (subclasse) pode decorar de forma diferente.

## 📌 Características Principais
Usam a palavra-chave abstract

Podem ter métodos abstratos (sem corpo) e métodos concretos (com implementação).

Não podem ser instanciadas com new

Podem ter atributos, construtores e métodos normais

Podem ser estendidas (extends) por outras classes

Sintaxe:
````java

// Classe abstrata
abstract class Animal {
    String nome;

    // Método concreto
    void dormir() {
        System.out.println("Dormindo...");
    }

    // Método abstrato
    abstract void emitirSom();
}

// Subclasse concreta
class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Latindo...");
    }
}
````
Instanciando uma subclasse
````java
public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        meuCachorro.emitirSom();  // Saída: Latindo...
        meuCachorro.dormir();     // Saída: Dormindo...
    }
}
````

## Quando Usar Classes Abstratas
Use classes abstratas quando:

Você tem uma estrutura comum para várias classes, mas detalhes variam.

Quer forçar subclasses a implementar certos métodos.

Está implementando o princípio da herança em sistemas OO.

Precisa compartilhar código entre várias classes relacionadas.


## 🛠️ Exemplos de Uso no Mercado de Trabalho
### Modelos de sistemas bancários
````java
abstract class Conta {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void sacar(double valor);
}

class ContaCorrente extends Conta {
    public void sacar(double valor) {
        saldo -= valor + 0.50; // taxa
    }
}

class ContaPoupanca extends Conta {
    public void sacar(double valor) {
        saldo -= valor; // sem taxa
    }
}
````

###  Componentes de UI em frameworks
````java
abstract class ComponenteUI {
    int x, y;
    
    abstract void desenhar();
}

class Botao extends ComponenteUI {
    void desenhar() {
        System.out.println("Desenha botão");
    }
}

class CaixaDeTexto extends ComponenteUI {
    void desenhar() {
        System.out.println("Desenha caixa de texto");
    }
}
````

### Sistemas de transporte (logística)
````java
abstract class Veiculo {
    abstract void mover();
}

class Carro extends Veiculo {
    void mover() {
        System.out.println("Andando sobre rodas");
    }
}

class Barco extends Veiculo {
    void mover() {
        System.out.println("Navegando");
    }
}
````


## ❓Diferença entre Classe Abstrata e Interface

| Característica | Classe Abstrata            | Interface                     |
| -------------- | -------------------------- | ----------------------------- |
| Herança        | `extends` (uma por vez)    | `implements` (várias)         |
| Métodos        | Pode ter métodos com corpo | Antes do Java 8, só sem corpo |
| Atributos      | Pode ter atributos         | Só constantes (`final`)       |
| Uso principal  | Base com comportamento     | Contrato de métodos           |



## ✅ Boas Práticas
Use abstração para evitar código duplicado.

Não coloque lógica concreta demais na classe abstrata (isso pode limitar a flexibilidade).

Nomeie a classe de forma genérica: Animal, Veiculo, Componente, Conta, etc.

Combine com interfaces quando for necessário múltipla herança de comportamento.





