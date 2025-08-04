package org.example;


import java.util.ArrayList;
import java.util.List;

class Car {
    public String nome;
    public String cor;
    public int ano;

    public Car(String nome, String cor, int ano) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "car{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

public class ParamentrizEx {
    private static List<Car> carro = List.of(new Car("bme","green",1990),new Car("bme","blue",2000),new Car("bme","yellow",1890));

    public static void main(String[] args) {
        List<Car> greenCars = filter(carro,
                new CarPredicate(){

                    @Override
                    public boolean test(Car car) {
                        return car.getCor().equals("green");
                    }
                });



        List<Car> years = filter(carro,
                new CarPredicate(){

                    @Override
                    public boolean test(Car car) {
                        return car.getAno() < 2000;
                    }
                });
        System.out.println(greenCars);
        System.out.println(years);

    }

    private static List<Car> filter(List<Car> cars, CarPredicate fill){
        List<Car> filter = new ArrayList<>();
        for(Car car : cars){
            if (fill.test(car)){
                filter.add(car);
            }
        }
        return filter;
    }





}
