package proyectoUser22222.services.impl;

import proyectoUser22222.model.Butaca;

import java.io.*;
import java.util.ArrayList;


public class GestionFicheroCine {

    public Butaca[][] leerFicheroCine(String ruta) {

        Butaca[][] arrUserTemporal = new Butaca[ServiceCine.nFilas][ServiceCine.nAsiento];

        try {
            File fichero = new File(ruta);

            if (fichero.exists()) {
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);

                String linea = br.readLine();
                while (linea != null) {

                    String[] valores = linea.split(":");
                    int filaInt = Integer.parseInt(valores[0]);
                    int asientoInt = Integer.parseInt(valores[1]);
                    String idUser = valores[2];

                    Butaca b = new Butaca(filaInt, asientoInt, idUser);
                    arrUserTemporal[filaInt][asientoInt] = b;

                    linea = br.readLine();

                }
                return arrUserTemporal;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return arrUserTemporal;

    }


    public void modificarFicheroCine(String mensaje, String ruta) {
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

    public void anadirFicheroCine(Butaca butaca, String ruta) {
        // 1º Abrimos el fichero
        File fichero = new File(ruta);

        // 2º Comprobamos que existe
        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                // 3º Abrimos los flujos de escritura -> Append a true
                fw = new FileWriter(fichero, true);
                bw = new BufferedWriter(fw);


                // 4º 0peramos con el fichero
                bw.write(butaca.getFila() + ":" + butaca.getAsiento() + ":" + butaca.getIdUser());
                bw.write("\n");


                // 5º Cerrar flujos
                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}

