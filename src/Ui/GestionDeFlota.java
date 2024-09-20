package Ui;

import Interfaces.ServiceVehiculo;
import Model.Vehiculo;
import Service.ServiceVehiculoImpl;

import java.util.ArrayList;
import java.util.List;

public class GestionDeFlota{

    List<Vehiculo>flota = new ArrayList<>();

    public void iniciarMenu(){

        ServiceVehiculoImpl serviceVehiculo1 = new ServiceVehiculoImpl();

        serviceVehiculo1.agregarAflota(flota);
        serviceVehiculo1.mostrarFlota(flota);
        serviceVehiculo1.ordenarFlota(flota);
        serviceVehiculo1.mostrarFlota(flota);
        serviceVehiculo1.despegarFlota(flota);

    }

}
