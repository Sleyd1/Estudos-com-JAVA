# Métodos em Java

## O que são Métodos?
Métodos são blocos de código que executam uma tarefa específica, geralmente reutilizável, e podem receber parâmetros e retornar valores. No desenvolvimento backend, métodos implementam lógica de negócios, processam requisições, ou interagem com bancos de dados.

## Por que Usar Métodos?
Reutilização: Evita duplicação de código (ex.: um método para validar usuário).

Modularidade: Divide a lógica em partes menores e organizadas.

Manutenibilidade: Facilita testes e alterações (ex.: métodos em serviços separados).

Abstração: Esconde detalhes de implementação (ex.: um método salvarUsuario não expõe como o banco é acessado).

Estrutura Básica
````java

[modificadorAcesso] [modificadorNãoAcesso] tipoRetorno nomeMetodo(tipo1 param1, tipo2 param2) {
    // Código
    return valor; // Opcional, se tipoRetorno não for void
}

````
* Modificadores: Definidos acima (ex.: public, private, static).

* tipoRetorno: Tipo do valor retornado (ex.: int, String, void para nenhum retorno).

* nomeMetodo: Nome descritivo (ex.: calcularTotal, salvarUsuario).

* parametros: Entradas opcionais (ex.: String nome).

## Quando Usar Métodos?
* Lógica Reutilizável: Crie métodos para tarefas repetidas (ex.: validação de entrada).

* Separação de Responsabilidades: Cada método deve ter uma única função (ex.: um método para buscar usuário, outro para atualizar).

* Integração com Frameworks: No backend, métodos são mapeados para endpoints (ex.: @GetMapping) ou usados em serviços.

* Testabilidade: Métodos isolados são mais fáceis de testar com frameworks como JUnit.

Exemplo:

````java
@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    // Método público para salvar pedido
    public Order salvarPedido(Order order) {
        if (validarPedido(order)) { // Chama método privado
            return repository.save(order);
        }
        throw new IllegalArgumentException("Pedido inválido");
    }

    // Método privado para validação
    private boolean validarPedido(Order order) {
        return order.getItems() != null && !order.getItems().isEmpty();
    }

    // Método estático utilitário
    public static double calcularImposto(double valor) {
        final double TAXA = 0.1;
        return valor * TAXA;
    }
}
````


## Boas Práticas
* Nomenclatura Clara: Use nomes descritivos (ex.: buscarUsuarioPorId).

* Single Responsibility: Cada método deve fazer uma coisa só.

* Evite Métodos Longos: Divida métodos complexos em métodos menores.





