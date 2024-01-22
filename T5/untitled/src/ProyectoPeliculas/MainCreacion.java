package ProyectoPeliculas;

import ProyectoPeliculas.Clases.Pelicula;
import ProyectoPeliculas.Utils.JsonReaderUtil;
import ProyectoPeliculas.services.PeliculasService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCreacion {


    public static ArrayList<Pelicula> peliculas = null;

    public static void main(String[] args) {
        String pelisPath = "IMDB-api/Top250Movies.json";
        peliculas = JsonReaderUtil.loadJsonFile(pelisPath);

/*
Hacer un menú para dar la opción de crear un nuevo registro
 */
        Scanner scan = new Scanner(System.in);


        int opc = 1;
        while (opc != 0) {
            try {
                System.out.print("""
                        Bienvenido al CRUD de Peliculas
                                        
                        1. Insertar película.
                        2. Mostrar películas de mayor a menor.
                        3. Eliminar una película (Por nombre y por Rank).
                        4. Modificar película (Título, Año, Crew)                       
                        0. Salir.
                                        
                        Escoja una opción:
                        """);

                opc = scan.nextInt();

                switch (opc) {
                    case 1:
                        PeliculasService.addPelicula();

                        break;


                    case 2:
                        PeliculasService.mostrarPelicuolasDesc();

                        break;
                    case 3:
                        PeliculasService.eliminarPeliculas();

                        break;

                    case 4:
                        PeliculasService.modificarPelicula();

                        break;

                    case 0:
                        System.out.println("Adios.");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }


                System.out.println("Opción incorrecta.");
            } catch (InputMismatchException e) {

            }
        }


        //Opción para añadir una película:
        // PeliculasService.addPelicula();


    }
}
