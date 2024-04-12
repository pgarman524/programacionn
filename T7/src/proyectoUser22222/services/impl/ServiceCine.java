package proyectoUser22222.services.impl;

import proyectoUser22222.model.Butaca;
import proyectoUser22222.services.api.BasicServiceCine;

import java.util.ArrayList;

public class ServiceCine implements BasicServiceCine {
    private String nombreCine;
    private static final int nFilas = 10;
    private static final int nAsiento = 10;
    private Butaca[][] salaDeCine;
    private GestionFicheroCine gestion;

    public ServiceCine(String nombreCine) {
        this.nombreCine = nombreCine;
        this.gestion = new GestionFicheroCine();
        this.salaDeCine = new Butaca[nFilas][nAsiento]; // Aquí, tendríamos un array bidimensional de butaca lleno de nulls
        this.salaDeCine = gestion.leerFicheroCine(""); //aquí vamosa  leer el fichero para llenar el array de Butaca

    }

    @Override
    public void mostrarButacas() {

    }

    @Override
    public boolean comprarEntrada() {
        return false;
    }

    @Override
    public boolean devolverEntrada() {
        return false;
    }

    @Override
    public boolean checkComprador(String idUser) {
        return false;
    }

    @Override
    public void leerFicheroUsers() {

    }

    @Override
    public void anadirFicheroButaca(Butaca b) {

    }

    @Override
    public void modificarFicheroCine() {

    }


}
