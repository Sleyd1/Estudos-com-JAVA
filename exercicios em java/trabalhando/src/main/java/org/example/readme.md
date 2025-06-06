# Espaço em memória 
O espaço em memória que o Java usa é o espaço da memória RAM do computador, mas com alguns detalhes importantes:

🔹 Como funciona
Quando você executa um programa Java:

O sistema operacional reserva uma parte da memória RAM física do computador para o processo da JVM (Java Virtual Machine).

Essa memória é então gerenciada pela JVM internamente (com áreas como Heap, Stack, etc.).

A JVM não usa toda a RAM do computador, apenas uma fatia que ela aloca para rodar o programa.

Visão geral das áreas de memória usadas pelo Java

Quando você executa um programa Java, a JVM organiza a memória em várias áreas específicas dentro da memória RAM do computador:

+------------------+
|  PC Register     | → Linha atual que cada thread está executando
+------------------+
|  Native Method   | → Chamadas de métodos nativos (C/C++ por exemplo)
+------------------+
|  JVM Stack       | → Variáveis locais e chamadas de métodos
+------------------+
|  Heap            | → Objetos e instâncias de classes
+------------------+
|  Metaspace       | → Classes carregadas e metadados
+------------------+

## Heap (Monte)
* O que é: Área da memória onde os objetos são armazenados.

* Gerenciado pelo Garbage Collector (GC).

* Tudo que é criado com new vai pro Heap.
ex:
````java
Pessoa p = new Pessoa();  // objeto "p" vai para o Heap
````

* Cresce conforme você cria objetos.

* Quando não há mais referências a um objeto, o GC pode liberar o espaço dele.
## Stack (Pilha)
* O que é: Área usada para armazenar variáveis locais e informações de métodos em execução.

* Cada thread tem sua própria Stack.

* Mais rápida, mas limitada.
ex:
````java
public void exemplo() {
int x = 10;  // 'x' está na Stack
}
````
* Quando o método termina, a pilha é "desempilhada" e a memória liberada automaticamente.

## PC Register (Program Counter)
* Guarda a posição da próxima instrução que a thread atual irá executar.

* Cada thread tem o seu próprio PC Register.

## Native Method Stack
* Usada quando o Java chama métodos nativos escritos em outra linguagem (como C/C++).

Ex: ``System.gc()`` ou bibliotecas externas.

## Metaspace (antes chamado PermGen)
Armazena metadados das classes, como:

* Estrutura de classes

* Métodos

* Informações de herança

* Desde o Java 8, o PermGen foi substituído por Metaspace, que usa a RAM de forma mais flexível

Em resumo:
Item |	Explicação |
-----|-----|
Memória usada pelo Java|	Vem da RAM do computador|
Gerenciada pela|	JVM (Java Virtual Machine)|
Controlável?|	Sim, com parâmetros como -Xms e -Xmx|
Influencia o desempenho?|	Muito! Pouca memória = programa lento ou erro OutOfMemoryError|
