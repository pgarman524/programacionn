package ProyectoUser;

import ProyectoUser.model.Usuario;
import ProyectoUser.services.GestionFicheroUser;
import Tema7Teoria.ProyectoTrivial.Services.GestionFichero;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /*
    Crear un menú de login y de alta
     */

    public static void main(String[] args) {
        ArrayList<Usuario> arrTemporal = new ArrayList<>();
        String ruta = "src/archivosTema7/users/users.txt";

        GestionFicheroUser gf = new GestionFicheroUser();

        gf.leerficheroUsers(ruta);
        ArrayList<Usuario> registros = new ArrayList<>();
        int opc = 1;

        Scanner scan = new Scanner(System.in);


        do {

            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = scan.nextInt();


            switch (opc) {
                case 1:
                    System.out.print("Ingrese su usuario: ");
                    String username = scan.next();
                    System.out.print("Ingrese su contraseña: ");
                    String password = scan.next();
                    if (gf.leerficheroUsers(ruta).get(0).equals(username) && gf.leerficheroUsers(ruta).get(0).equals(password)) {
                        System.out.println("Inicio de sesión exitoso.");
                    } else {
                        System.out.println("Nombre de usuario o contraseña incorrectos");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese un nombre de usuario: ");
                    String nuevoUsuario = scan.next();
                    if (!gf.leerficheroUsers(ruta).get(0).equals(nuevoUsuario)){
                    System.out.println("Ingrese un nombre propio: ");
                    String nuevoNombre = scan.next();
                    System.out.print("Ingrese una contraseña: ");
                    String nuevaContraseña = scan.next();
                    Usuario usuario = new Usuario(nuevoUsuario, nuevoNombre, nuevaContraseña, false);

                    gf.escribirFichero(registros, ruta);
                    System.out.println("Usuario registrado ");
                }
                    break;

            }

        } while (opc != 0);


    }


}
