package modificador;

import modificador.stati.Contador;

public class Cont {
    public static void main (String[] args){
        Contador contando = new Contador(200);
        Contador contand2 = new Contador(50);

        contando.imprimir();

    }
}
