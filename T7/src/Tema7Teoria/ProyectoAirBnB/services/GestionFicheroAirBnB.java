package Tema7Teoria.ProyectoAirBnB.services;

import Tema7Teoria.ProyectoAirBnB.Model.Alojamiento;
import Tema7Teoria.ProyectoAirBnB.Model.Propietario;

import java.io.*;
import java.util.ArrayList;

public class GestionFicheroAirBnB {

    //2 métodos.
    //1 - para leer el fichero csv y extraer la info que queremos
    //2 - para escribir esa info en otro fichero aparte

    public ArrayList<Alojamiento> leerFicheroAlojamineto(String ruta) {

        ArrayList<Alojamiento> arrDeAlojamintoTemporal = new ArrayList<>();

        File fichero = new File(ruta);

        if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
            FileReader fr = null;
            BufferedReader br = null;

            try {
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);


                String id = "";
                String name = "";
                String host_id = "";
                String host_name = "";
                double price = 0;


                String lineaDelFichero = br.readLine();
                int i = 0;


                while (lineaDelFichero != null) {
                    if(i == 0){
                        i++;
                    }

                    String[] infoAirBnB = lineaDelFichero.split(",");
                    id = infoAirBnB[0];
                    name = infoAirBnB[1];
                    host_id = infoAirBnB[2];
                    host_name = infoAirBnB[3];
                    try {
                        price = Double.parseDouble(infoAirBnB[9]);
                    } catch (Exception e) {
                        System.out.println("No posible pasar a double");
                    }

                    Propietario p = new Propietario(host_id, host_name);

                    Alojamiento a = new Alojamiento(id, name, p, price);

                    if (!arrDeAlojamintoTemporal.contains(a)) {
                        arrDeAlojamintoTemporal.add(a);
                    }

                    lineaDelFichero = br.readLine();
                }
                br.close();
                fr.close();

            } catch (IOException e) {
                e.printStackTrace();
            }


        } else {

            return null;
        }

        return arrDeAlojamintoTemporal.size() != 0 ? arrDeAlojamintoTemporal : null;
    }


    public void escribirFicheroAirBnB(ArrayList<Alojamiento> arrAlojamiento) {
        File fichero = new File("src/archivosTema7");



        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {


                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);

                for (Alojamiento a : arrAlojamiento) {
                    //EL formato  para escribir será:
                    //id, name, host_id, host_name, price



                    bw.write(a.getId());
                    bw.write(",");
                    bw.write(a.getName());
                    bw.write(",");
                  //  bw.write(a.getPropietario());
                    bw.write(",");
                  //  bw.write(a.getPrecio());
                    bw.write(",");


                }

            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }


}



