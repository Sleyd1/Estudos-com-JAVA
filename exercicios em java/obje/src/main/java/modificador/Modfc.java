package modificador;

import modificador.stati.LimiteDeV;

public class Modfc {
    public static void main(String[] args) {
        LimiteDeV carro1 = new LimiteDeV("kaisa",200);
        LimiteDeV carro2 = new LimiteDeV("kaisa",200);
        LimiteDeV carro3 = new LimiteDeV("kaisa",200);

        LimiteDeV.setVelocidadeLimite(300);

        carro1.getImprime();
        carro2.getImprime();
        carro3.getImprime();

    }




}
