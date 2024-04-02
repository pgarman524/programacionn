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

        int opc = 1;

        Scanner scan = new Scanner(System.in);

        opc = scan.nextInt();

        do {
        switch (opc){
            case 1:

                break;
            case 2:

                break;

        }

        } while (opc != 0);


    }


}
