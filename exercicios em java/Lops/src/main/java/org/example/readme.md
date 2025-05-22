## Loop for (Tradicional)
O loop for é usado quando você sabe o número exato de iterações ou precisa controlar um contador (como índices de um array). É muito comum para iterar sobre arrays ou realizar repetições baseadas em índices.
Sintaxe
````

for (inicialização; condição; atualização) {
    // Bloco de código a ser executado
}

````
* Inicialização: Executada uma vez antes do loop começar (ex.: declarar e inicializar um contador).

* Condição: Verificada antes de cada iteração; se for true, o loop continua.

* Atualização: Executada após cada iteração (ex.: incrementar o contador).

````

public class ExemploFor {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50}; // Array de inteiros
        for (int i = 0; i < numeros.length; i++) { // i é o índice
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }
}
````

##### saida
````
Nota ajustada: 9
Nota ajustada: 8
Nota ajustada: 10
Nota ajustada: 7
````
## Loop for-each (Enhanced For)
O for-each (ou "enhanced for") é uma versão simplificada do for, projetada para iterar sobre arrays ou coleções (como ArrayList) sem precisar de um contador explícito. É mais legível, mas menos flexível para manipulações baseadas em índices.
Sintaxe
````
for (tipo elemento : arrayOuColecao) {
    // Bloco de código
}
````
* tipo: Tipo dos elementos no array (ex.: int, String).

* elemento: Variável que representa cada elemento do array em cada iteração.

* arrayOuColecao: O array ou coleção a ser percorrida.

````
public class ExemploForEach {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Clara"};
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
    }
}

````

#### saida
````
Nome: Ana
Nome: Bruno
Nome: Clara
````


### Como Funciona
* O loop percorre cada elemento do array nomes diretamente, atribuindo-o à variável nome a cada iteração.

* Não há acesso direto ao índice, o que simplifica o código, mas limita algumas manipulações.

### Casos de Uso
* Ler elementos de arrays ou coleções sem precisar dos índices.

* Processar dados de forma sequencial (ex.: somar valores, exibir itens).

* Quando a legibilidade é mais importante que o controle de índices.

### Limitações
* Não permite modificar diretamente o índice ou pular elementos específicos.

* Para alterar elementos do array, você precisa de um loop for tradicional.

  
  
 ## Loop while
O while executa um bloco de código enquanto uma condição for verdadeira. É útil quando o número de iterações não é conhecido antecipadamente.
Sintaxe
````

while (condição) {
    // Bloco de código
}
````
Exemplo com Array
````

public class ExemploWhile {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int i = 0;
        while (i < numeros.length) {
            System.out.println("Elemento: " + numeros[i]);
            i++;
        }
    }
}
````
#### Saída:
````
Elemento: 1
Elemento: 2
Elemento: 3
Elemento: 4
Elemento: 5
````

### Como Funciona
* Verifica a condição i < numeros.length.

* Se verdadeira, executa o bloco.

* Incrementa i manualmente (diferente do for, onde o incremento é parte da sintaxe).

* Repete até a condição ser falsa.

### Casos de Uso
Quando o número de iterações depende de uma condição dinâmica (ex.: ler entrada até um valor específico).

Iterar sobre arrays quando o controle de índices é necessário, mas a condição de parada é complexa.

### Armadilhas
* Loop infinito: Se a condição nunca se tornar falsa (ex.: esquecer i++), o programa trava.
java
````
while (true) { // Loop infinito
    System.out.println("Isso não para!");
}
````
* Sempre garanta que a condição será eventualmente falsa.

Exemplo Prático (Procurar Elemento)
````

int[] numeros = {4, 7, 2, 9, 1};
int alvo = 2;
int i = 0;
while (i < numeros.length) {
    if (numeros[i] == alvo) {
        System.out.println("Alvo " + alvo + " encontrado no índice " + i);
        break; // Sai do loop ao encontrar
    }
    i++;
}

````

Saída: ``Alvo 2 encontrado no índice 2``


## Loop do-while
O do-while é semelhante ao while, mas garante que o bloco de código seja executado pelo menos uma vez, pois a condição é verificada após a execução.
Sintaxe
````

do {
    // Bloco de código
} while (condição);
````
Exemplo com Array
````
public class ExemploDoWhile {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};
        int i = 0;
        do {
            System.out.println("Elemento: " + numeros[i]);
            i++;
        } while (i < numeros.length);
    }
}
````
##### saida
````
Elemento: 10
Elemento: 20
Elemento: 30
````

### Como Funciona
* Executa o bloco de código.

* Verifica a condição i < numeros.length.

* Se verdadeira, repete; caso contrário, sai do loop.

### Casos de Uso
* Quando você precisa executar o bloco pelo menos uma vez (ex.: ler entrada de usuário até uma condição válida).

* Menos comum com arrays, mas útil em cenários interativos.


##  Controle de Loops
Os loops podem ser controlados com palavras-chave para alterar o fluxo:
**a)** ``break``
Interrompe o loop imediatamente, saindo dele.

Exemplo:
````
int[] numeros = {1, 2, 3, 4, 5};
for (int num : numeros) {
    if (num == 3) {
        break; // Sai do loop quando encontra 3
    }
    System.out.println(num);
}
````
##### Saída: ``1, 2``

**b)** ``continue``
Pula para a próxima iteração, ignorando o restante do bloco atual.
Exemplo:
````
int[] numeros = {1, 2, 3, 4, 5};
for (int num : numeros) {
    if (num % 2 == 0) {
        continue; // Pula números pares
    }
    System.out.println(num);
}
````

##### Saída: ``1, 3, 5``
**c)** ``Labels`` (Rotulados)
Permitem direcionar break ou continue para um loop externo em loops aninhados.
Exemplo:
````

int[][] matriz = {{1, 2}, {3, 4}, {5, 6}};
externo: for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] == 4) {
            break externo; // Sai do loop externo
        }
        System.out.println(matriz[i][j]);
    }
}
````
##### Saída: ``1, 2, 3``
* **Nota**: Labels são raros e devem ser usados com cuidado, pois podem tornar o código menos legível.

## Boas Práticas e Armadilhas
### Boas Práticas
Use o loop certo para a tarefa:
* for: Quando o número de iterações é conhecido ou índices são necessários.

* for-each: Para leitura simples de arrays/coleções.

* while: Para condições dinâmicas.

* do-while: Quando pelo menos uma execução é necessária.

* Evite loops infinitos: Sempre garanta que a condição de parada será atingida.

* Use array.length: Evita erros de índice fora do limite.

* Mantenha a legibilidade: Evite loops aninhados desnecessariamente complexos.

### Armadilhas Comuns
Índice fora do limite:
````
int[] array = {1, 2, 3};
for (int i = 0; i <= array.length; i++) { // Erro: <= em vez de <
    System.out.println(array[i]); // Lança ArrayIndexOutOfBoundsException
}
````
Esquecer de atualizar o contador:
````

int i = 0;
while (i < 5) {
    System.out.println(i); // Loop infinito se i não for incrementado
}
````

* Modificar array em for-each:
``for-each`` não permite alterar o array diretamente. Use for tradicional para modificações.






