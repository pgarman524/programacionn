package proyectoUser22222.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GestionFicheroLogger {
    public void anadirFicheroLog(String mensaje, String ruta) {
        //LocalDate.now();   --> Fecha exacta de cuando se coloca
        //LocalDateTime.now() --> Fecha y Hora actual

        File fichero = new File(ruta);

        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            FileWriter fw = null;
            BufferedWriter bw = null;

            try {

                fw = new FileWriter(fichero, true);
                bw = new BufferedWriter(fw);


                bw.write(mensaje);
                bw.newLine();

                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

