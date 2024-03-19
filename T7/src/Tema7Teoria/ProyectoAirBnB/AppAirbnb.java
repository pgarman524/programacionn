package Tema7Teoria.ProyectoAirBnB;

import Tema7Teoria.ProyectoAirBnB.services.GestionFicheroAirBnB;
import Tema7Teoria.ProyectoTrivial.Services.GestionFichero;
import jdk.jshell.execution.LoaderDelegate;

public class AppAirbnb {

    //Extraer id, name, host-id, host-name, price


    public static void main(String[] args) {
        GestionFicheroAirBnB gestion = new GestionFicheroAirBnB();

        String ruta = "src/archivosTema7/malaga.csv";

        gestion.leerFicheroAlojamineto(ruta);






    }

}
