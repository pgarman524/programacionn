package ProyectoUser.services.API;

import ProyectoUser.model.Usuario;

public interface BasicServiceUsers {
    public boolean altaUsuario();

    public boolean loginUsuario();

    public boolean checkUser(String idUser, String password);

    public boolean userExists(String idUser);

    public void leeerFicheroUsers();

    public void anadirFicheroUsers(Usuario u);

    public void modificarFicheroUsers();


}
