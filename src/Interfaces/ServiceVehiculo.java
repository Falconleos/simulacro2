package Interfaces;

import Model.Vehiculo;

import java.util.List;

public interface ServiceVehiculo {

    void agregarAflota(List<Vehiculo>flota);
    void mostrarFlota(List<Vehiculo>flota);
    void ordenarFlota(List<Vehiculo>flota);
    void despegarFlota(List<Vehiculo>flota);

}
