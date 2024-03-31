package AnalisisAirbnb;

import AnalisisAirbnb.Services.GestionFicheroAirbnb;
import Tema7Teoria.ProyectoAirBnB.Model.Alojamiento;
import Tema7Teoria.proyectoQuiz.services.GestionFichero;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int opc = 1;

        do {
            System.out.println("Aquí está la lista de acciones:");
            System.out.println("1. Imprimir por pantalla los 20 alojamientos más baratos.");
            System.out.println("2. Imprimir por pantalla los 20 alojamientos más caros.");
            System.out.println("3. Preguntar al usuario por un presupuesto máximo por\n" +
                    "noche, e imprimir por pantalla todos los alojamientos que se ciñan\n" +
                    "a ese presupuesto.\n");

            Scanner scan = new Scanner(System.in);
            opc = scan.nextInt();
            GestionFicheroAirbnb gb = new GestionFicheroAirbnb();
            switch (opc) {
                case 1:
            /*
            0. necesito poder extraer los datos
            1. Necesito colocar los datos en algún lugar
            2. Cuando tenga esos datos debo ordenarlos.
            3. mostrar los 20 primeros datos que aparezcan
            */


                    gb.leerYMostrar20BaratosAlojamineto("src/AnalisisAirbnb/Archivos/malaga.csv");
                    // alojamientos = gb.leerFicheroAlojamineto("src/AnalisisAirbnb/Archivos/malaga.csv");

                    break;
                case 2:

                    gb.leerYMostrar20CarosAlojamineto("src/AnalisisAirbnb/Archivos/malaga.csv");
                    break;

                case 3:
                    gb.obtenerPresupuesto("src/AnalisisAirbnb/Archivos/malaga.csv");


                    break;
                case 4:
gb.modificarPrecioAlojamiento();

                    break;
            }

        } while (opc != 0);

    }
}
