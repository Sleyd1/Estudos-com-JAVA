 # Estrutura Básica de um Programa
Um programa Java é organizado em classes. Todo código deve estar dentro de uma classe. Abaixo está a estrutura mínima de um programa Java:
````java

public class NomeDaClasse {
    public static void main(String[] args) {
        // Código principal aqui
        System.out.println("Olá, Mundo!");
    }
}

````


## Classes em Java
O que são Classes?
Uma classe em Java é um modelo ou blueprint que define as propriedades (atributos) e comportamentos (métodos) de um org.wrappers.trabalhandcomobj1.objetoex.objeto. Classes são a base da programação orientada a objetos (POO) em Java, permitindo encapsular dados e funcionalidades relacionadas. No contexto backend, classes são usadas para modelar entidades (ex.: ``User``, ``Order``), serviços, controladores, ou repositórios.

Exemplo Simples:
````java
public class User {
    // Atributos (propriedades)
    private Long id;
    private String nome;

    // Construtor
    public User(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Método (comportamento)
    public String getNome() {
        return nome;
    }
}
````
## Por que Usar Classes em Java?
Java é uma linguagem orientada a objetos, e classes são fundamentais por causa dos princípios da POO:
* Encapsulamento: Classes agrupam dados (atributos) e métodos, protegendo dados sensíveis com modificadores como ``private``.
   * Exemplo: Um atributo senha em uma classe User pode ser privado, acessado apenas por métodos específicos.

* Reutilização: Classes permitem criar objetos reutilizáveis em diferentes partes do código.
   * Exemplo: Um org.wrappers.trabalhandcomobj1.objetoex.objeto User pode ser usado em múltiplos serviços (autenticação, perfil).

* Modularidade: Classes organizam o código, separando responsabilidades (ex.: uma classe para lógica de negócios, outra para acesso ao banco).

* Herança: Classes podem estender outras classes para compartilhar comportamentos (ex.: uma classe Admin estende User).

* Polimorfismo: Classes permitem que objetos sejam tratados de forma genérica (ex.: uma lista de User pode conter Admin e Client).

No desenvolvimento backend, classes são usadas para:
* Modelar Entidades: Representar dados do banco (ex.: ``@Entity`` para JPA).

* Controladores: Lidar com requisições HTTP (ex.: ``@RestController`` em Spring).

* Serviços: Implementar lógica de negócios.

* Utilitários: Agrupar funções estáticas.

Uma classe é um contêiner que agrupa:

* Atributos: Dados (ex.: ``id``, ``nome``).

* Métodos: Funções que operam nesses dados ou executam tarefas.

## Como Utilizar Classes em Java?
* Definir a Classe:
   * Use a palavra-chave class seguida do nome (em CamelCase).

   * Inclua atributos, construtores e métodos.

* Criar Objetos:
   * Use new para instanciar a classe.

   * Exemplo: ``User user = new User(1L, "João");``.

* Acessar Atributos e Métodos:
   * Use `` . ``para acessar métodos ou atributos (se públicos).

   * Exemplo: ``user.getNome()``.

* Aplicar no Backend:
   * Use classes para modelar dados, serviços ou endpoints.

   * Integre com frameworks como Spring para funcionalidades avançadas.

Estrutura Básica:
````java

[modificador] class NomeClasse {
    // Atributos
    [modificador] tipo nomeAtributo;

    // Construtor
    public NomeClasse(tipo param) {
        this.nomeAtributo = param;
    }

    // Métodos
    [modificador] tipoRetorno nomeMetodo(params) {
        // Código
    }
}


````

Quando Usar Classes?
* Modelar Entidades: Para representar dados do domínio (ex.: ``User``, ``Product``).

* Organizar Lógica: Para serviços ou controladores (ex.: ``UserService``, ``OrderController``).

* Reutilização: Quando você precisa criar múltiplos objetos com o mesmo comportamento.

* Encapsulamento: Para proteger dados e expor apenas métodos necessários.





