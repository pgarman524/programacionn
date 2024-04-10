package ProyectoUser.services.impl;

import ProyectoUser.model.Usuario;
import ProyectoUser.services.API.BasicServiceUsers;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicesUsers implements BasicServiceUsers {

    //Atributos de clase
    ArrayList<Usuario> users; //Contiene todos los registrosdel fichero users.txt


    GestionFicheroLogger gestion; // gestion es un objeto para poder llamar a los métods de GestionFicheroUser

    public ServicesUsers() {
        this.users = new ArrayList<>();
        this.users = gestion.leerficheroUsers("src/archivosTema7/users/users.txt");
        this.gestion = new GestionFicheroLogger();
    }

    @Override
    public boolean altaUsuario() {
        Scanner scan = new Scanner(System.in);
        String idUsuario = "";
        String passwordUsuario = "";


        System.out.println("Introduzca su IdUsuario: ");
        idUsuario = scan.nextLine();
            if (userExists(idUsuario)) {
                System.out.println("Usuario ya registrado, introduzca uno nuevo");

            } else {
                System.out.println("Introduzca su contraseña: ");
                passwordUsuario = scan.nextLine();

                System.out.println("Introduzca de nuevo su password: ");

                String otroPasswordUsuario = scan.nextLine();
                if (otroPasswordUsuario.equals(passwordUsuario)) {
                    gestion.escribirFichero(users, passwordUsuario);

                } else {
                    System.out.println("Vuelva a introducir la contraseña");
                }

            }

        return false;
    }

    @Override
    public boolean loginUsuario() {

        Scanner scan = new Scanner(System.in);
        String idUsuario = "";
        String passwordUsuario = "";

        System.out.println("Introduzca su IdUsuario: ");
        idUsuario = scan.nextLine();

        //Comprobamos en el fichero si el idUser existe
        if (userExists(idUsuario)) {
            System.out.println("Introduzca su contraseña: ");
            passwordUsuario = scan.nextLine();
            if (checkUser(idUsuario, passwordUsuario)) {
                System.out.println("Bienvenido " + idUsuario + " al sistema");
                return true;
            } else {
                System.out.println("Credenciales incorrectas");
                return false;

            }
        } else {
            System.out.println("El usuario  no existe en el sistema");
        }

        return false;
    }

    @Override
    public boolean checkUser(String idUser, String password) {

        //1º Manera de hacerlo
        for (int i = 0; i < users.size(); i++) {
            Usuario usuario = this.users.get(i); //usuario es el elemento de la posición i de users

            if (usuario.getId().equalsIgnoreCase(idUser) && usuario.getPassword().equals(password)) ;
            return true;
        }

        //2ºManera de hacerlo
        /*for (Usuario u : this.users){
            if (usuario.getId().equalsIgnoreCase(idUser) && usuario.getPassword().equals(password)) ;
            return true;
        }
        */


        //3ºManera de hacerlo
        /*
        this.users.string().filter(usuario -> usuario.getId().equalsIgnoreCase(idUser) && usuario.getPassword().equals(password))
        .findFirst()
        .isEmpty();
         */

        return false;


    }

    @Override
    public boolean userExists(String idUser) {


        return false;
    }

    @Override
    public void leeerFicheroUsers() {
        this.users = gestion.leerficheroUsers("src/archivosTema7/users/users.txt");
    }

    @Override
    public void anadirFicheroUsers(Usuario u) {
        //gestion.escribirFichero(u, "src/archivosTema7/users/users.txt");
    }

    @Override
    public void modificarFicheroUsers() {

    }


}
