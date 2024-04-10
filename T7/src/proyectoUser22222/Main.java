package proyectoUser22222;

import Tema7.proyectoUser.model.User;
import proyectoUser22222.services.impl.GestionFicheroUser;
import proyectoUser22222.services.impl.ServiceUser;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GestionFicheroUser gestion = new GestionFicheroUser();
        ArrayList<User> users = gestion.leerFichero("src/archivosTema7/users/users.txt");
        ServiceUser su = new ServiceUser();

        int opcion = 1;
        do {
            System.out.println("""
                    MENÚ PARA INICIAR SESIÓN
                    1. REGISTRARSE
                    2. LOGIN
                    3. SALIR
                    """);
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                   su.altaUsuario();
                case 2:
                  su.loginUsuario();


                    break;
                case 3:
                    break;
            }
        }while (opcion != 3);

    }
}
