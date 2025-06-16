package Interfaces.outrasclasin;

public class ClasseEX implements Implentacoes, diminuir{
    /*
    * podemos adicionar multiplas interfaces
    * */
    public ClasseEX() {
    }

    @Override
    public int subtrai() {
        return 1-2;
    }

    @Override
    public int somar() {
        return 1+2;
    }
    /*
    * o metoto somar não e um metodo obrigatorio para ser subrescrito
    * */

    @Override
    public void imprimir() {
        System.out.println("Exemplo");
    }
    /*
    * Interface e como se fosse um contratos que outras Classes devem seguir como por exemplo
    * sobrescrever um metodo
    *
    * */
}
