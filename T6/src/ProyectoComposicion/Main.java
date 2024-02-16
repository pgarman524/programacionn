package ProyectoComposicion;

import ProyectoComposicion.Clases.Volk;
import ProyectoComposicion.Clases.Wagen;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        //Coche en el concesionario
       Wagen audi = new Wagen("a4","Audi",null);

        //Se compra el coche
        ArrayList<Wagen> cochesDeRaquel = new ArrayList<>();
        cochesDeRaquel.add(audi);

        Volk raquel = new Volk("Raquel", cochesDeRaquel);

        audi.setPropietario(raquel);


        System.out.println("");
    }
}
