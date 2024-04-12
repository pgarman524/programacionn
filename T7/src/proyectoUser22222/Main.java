package proyectoUser22222;

import Tema7.proyectoUser.model.User;
import proyectoUser22222.services.impl.GestionFicheroUser;
import proyectoUser22222.services.impl.ServiceUser;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GestionFicheroUser gestion = new GestionFicheroUser();
        ArrayList<User> users = gestion.leerFichero("src/archivosTema7/users/users.txt");
        ServiceUser su = new ServiceUser();

        int opcion = 1;

        do {
            try {
                System.out.print("""
                        MENÚ PARA INICIAR SESIÓN
                        1. REGISTRARSE
                        2. LOGIN
                        3. SALIR
                        """);

                opcion = scan.nextInt();
                scan.nextLine();

                switch (opcion) {
                    case 1:
                        su.altaUsuario();
                        break;
                    case 2:
                        su.loginUsuario();
                        break;
                    case 3:
                        break;
                    default:

                }
            } catch (InputMismatchException e) {
                System.out.println("Error en la opcion");
                scan.nextLine();
            }
        } while (opcion != 3);


        /**
         * En main hacer que solo sea accesible a la parte ya creada si no se ha dado de alta el usuario
         * Si boolean esLogin = true -> mostrar más opciones del cine : mostrarbutaca, comprar entrada,  devolver entrada, salir
         *
         * + ServiceCine -> public comprar entrada, public  mostrar butaca, public devolver butaca
         * + GestionFicheroCine
         * Entradas_vendidas.txt
         *
        **/
    }

}

