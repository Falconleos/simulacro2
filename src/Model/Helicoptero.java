package Model;

import Interfaces.IVehiculo;
import Interfaces.IVehiculoAereo;

import java.util.Objects;

public final class Helicoptero extends Vehiculo implements IVehiculo, IVehiculoAereo {

    public static Integer contador = 0;

    private Integer id;

    public Helicoptero() {
        this.id = contador++;
    }

    public Helicoptero(String marca, String modelo, Integer anio) {
        super(marca, modelo, anio);
        this.id = contador++;
    }

    public static Integer getContador() {
        return contador;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " Helicoptero " +
                " id= " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Helicoptero that = (Helicoptero) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    public void darAltaAlquiler(){
        System.out.println("helicoptero alquilado");
    }

    public void darBajaAlquiler(){
        System.out.println("helicoptero devuelto");
    }

    public void guardarEnHangar(){
        System.out.println("helicoptero guardado en hangar");
    }

    public void despegar(){
        System.out.println("el helicoptero ha despegado");
    }
    public void aterrizar(){
        System.out.println("el helicoptero ha aterrizado");
    }




}
