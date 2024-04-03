package ProyectoUser;

import ProyectoUser.model.Usuario;
import ProyectoUser.services.GestionFicheroUser;
import Tema7Teoria.ProyectoTrivial.Services.GestionFichero;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /*
    Crear un menú de login / de alta / modificar usuarios / Baja usuarios
     */

    public static void main(String[] args) {
        ArrayList<Usuario> arrTemporal = new ArrayList<>();
        String ruta = "src/archivosTema7/users/users.txt";

        GestionFicheroUser gf = new GestionFicheroUser();

        gf.leerficheroUsers(ruta);
        ArrayList<Usuario> registros = gf.leerficheroUsers(ruta);

        int opc = 1;

        Scanner scan = new Scanner(System.in);


        do {

            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = scan.nextInt();
            String username = "";
            String password = "";

            switch (opc) {
                case 1:
                    System.out.print("Ingrese su usuario: ");
                    username = scan.next();
                    System.out.print("Ingrese su contraseña: ");
                    password = scan.next();
                    try {
                        for (int i = 0; i < registros.size(); i++) {


                            if (registros.get(i).getId().equalsIgnoreCase(username) && registros.get(i).getPassword().equalsIgnoreCase(password)) {
                                System.out.println("Inicio de sesión exitoso.");
                                break;
                            } else {
                                System.out.println("Nombre de usuario o contraseña incorrectos");
                            }


                        }
                    } catch (NullPointerException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.print("Ingrese un nombre de usuario: ");
                    String nuevoUsuario = scan.next();
                    try {
                        if (!username.equals(gf.leerficheroUsers(ruta).get(0).toString()) || gf.leerficheroUsers(ruta) == null) {
                            System.out.println("Ingrese un nombre propio: ");
                            String nuevoNombre = scan.next();
                            System.out.print("Ingrese una contraseña: ");
                            String nuevaContraseña = scan.next();
                            System.out.println("Es admin(s/n): ");
                            String isAdmin = scan.next();
                            if (isAdmin.equalsIgnoreCase("s") || isAdmin.equalsIgnoreCase("n")) {
                                if (isAdmin.equalsIgnoreCase("s")) {
                                    Usuario usuario = new Usuario(nuevoUsuario, nuevoNombre, nuevaContraseña, true);
                                    for (int i = 0; i < registros.size(); i++) {
                                        registros.add(usuario);
                                        gf.escribirFichero(registros, ruta);
                                        break;
                                    }
                                } else {
                                    Usuario usuario = new Usuario(nuevoUsuario, nuevoNombre, nuevaContraseña, false);
                                    for (int i = 0; i < registros.size(); i++) {
                                        registros.add(usuario);
                                        gf.escribirFichero(registros, ruta);
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("Introduzca solo -> s/n");
                            }
                            gf.escribirFichero(registros, ruta);
                            System.out.println("Usuario registrado ");
                        }
                    } catch (NullPointerException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Hola, ¿qué user quiere modificar?: ");
                    String userAEliminar = scan.next();

                    if (userAEliminar.equalsIgnoreCase(gf.leerficheroUsers(ruta).get(0).toString())) {
                        //   registros.remove(i);
                        gf.escribirFichero(registros, ruta);

                    }

                    break;
                case 4:
                    System.out.println("Hola, indique el usuario que quiere dar de baja: ");


                    break;
            }

        } while (opc != 0);


    }


}