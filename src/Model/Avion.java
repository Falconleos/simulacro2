package Model;

import Interfaces.IVehiculo;
import Interfaces.IVehiculoAereo;

import java.util.Objects;

public final class Avion extends Vehiculo implements IVehiculo, IVehiculoAereo {

    private Integer horasAutonomia;

    public Avion() {
    }

    public Avion(String marca, String modelo, Integer anio, Integer horasAutonomia) {
        super(marca, modelo, anio);
        this.horasAutonomia = horasAutonomia;
    }

    public Integer getHorasAutonomia() {
        return horasAutonomia;
    }

    public void setHorasAutonomia(Integer horasAutonomia) {
        this.horasAutonomia = horasAutonomia;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Avion " +
                ", horas de autonomia= " + horasAutonomia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Avion avion = (Avion) o;
        return Objects.equals(horasAutonomia, avion.horasAutonomia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), horasAutonomia);
    }

    public void darAltaAlquiler(){
        System.out.println("avion alquilado");
    }

    public void darBajaAlquiler(){
        System.out.println("avion devuelto");
    }

    public void guardarEnHangar(){
        System.out.println("avion guardado en hangar");
    }

    public void despegar(){
        System.out.println("el avion ha despegado");
    }
    public void aterrizar(){
        System.out.println("el avion ha aterrizado");
    }


}
