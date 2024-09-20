package Model;

import Enums.TipoDeAuto;
import Interfaces.IVehiculo;
import Interfaces.IVehiculoTerrestre;

import java.util.Objects;

public final class Auto extends Vehiculo implements IVehiculo, IVehiculoTerrestre {

    private TipoDeAuto tipoDeAuto;

    public Auto() {
    }

    public Auto(String marca, String modelo, Integer anio, TipoDeAuto tipoDeAuto) {
        super(marca, modelo, anio);
        this.tipoDeAuto = tipoDeAuto;
    }

    public TipoDeAuto getTipoDeAuto() {
        return tipoDeAuto;
    }

    public void setTipoDeAuto(TipoDeAuto tipoDeAuto) {
        this.tipoDeAuto = tipoDeAuto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Auto " +
                ", tipo de auto=" + tipoDeAuto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto autos = (Auto) o;
        return tipoDeAuto == autos.tipoDeAuto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoDeAuto);
    }


    public void darAltaAlquiler(){
        System.out.println("auto alquilado");
    }

    public void darBajaAlquiler(){
        System.out.println("auto devuelto");
    }

    public void guardarEnCochera(){
        System.out.println("auto guardado en cochera");
    }


}
