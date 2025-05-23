# O que é um Construtor?
Um construtor em Java é um método especial dentro de uma classe que é chamado automaticamente quando um objeto dessa classe é criado (usando new). Ele tem o mesmo nome da classe e não possui tipo de retorno (nem mesmo void). Construtores são usados para inicializar os atributos de um objeto, garantindo que ele esteja em um estado válido logo após sua criação.

## Características principais:
* Nome: Igual ao nome da classe.

* Sem tipo de retorno: Não retorna valores explicitamente.

* Pode ter parâmetros: Para inicializar atributos com valores fornecidos.

* Pode ser sobrecarregado: Uma classe pode ter múltiplos construtores com diferentes assinaturas (lista de parâmetros).

EX:
````
public class User {
    private Long id;
    private String nome;

    // Construtor
    public User(Long id, String nome) {
        this.id = id; // Inicializa atributo id
        this.nome = nome; // Inicializa atributo nome
    }
}
````


Instanciação:
````
User user = new User(1L, "João"); // Chama o construtor
````

## Quando Usar Construtores?
Você deve usar construtores em Java nas seguintes situações:
* Quando os Atributos Precisam de Inicialização Obrigatória:
   * Use um construtor para exigir que certos atributos sejam fornecidos na criação do objeto.

   * Exemplo: Um User deve sempre ter um id e nome.

* Para Validar Dados na Criação:
   * Construtores podem incluir lógica de validação para garantir que o objeto seja criado em um estado consistente.

   * Exemplo: Verificar se uma lista de itens não é nula.

* Quando Há Dependências Externas:
   * No backend, use construtores para injetar dependências (ex.: repositórios, serviços) em classes como controladores ou serviços.

  * Exemplo: Injeção de um UserRepository em um UserService.

* Para Oferecer Flexibilidade:
  * Crie múltiplos construtores para diferentes cenários (sobrecarga).

  * Exemplo: Um construtor completo com todos os atributos e outro simplificado com valores padrão.

* Quando Usar com Frameworks:
   * Em Spring, construtores são preferidos para injeção de dependências, pois garantem que os objetos sejam imutáveis e inicializados corretamente.

## Quando NÃO Usar Construtores?
* Valores Opcionais: Se um atributo pode ser inicializado depois (via setters), você pode omitir do construtor.

* Lógica Complexa: Evite construtores com lógica muito pesada; delegue para métodos ou fábricas.

* Objetos Simples: Para classes utilitárias com métodos static, construtores podem ser desnecessários.




