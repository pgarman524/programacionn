package ProyectoPeliculas.services;

import ProyectoPeliculas.Clases.Pelicula;
import ProyectoPeliculas.Main3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class PeliculasService {
    public static boolean addPelicula() {
        //Añadir una película nueva.
        Scanner scan = new Scanner(System.in);

        //NOMBRE
        scan.nextLine();
        System.out.print("Dime el nombre de la película: ");
        String nombrePeli = scan.nextLine();

        //AÑO
        int anio = 0;
        try {
            scan.nextLine();
            System.out.println("Dime el año de publicación  de la película: ");
            anio = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Año erróneo....");
        }

        //CREW
        //DIRECTOR
        scan.nextLine();
        System.out.print("Dime el nombre del director/a: ");
        String nombreDir = scan.nextLine();
        //ACTOR1
        scan.nextLine();
        System.out.print("Dime el nombre del actor1: ");
        String nombreAct1 = scan.nextLine();
        //ACTOR2
        scan.nextLine();
        System.out.print("Dime el nombre del actor2: ");
        String nombreAct2 = scan.nextLine();

        //ID
        //Clase para generar ID aleatorias
        String id = UUID.randomUUID().toString();

        //NOTA
        double nota = 0.0;
        try {
            scan.nextLine();
            System.out.println("Dime la nota de la película: ");
            nota = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Nota errónea....");
        }

        Pelicula peliNueva = new Pelicula(id, nombrePeli, anio + "", nombreDir, nombreAct1, nombreAct2, nota + "");


        boolean peliExiste = false;
        for (int i = 0; i < Main3.peliculas.size(); i++) {
            if (Main3.peliculas.get(i).getId().equals(peliNueva.getId())) {
                System.out.println("Película ya existente");
                peliExiste = true;
                break;
            }

        }

        if (!peliExiste) {
            Main3.peliculas.add(peliNueva);
            System.out.println("Película correctamente añadida.");
            peliExiste = true;

        }
        return false;
    }

}
