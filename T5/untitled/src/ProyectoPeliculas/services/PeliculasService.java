package ProyectoPeliculas.services;

import ProyectoPeliculas.Clases.Pelicula;
import ProyectoPeliculas.Main;
import ProyectoPeliculas.MainCreacion;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class PeliculasService {

    //________________
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
//________________

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
        for (int i = 0; i < MainCreacion.peliculas.size(); i++) {
            if (MainCreacion.peliculas.get(i).getId().equals(peliNueva.getId())) {
                System.out.println("Película ya existente");
                peliExiste = true;
                break;
            }

        }

        if (!peliExiste) {
            //Vamos a comprobar la posición en la que tenemos que meter la peli

            for (int i = 0; i < MainCreacion.peliculas.size(); i++) {
                double notaPeliNueva = Double.parseDouble(peliNueva.getImDbRating());
                double notaPeliLista = Double.parseDouble(MainCreacion.peliculas.get(i).getImDbRating());

                if (notaPeliNueva > notaPeliLista) {
                    //Insertamos la peliNueva  en la posición de la peli de la lista
                    peliNueva.setRank(MainCreacion.peliculas.get(i).getRank());
                    MainCreacion.peliculas.add(i, peliNueva);

                    for (int j = i + 1; j < MainCreacion.peliculas.size(); j++) {
                        int rankingAntiguo = Integer.parseInt(MainCreacion.peliculas.get(j).getRank());
                        int rankingNuevo = rankingAntiguo + 1;
                        MainCreacion.peliculas.get(j).setRank(rankingNuevo + "");

                    }

                }
                break;
            }


            System.out.println("Película correctamente añadida.");


        }
        return true;
    }


    public static void mostrarPelicuolasDesc() {
        for (int i = 0; i < MainCreacion.peliculas.size(); i++) {
            System.out.printf(ANSI_GREEN + "---(%s)-----------\n" + ANSI_RESET, MainCreacion.peliculas.get(i).getRank());
            System.out.printf("- Título (año): %s\n", MainCreacion.peliculas.get(i).getFullTitle());
            System.out.printf(ANSI_WHITE + "\t* Nota: %s\n" + ANSI_RESET, MainCreacion.peliculas.get(i).getImDbRating());
            System.out.printf(ANSI_WHITE + "\t* Crew: %s\n" + ANSI_RESET, MainCreacion.peliculas.get(i).getCrew());
        }
    }

    public static void eliminarPeliculas() {
        Scanner scan = new Scanner(System.in);
        int eleccion;

        do {
            System.out.println("""
                    
                    1. Eliminar por ranking.
                    2. Eliminar por nombre.
                    0. Salir
                    
                    """);

            eleccion = scan.nextInt();

            switch (eleccion){
                case 1:
                    String rangoEliminar = "";
                    System.out.print("Dígame el ranking que quiere eliminar: ");
                    rangoEliminar = scan.next();

                    for (int i = 0; i < MainCreacion.peliculas.size(); i++) {

                        if (MainCreacion.peliculas.get(i).getRank().equals(rangoEliminar)) {
                            MainCreacion.peliculas.remove(i);
                        }
                    }
                    break;
                case 2:
                    String nombreEliminar = "";
                    System.out.print("Dígame el título que quiere eliminar: ");
                    nombreEliminar = scan.next();

                    for (int i = 0; i < MainCreacion.peliculas.size(); i++) {

                        if (MainCreacion.peliculas.get(i).getTitle().equals(nombreEliminar)) {
                            MainCreacion.peliculas.remove(i);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Volviendo al menú.");
                    break;
                default:

                    break;
            }

        }while(eleccion != 0);


    }

}
