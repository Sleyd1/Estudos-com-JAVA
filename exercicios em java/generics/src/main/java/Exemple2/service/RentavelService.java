package Exemple2.service;

import Exemple2.dominio.Carro;

import java.util.List;

public class RentavelService<T> {
    private List<T> objeto;

    public RentavelService(List<T> objet){
        this.objeto = objet;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando carro...");
        T objetoD = objeto.remove(0);
        System.out.println("Alugando carro: " + objetoD);
        System.out.println("Carros disponiveis para alugar: "+ objetoD);

        return objetoD;
    }
    public void retornaObjetoAlugado (T carro){
        System.out.println("Devolvendo carro "+ carro);
        objeto.add(carro);
        System.out.println("Carros disponivel para alugar: "+ objeto);
    }
}
