package proyectoUser22222.services.impl;

import proyectoUser22222.model.Butaca;
import proyectoUser22222.services.api.BasicServiceCine;

import java.util.ArrayList;

public class ServiceCine implements BasicServiceCine {
    private String nombreCine;
    public static int nFilas = 10;
    public static int nAsiento = 10;
    private Butaca[][] salaDeCine;
    private GestionFicheroCine gestion;

    public ServiceCine(String nombreCine) {
        this.nombreCine = nombreCine;
        this.gestion = new GestionFicheroCine();
        this.salaDeCine = new Butaca[nFilas][nAsiento]; // Aquí, tendríamos un array bidimensional de butaca lleno de nulls
        this.salaDeCine = gestion.leerFicheroCine("src/archivosTema7/users/entradasvendidas.csv"); //aquí vamos a leer el fichero para llenar el array de Butaca

    }


    @Override
    public void mostrarButacas() {
        int n = 0;
        for (int i = 0; i < salaDeCine.length; i++) {
            for (int j = 0; j < salaDeCine[i].length; j++) {
                if (salaDeCine[i][j] == null) {
                    System.out.print(" __ ");

                } else {
                    System.out.print(" XX ");
                }


                n += 1;
                if (n == 10 || n == 20 || n == 30 || n == 40 || n == 50 || n == 60 || n == 70 || n == 80 || n == 90 || n == 100) {
                    System.out.println("\n");
                }

                // Si salaDeCine[i][j] == null
                // Muestras __
                // Si no
                // Muestras XX
            }
        }

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
