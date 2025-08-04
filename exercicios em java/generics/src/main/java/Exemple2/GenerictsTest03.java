package Exemple2;

import Exemple2.dominio.Barco;
import Exemple2.dominio.Carro;
import Exemple2.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class GenerictsTest03 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(List.of(new Carro("Bwm"), new Carro("Fusca")));
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Beneteau"), new Barco("Fibrafort")));
        RentavelService<Barco> objeto = new RentavelService<>(barcos);
        Barco barco = objeto.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        objeto.retornaObjetoAlugado(barco);
    }
}
