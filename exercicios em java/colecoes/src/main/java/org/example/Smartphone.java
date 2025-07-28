package org.example;

import java.util.Objects;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    //
    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        if (this == o) return true;
        Smartphone that = (Smartphone) o;
        return Objects.equals(serialNumber, that.serialNumber) && Objects.equals(marca, that.marca);
    }


    /*
    * se x.equals(y) == true, y.hashCode() == x.hashCode()
    * y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que set true
    * x.equals(y) == false
    * y.hashCody() != x.hashCode() x.equals(y) deverá ser false.
    * */

    @Override
    public int hashCode() {
        return serialNumber == null ? 0: this.serialNumber.hashCode();

    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getMarca() {
        return marca;
    }
}
