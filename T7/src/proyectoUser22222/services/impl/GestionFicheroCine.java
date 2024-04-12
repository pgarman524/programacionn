package proyectoUser22222.services.impl;

import proyectoUser22222.model.Butaca;

import java.io.*;
import java.util.ArrayList;

public class GestionFicheroCine {

    public Butaca[][] leerFicheroCine(String ruta) {
        Butaca[][] arrUserTemporal = new Butaca[][];

        try {
            File fichero = new File(ruta);

            if (fichero.exists()) {
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);

                String linea = br.readLine();
                while (linea != null) {
                    String fila = "";
                    String asiento = "";
                    String idUser = "";

                    String[] valores = linea.split(":");
                    int filaInt = Integer.parseInt(valores[0]);
                    int asientoInt = Integer.parseInt(valores[1]);


                    Butaca b = arrUserTemporal[filaInt][asientoInt];


                    linea = br.readLine();

                }
                return arrUserTemporal;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public void modificarFicheroCine(Butaca[][] salaCine) {


    }

    public void anadirFicheroCine(Butaca[][] salaCine) {


    }

}

