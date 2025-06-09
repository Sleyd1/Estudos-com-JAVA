# Modicador statico

 o modificador static é usado para indicar que um membro (variável ou método) pertence à classe, e não a uma instância (objeto) dela. Isso significa que você pode acessar membros static sem criar um objeto da classe.

 ## Métodos estáticos
 Um método estático (static) é um método que pertence à classe, e não a uma instância (objeto). Isso significa que você pode chamá-lo sem criar um objeto da classe.

 Sintaxe:
 ````java
public class MinhaClasse {
    public static void meuMetodo() {
        System.out.println("Método estático chamado");
    }
}
````
### Regras dos métodos static
* Não pode acessar membros de instância (não estáticos) diretamente.

* Você não pode usar this dentro de um método static.

* Pode acessar outros membros static da classe.

* Pode ser chamado diretamente pela classe (sem new).

#### Exemplo prático
````java
public class Matematica {

    public static int quadrado(int x) {
        return x * x;
    }

    public static double pi = 3.1415;
}
````

uso:
````java
int resultado = Matematica.quadrado(5); // 25
double valorDePi = Matematica.pi;       // 3.1415
````

### Quando usar métodos estáticos?
Use métodos static quando:

Eles não dependem de atributos do objeto (por exemplo: métodos utilitários ou matemáticos).

Você quer criar funções de ajuda (helper methods).

Eles executam lógica comum e não precisam de estado interno.


## Variáveis static (variáveis de classe)
sintaxe:
````java
public class Exemplo {
    static int contador = 0;

    public Exemplo() {
        contador++;
    }
}
````
* ``contador`` é compartilhado entre todas as instâncias da classe Exemplo.

* Se você criar 5 objetos, o valor de contador será incrementado para 5, porque todas as instâncias compartilham essa variável.
