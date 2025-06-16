package Interfaces.outrasclasin;

public interface Implentacoes {
    void imprimir();

    default int somar() {
        return 0;
    }

    /*
    * default faz com que o metodo somar não seja obrigatorio ser sobrescrito
    * */
}
