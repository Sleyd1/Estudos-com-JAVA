# Sobrecarga de métodos

Sobrecarga de método (em inglês, method overloading) é quando você define vários métodos com o mesmo nome, mas com diferentes parâmetros (tipo, número ou ordem).


## Regras para sobrecarregar um método:
Você pode mudar:

O número de parâmetros

O tipo dos parâmetros

A ordem dos parâmetros


ex:
````java
public class Calculadora {

    // Soma de dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Soma de três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Soma de dois doubles
    public double somar(double a, double b) {
        return a + b;
    }

    // Soma com ordem diferente
    public double somar(int a, double b) {
        return a + b;
    }
}

````

Erro comum:
`````java
public int somar(int a, int b) {
    return a + b;
}

public double somar(int a, int b) {
    return a + b; // ❌ ERRO! Só mudou o tipo de retorno
}
````
