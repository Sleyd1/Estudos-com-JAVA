# Bloco de Inicialização

Blocos de inicialização em Java são trechos de código que são executados automaticamente quando um objeto é criado ou quando a classe é carregada, antes de qualquer construtor ou método ser chamado. Existem dois tipos:

## Bloco de Inicialização de Instância
* Executado toda vez que um objeto é criado.

* Executado antes do construtor.

* Usa chaves {} fora de qualquer método.

  Sintaxe:
````java
  class MinhaClasse {
    // Bloco de inicialização de instância
    {
        System.out.println("Bloco de instância executado");
    }

    // Construtor
    MinhaClasse() {
        System.out.println("Construtor executado");
    }
}
````
## Bloco de Inicialização Estático
* Executado apenas uma vez, quando a classe é carregada na memória pela primeira vez.

* Usa a palavra-chave static.

 Sintaxe:

````
 class MinhaClasse {
    // Bloco de inicialização estático
    static {
        System.out.println("Bloco estático executado");
    }

    MinhaClasse() {
        System.out.println("Construtor executado");
    }
}
````

## Por que usar blocos de inicialização?
* Para evitar repetição de código nos construtores.

* Para configuração inicial de variáveis de instância ou estáticas.

* Quando precisa de lógica de inicialização mais complexa que simples atribuições.



