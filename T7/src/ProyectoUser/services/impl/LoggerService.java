package ProyectoUser.services.impl;

import ProyectoUser.services.API.BasicLoggerService;
import Tema7Teoria.ProyectoTrivial.Services.GestionFichero;

public class LoggerService implements BasicLoggerService {
private GestionFicheroLogger gestion;

public LoggerService(){
    this.gestion = new GestionFicheroLogger();
}

public LoggerService(GestionFicheroLogger gestion){
    this.gestion = gestion;
}


    @Override
    public boolean logAlta(String idUser) {
        return false;
    }

    @Override
    public boolean logLogin(String idUser) {
        return false;
    }

    public void anadirFicheroLogger(String mensaje){

   // this.gestion.escribirFichero(mensaje, );
}

}
