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

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, marca);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getMarca() {
        return marca;
    }
}
