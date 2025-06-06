# Estruturas de Controle
* **Condicional**:

 ```java
if (condicao) {
    // bloco de código
} else if (outraCondicao) {
    // outro bloco
} else {
    // bloco padrão
}
```

* **Switch**:
```java
switch (variavel) {
    case valor1:
        // código
        break;
    case valor2:
        // código
        break;
    default:
        // código padrão
}
```

  * **Laços**:

* for:
 ```java

 for (int i = 0; i < 5; i++) {
    // código
 }
```

 * while:
```java
while (condicao) {
    // código
}
```

 * do-while:
```java
do {
    // código
} while (condicao);
```

* **Operador ternario**
  
Os operadores ternários são uma forma concisa de escrever condicionais em uma única linha, substituindo estruturas if-else tradicionais. Em geral, eles seguem a sintaxe: ``valor_se_verdadeiro if condição else valor_se_falso.``
ex:

````java
int idade = 20;
String status = idade >= 18 ? "maior" : "menor";
System.out.println(status); // Saída: maior
````


