# Entendendo Construtores e a Herança em Java
#  Conceitos Principais


1. Todas as Classes Herdam de ``Object``
Em Java, **todas as classes** são subclasses (direta ou indiretamente) da classe ``Object`` do pacote ``java.lang``. Isso significa que, mesmo que você não use ``extends``, sua classe herda automaticamente de ``Object``.
Exemplo:
````java

class MinhaClasse {
    // Herda implicitamente de Object
}
````
2. Construtores e a Chamada ao ``super()``
Todo construtor de uma classe precisa inicializar sua superclasse. Isso acontece de duas formas:
* **Implícita**: Se você não chamar super(), o compilador insere automaticamente uma chamada ao construtor padrão (sem parâmetros) da superclasse.

* **Explícita**: Você pode chamar super() com parâmetros para inicializar a superclasse de forma específica.

Exemplo de chamada implícita:
````java

class MinhaClasse {
    public MinhaClasse() {
        // super(); // Chamado implicitamente
        System.out.println("Construtor de MinhaClasse");
    }
}
````
Exemplo de chamada explícita:
````java

class ClassePai {
    public ClassePai(String msg) {
        System.out.println(msg);
    }
}

class ClasseFilha extends ClassePai {
    public ClasseFilha() {
        super("Inicializando ClassePai"); // Chamada explícita
    }
}
````
3. Regras Importantes
A chamada a ``super()`` (ou ``this()``) deve ser a primeira instrução no construtor.

Se a superclasse não tiver um construtor padrão, você deve chamar ``super()`` explicitamente com os parâmetros corretos.

A classe ``Object`` tem um construtor padrão que é chamado implicitamente se sua classe herdar diretamente dela.
