package proyectoUser22222;

import Tema7.proyectoUser.model.User;
import proyectoUser22222.services.impl.GestionFicheroUser;
import proyectoUser22222.services.impl.ServiceCine;
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
        ServiceCine sc = new ServiceCine("Ubricine");

        boolean usuarioExiste = false;

        int opcion = 0;

        do {
            if (usuarioExiste) {
                System.out.print("""
                        MENÚ PARA INICIAR SESIÓN
                        1. MOSTRAR CINE
                        2. COMPRAR ENTRADA
                        3. DEVOLER ENTRADA
                        4. SALIR
                        """);
            } else {
                System.out.print("""
                        MENÚ PARA INICIAR SESIÓN
                        1. REGISTRARSE
                        2. LOGIN
                        3. SALIR
                        """);
            }

            try {
                opcion = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error en la opción. Por favor, ingrese un número válido.");
                scan.nextLine();
                continue;
            }

            if (usuarioExiste) {
                switch (opcion) {
                    case 1:
                        sc.mostrarButacas();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                }
            } else {
                switch (opcion) {
                    case 1:
                        su.altaUsuario();
                        break;
                    case 2:
                        if (su.loginUsuario()) {
                            usuarioExiste = true;
                        } else {
                            System.out.println("Login fallido. Por favor, intente de nuevo.");
                        }
                        break;
                    case 3:

                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                }
            }
        } while (opcion != 4);
    }
}


/**
 * En main hacer que solo sea accesible a la parte ya creada si no se ha dado de alta el usuario
 * Si boolean esLogin = true -> mostrar más opciones del cine : mostrarbutaca, comprar entrada,  devolver entrada, salir
 * <p>
 * + ServiceCine -> public comprar entrada, public  mostrar butaca, public devolver butaca
 * + GestionFicheroCine
 * Entradas_vendidas.txt
 **/

