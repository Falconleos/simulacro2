package Model;

import java.util.Objects;

public abstract class Vehiculo implements Comparable<Vehiculo> {

    private String marca;
    private String modelo;
    private Integer anio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo: " +
                "marca= " + marca +
                ", modelo= " + modelo +
                ", anio= " + anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(marca, vehiculo.marca) && Objects.equals(modelo, vehiculo.modelo) && Objects.equals(anio, vehiculo.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anio);
    }

    @Override
    public int compareTo(Vehiculo o) {
        return this.marca.compareTo(o.marca);
    }
}
