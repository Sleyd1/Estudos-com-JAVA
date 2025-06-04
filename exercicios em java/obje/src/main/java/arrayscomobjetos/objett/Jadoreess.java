package arrayscomobjetos.objett;

import arrayscomobjetos.objett.ser.Jogador;

public class Jadoreess {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Cristiano Ronaldo");
        Jogador[] jogadors = {jogador1, jogador2};

        for (Jogador cont : jogadors){
           cont.imprime();
        }


    }
}
