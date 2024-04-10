package proyectoUser22222.services.impl;


import proyectoUser22222.services.api.BasicLoggerService;

import java.time.LocalDateTime;

public class LoggerService implements BasicLoggerService {

    private GestionFicheroLogger gestion;
    String ruta = "src/archivosTema7/logs/logs.txt";

    public LoggerService() {
        this.gestion = new GestionFicheroLogger();
    }

    public LoggerService(GestionFicheroLogger gestion) {
        this.gestion = gestion;
    }

    @Override
    public boolean logAlta(String idUser) {
        String mensaje = idUser + ";" + LocalDateTime.now() + ";" + "ALTA";
        gestion.anadirFicheroLog(mensaje, ruta);
        return false;
    }

    @Override
    public boolean logLogin(String idUser) {
        String mensaje = idUser + ";" + LocalDateTime.now() + ";" + "LOGIN";
        gestion.anadirFicheroLog(mensaje, ruta);
        return false;
    }

    @Override
    public void anadirFicheroLogger(String mensaje) {

        this.gestion.anadirFicheroLog(mensaje, "src/archivosTema7/logs/logs.txt");

    }
}
