package Service;

import Enums.TipoDeAuto;
import Interfaces.IVehiculoAereo;
import Interfaces.ServiceVehiculo;
import Model.Auto;
import Model.Avion;
import Model.Helicoptero;
import Model.Vehiculo;

import java.util.Collections;
import java.util.List;

public class ServiceVehiculoImpl implements ServiceVehiculo {


    public void agregarAflota(List<Vehiculo> flota) {

        flota.add(new Auto("Ford", "Fiesta", 2011, TipoDeAuto.SEDAN));
        flota.add(new Avion("LearJet", "45", 2010, 12));
        flota.add(new Helicoptero("LearJet", "50", 2008));
        flota.add(new Helicoptero("LearJet", "40", 2005));
        flota.add(new Auto("Chevrolet", "corsa", 2009, TipoDeAuto.CUPE));

    }


    public void mostrarFlota(List<Vehiculo> flota) {

        System.out.println("Lista de vehiculos");

        for (Vehiculo vehiculo1 : flota) {
            System.out.println(vehiculo1.toString());
        }

    }

    public void ordenarFlota(List<Vehiculo> flota) {

        Collections.sort(flota);

    }

    public void despegarFlota(List<Vehiculo> flota) {

        for (Vehiculo vehiculo : flota) {

            if (vehiculo instanceof IVehiculoAereo) {

                System.out.println(vehiculo.getMarca() + " listo para despegar");
                ((IVehiculoAereo) vehiculo).despegar();
            }

        }

    }


}
