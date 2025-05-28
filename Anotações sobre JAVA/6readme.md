# Atributos (Propriedades)
**Atributos**, também chamados de **propriedades** ou **campos** em Java, são variáveis definidas dentro de uma classe que representam o **estado** ou as **características** de um org.example.trabalhandcomobj1.objetoex.objeto dessa classe. Eles armazenam os dados associados a um org.example.trabalhandcomobj1.objetoex.objeto e são a base para modelar entidades no paradigma da programação orientada a objetos (POO). Em Java, atributos são geralmente declarados com modificadores de acesso (ex.: private) para garantir encapsulamento.

Características principais:
* Declaração: Definidos no escopo da classe, fora de métodos ou construtores.

* Tipos: Podem ser primitivos (``int``, ``double``, ``boolean``) ou de referência (``String``, arrays, outras ``classes``).

* Modificadores: Podem ter modificadores como ``private``, ``public``, ``final``, ``static``, etc.

* Acesso: Normalmente acessados via métodos getters e setters para manter encapsulamento.

Exemplo Simples:
````java
public class User {
    // Atributos
    private Long id;
    private String nome;
    private boolean ativo;

    // Construtor
    public User(Long id, String nome) {
        this.id = id; // Inicializa atributo
        this.nome = nome;
        this.ativo = true; // Valor padrão
    }

    // Getters e Setters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public boolean isAtivo() { return ativo; }
}


````

Instanciação:
````java

User user = new User(1L, "João");
System.out.println(user.getNome()); // Saída: João
````

## Para que Servem Atributos?
Atributos são essenciais na programação orientada a objetos e no desenvolvimento backend pelos seguintes motivos:
* Representar o Estado de um Objeto:
   * Atributos armazenam as características de um org.example.trabalhandcomobj1.objetoex.objeto, como id, nome ou saldo de um User.

   * No backend, representam dados de entidades persistidas no banco (ex.: colunas de uma tabela).

* Encapsulamento:
   * Atributos são geralmente private, permitindo que sejam acessados ou modificados apenas por métodos controlados (getters/setters), protegendo a integridade dos dados.

   * Exemplo: Um atributo senha só pode ser alterado por um método setSenha com validação.

* Modelagem do Domínio:
   * Atributos definem as propriedades de entidades do negócio (ex.: ``Order`` com ``id``, ``itens``, total).

   * Em frameworks como Spring com JPA, atributos mapeiam diretamente para colunas de banco de dados.

* Flexibilidade:
  * Atributos permitem que objetos mantenham estados diferentes (ex.: dois objetos User com nomes distintos).

  * Podem ser inicializados via construtores, setters ou valores padrão.

* Integração com Lógica:
   * Atributos são manipulados por métodos para implementar lógica de negócios (ex.: calcular o total de um pedido baseado em itens).

## Estrutura Básica de Atributos
Sintaxe:
````java

[modificador] tipo nomeAtributo [ = valorInicial];
````
* Modificador: Controla acesso ou comportamento (ex.: ``private``, ``public``, ``final``, ``static``).

* Tipo: Primitivo (``int``, ``double``) ou de referência (``String``, ``List``, classe personalizada).

* Nome: Nome descritivo em camelCase (ex.: nomeUsuario, saldoConta).

* Valor Inicial: Opcional; se não especificado, usa valores padrão (ex.: 0 para ``int``, ``null`` para objetos).



