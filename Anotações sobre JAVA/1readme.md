# Estrutura Básica de um Programa
Um programa Java é organizado em classes. Todo código deve estar dentro de uma classe. Abaixo está a estrutura mínima de um programa Java:

```java
public class NomeDaClasse {
    public static void main(String[] args) {
        // Código principal aqui
        System.out.println("Olá, Mundo!");
    }
}
```

## Modificadores em Java

O que são Modificadores?
Modificadores são palavras-chave em Java que definem propriedades ou comportamentos de classes, métodos, variáveis ou outros elementos. Eles controlam aspectos como acesso (quem pode acessar), comportamento (como o elemento funciona) e escopo (onde o elemento é válido). No desenvolvimento backend, modificadores são essenciais para garantir segurança, encapsulamento e reutilização de código.

### Tipos de Modificadores
Os modificadores em Java são divididos em duas categorias principais:
* Modificadores de Acesso:
   * ``public``: O elemento é acessível de qualquer lugar.

   * ``protected``: Acessível dentro do mesmo pacote ou em subclasses (mesmo em pacotes diferentes).

   * ``default`` (ou package-private, sem modificador explícito): Acessível apenas dentro do mesmo pacote.

   * ``private``: Acessível apenas dentro da mesma classe.

* Modificadores Não Relacionados a Acesso:
   * ``static``: O elemento pertence à classe, não a instâncias (objetos).

   * ``final``: Impede modificação (ex.: variáveis constantes, métodos não sobrescritos, classes não herdadas).

   * ``abstract``: Indica que uma classe ou método é abstrato (não implementado, usado em herança).

   * ``synchronized``: Garante que um método seja acessado por apenas uma thread por vez (usado em sistemas concorrentes).

   * ``transient``: Exclui uma variável da serialização.

   * ``volatile``: Garante visibilidade de alterações em variáveis em ambientes multithread.

##  Quando Usar Modificadores?
* Use public:
   * Para métodos ou classes acessíveis por outros pacotes, como controladores REST (@RestController).

   * Exemplo: Métodos expostos em uma API.

* Use private:
   * Para atributos ou métodos internos de uma classe (ex.: cálculos internos de um serviço).

   * Exemplo: Atributos de uma entidade como id ou senha.

* Use protected:
   * Quando subclasses precisam acessar métodos ou atributos (ex.: em herança).

* Use default:
   * Para classes ou métodos que devem ser acessíveis apenas no mesmo pacote (ex.: classes utilitárias internas).

* Use static:
   * Para métodos ou variáveis compartilhados por todas as instâncias (ex.: contadores globais, métodos utilitários).

* Use final:
   * Para constantes ou para impedir sobrescrita/herança (ex.: configurações fixas).

* Use abstract:
  * Em classes ou métodos que definem contratos, mas deixam a implementação para subclasses (ex.: serviços genéricos).

Estrutura Básica:
````java

[modificadorAcesso] [modificadorNãoAcesso] tipo nome [ = valor]; // Variável
[modificadorAcesso] [modificadorNãoAcesso] tipoRetorno nomeMetodo(parametros) {...} // Método
[modificadorAcesso] [modificadorNãoAcesso] class NomeClasse {...} // Classe

````

## Por que Usar Modificadores?
* Encapsulamento: private e protected protegem dados sensíveis, comuns em entidades backend (ex.: User com senha privada).

* Controle de Acesso: public para APIs expostas, private para lógica interna.

* Reutilização: static para métodos utilitários (ex.: funções compartilhadas).

* Segurança: final para constantes ou métodos que não devem ser alterados.

* Escalabilidade: synchronized para thread-safety em sistemas distribuídos.




