package Excecoes.runtimetest;

import javax.management.RuntimeErrorException;

public class RuntimeTest {
    public static void main(String[] args) {
            dividir(2,0);
    }

    private static int dividir(int a , int b) throws IllegalArgumentException{
        if (b == 0){
            throw  new IllegalArgumentException("ARGUMENTO INVALIDO, NÃO PODE SER 0");
        }
        return a/b;
    }
}
