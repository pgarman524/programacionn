package proyectoUser22222.services.impl;

import ProyectoUser.model.Usuario;
import Tema7.proyectoUser.model.User;
import Tema7.proyectoUser.services.api.BasicServiceUser;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceUser implements BasicServiceUser {

    // ATRIBUTOS
    ArrayList<User> users; // Contiene todos los registros del fichero users.txt
    GestionFicheroUser gestion; // gestion es un objeto para poder llamar a los métodos de GestionFicheroUser


    LoggerService ls;

    public ServiceUser() {
        this.users = new ArrayList<>();
        this.gestion = new GestionFicheroUser();
        this.users = gestion.leerFichero("src/archivosTema7/users/users.txt");
        this.ls = new LoggerService();
    }

    @Override
    public boolean altaUsuario() {
        Scanner scan = new Scanner(System.in);
        String idUsuario = "";
        String passwordUsuario = "";
        String nombre = "";
        boolean isAdmin = false;
        User usuario = new User(idUsuario, nombre,passwordUsuario, isAdmin);

        System.out.println("Introduzca su IdUsuario: ");
        idUsuario = scan.nextLine();
        if (userExists(idUsuario)) {
            System.out.println("Usuario ya registrado, introduzca uno nuevo");

        } else {
            System.out.println("Introduzca su contraseña: ");
            passwordUsuario = scan.nextLine();

            System.out.println("Introduzca su nombre real: ");
            nombre = scan.nextLine();

            System.out.println("¿Es admin?(s/n): ");
            String decision = scan.nextLine();
            if (decision.equalsIgnoreCase("s")){
                isAdmin = true;
                this.users.add(usuario);
            }else {
                this.users.add(usuario);
            }


        }

        return false;
    }


    @Override
    public boolean loginUsuario() {

        Scanner scan = new Scanner(System.in);
        String idUsuario = "";
        String passwordUsuario = "";

        System.out.print("Introduzca su idUsuario: ");
        idUsuario = scan.nextLine();

        // Comprobamos en el fichero si el idUser existe
        if (userExists(idUsuario)) {

            System.out.print("Introduzca su password: ");
            passwordUsuario = scan.nextLine();

            if (checkUser(idUsuario, passwordUsuario)) {

                System.out.println("Bienvenid@ " + idUsuario);
                ls.logLogin(idUsuario);
                return true;

            } else {
                System.out.println("Credenciales incorrectas");
                return false;
            }

        } else {
            System.out.println("El usuario no existe en el sistema");
            return false;
        }
    }

    @Override
    public boolean checkUser(String idUser, String password) {

        // 1º manera de hacerlo
        for (int i = 0; i < this.users.size(); i++) {
            User usuario = this.users.get(i); // usuario es el elemento de la posicion i de users
            if (usuario.getId().equalsIgnoreCase(idUser) && usuario.getPass().equals(password)) {
                return true;
            }
        }

        // 2º manera de hacerlo
        /*
        for(User usuario : this.users) {
            if(usuario.getId().equalsIgnoreCase(idUser) && usuario.getPass().equals(password)) {
                return true;
            }
        }
         */

        // 3º manera de hacerlo
        /*
        return !this.users.stream()
                .filter(usuario -> usuario.getId().equalsIgnoreCase(idUser) && usuario.getPass().equals(password))
                .findFirst()
                .isEmpty();
        */

        return false;
    }

    @Override
    public boolean userExists(String idUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equalsIgnoreCase(idUser)) {
                return true;
            }

        }

        return false;
    }

    @Override
    public void leerFicheroUsers() {
        this.users = gestion.leerFichero("src/archivosTema7/users/users.txt");
    }

    @Override
    public void anadirFicheroUsers(User u) {
        gestion.anadirFichero(u, "src/archivosTema7/users/users.txt");
    }

    @Override
    public void modificarFicheroUsers() {
        gestion.modificarFichero(this.users, "src/archivosTema7/users/users.txt");
    }
}