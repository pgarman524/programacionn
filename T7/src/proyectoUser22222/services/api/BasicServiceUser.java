package Tema7.proyectoUser.services.api;

import Tema7.proyectoUser.model.User;

public interface BasicServiceUser {

    public boolean altaUsuario();
    public boolean loginUsuario();
    public boolean checkUser(String idUser, String password);
    public boolean userExists(String idUser);
    public void leerFicheroUsers();
    public void anadirFicheroUsers(User u);
    public void modificarFicheroUsers();

}
