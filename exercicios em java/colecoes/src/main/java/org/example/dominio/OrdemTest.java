package org.example.dominio;

import java.util.Objects;

public class OrdemTest implements Comparable<OrdemTest>{
    private  Long id;
    private String nome;
    private double preço;

    public OrdemTest(Long id, String nome, double preço) {
        Objects.requireNonNull(id, "Insira um id!!");
        Objects.requireNonNull(nome,"Insira um nome!!");
        this.id = id;
        this.nome = nome;
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "OrdemTest {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preço=" + preço +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrdemTest ordemTest = (OrdemTest) o;
        return Double.compare(preço, ordemTest.preço) == 0 && Objects.equals(id, ordemTest.id) && Objects.equals(nome, ordemTest.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preço);
    }

    @Override
    public int compareTo(OrdemTest o) {
        // negativo se o this < o
        // se this == o, return 0
        //positivo se this > 0
       /* if(this.id < o.getId()){
            return -1;
        } else if (this.id.equals(o.getId())) {
            return 0;
        } else {
            return 0;

        }*/

        return this.nome.compareTo(o.getNome());


    }


    public void setId(Long id) {
        this.id = id;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preço;
    }


}
