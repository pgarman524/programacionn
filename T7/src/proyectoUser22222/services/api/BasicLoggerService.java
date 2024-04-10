package Tema7.proyectoUser.services.api;

public interface BasicLoggerService {
    public boolean logAlta (String idUser);
    public boolean logLogin (String idUser);
    public void anadirFicheroLogger(String mensaje);
}
