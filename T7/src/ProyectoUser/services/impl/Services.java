package ProyectoUser.services.impl;

import ProyectoUser.model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Services {
    ArrayList<Usuario> arrTemporal = new ArrayList<>();
    String ruta = "src/archivosTema7/users/users.txt";

    GestionFicheroLogger gf = new GestionFicheroLogger();


    Scanner scan = new Scanner(System.in);


    public void loginUser(){

        gf.leerficheroUsers(ruta);
        ArrayList<Usuario> registros = gf.leerficheroUsers(ruta);

        int opc = 1;

        System.out.print("Ingrese su usuario: ");
        String username = scan.next();
        System.out.print("Ingrese su contraseña: ");
        String password = scan.next();
        try {
            for (int i = 0; i < registros.size(); i++) {

                if (registros.get(i).getId().equalsIgnoreCase(username) && registros.get(i).getPassword().equalsIgnoreCase(password)) {
                    System.out.println("Inicio de sesión exitoso.");
                    System.out.println("");
                } else {
                    System.out.println("Nombre de usuario o contraseña incorrectos");
                    System.out.println("");
                }
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

}
