## Declaração de Arrays
Um array é declarado especificando o tipo de dados seguido por [] e o nome da variável.

``tipo[] nomeDoArray; // Declaração``

Exemplos:
```

int[] numeros;          // Array de inteiros
String[] nomes;         // Array de strings
double[] valores;       // Array de doubles
```

## Métodos Úteis
Java oferece a classe java.util.Arrays para manipular arrays:
* Ordenar: Arrays.sort(array);

* Preencher: Arrays.fill(array, valor);

* Copiar: Arrays.copyOf(array, novoTamanho);

* Comparar: Arrays.equals(array1, array2);

* Converter para string: Arrays.toString(array);

exemplo:

```

import java.util.Arrays;

public class ExemploArray {
    public static void main(String[] args) {
        // Declaração e inicialização
        int[] numeros = {5, 2, 8, 1, 9};

        // Exibir array
        System.out.println("Array original: " + Arrays.toString(numeros));

        // Ordenar
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        // Somar elementos com for-each
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Soma: " + soma);
    }
}

```
