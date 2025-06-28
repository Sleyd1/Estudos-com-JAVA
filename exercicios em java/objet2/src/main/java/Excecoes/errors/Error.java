package Excecoes.errors;

public class Error {
    public static void main(String[] args) {
        recursividade();
    }

    //stack over flow
    public static void recursividade(){
        recursividade();
        // método recursivo
    }

    //estourando a memória
}
