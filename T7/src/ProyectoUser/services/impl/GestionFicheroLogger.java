package ProyectoUser.services.impl;

import ProyectoUser.model.Usuario;

import java.io.*;
import java.util.ArrayList;

public class GestionFicheroLogger {


    public ArrayList<Usuario> leerficheroUsers(String ruta) {

        ArrayList<Usuario> arrUserTemporal = new ArrayList<>();


        //1º Abrir File
        File fichero = new File(ruta);


        if (fichero.exists() && fichero.canRead() && fichero.isFile()) {
            FileReader fr = null;
            BufferedReader br = null;

            try {

                fr = new FileReader(fichero);
                br = new BufferedReader(fr);


                String id = "";
                String name = "";
                String password = "";
                boolean isAdmin = false;

                String lineaDelFichero = br.readLine();
                int i = 0;

                while (lineaDelFichero != null) {

                    String[] infoFichero = lineaDelFichero.split(":");
                    id = infoFichero[0];
                    name = infoFichero[1];
                    password = infoFichero[2];
                    isAdmin = Boolean.parseBoolean(infoFichero[3]);


                    Usuario u = new Usuario(id, name, password, isAdmin);

                    if (!arrUserTemporal.contains(u)) {
                        arrUserTemporal.add(u);
                    }

                    lineaDelFichero = br.readLine();
                }
                br.close();
                fr.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            return null;
        }
        return arrUserTemporal.size() != 0 ? arrUserTemporal : null;
    }


    public void escribirFichero(ArrayList<Usuario> arrUser, String ruta) {

        File fichero = new File(ruta);

        if (fichero.exists() && fichero.canWrite() && fichero.isFile()) {
            FileWriter fw = null;
            BufferedWriter  bw = null;

            try {
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);


                for (Usuario u : arrUser){

                    bw.write(u.getId());
                    bw.write(":");
                    bw.write(u.getName());
                    bw.write(":");
                    bw.write(u.getPassword());
                    bw.write(":");
                    bw.write(u.isAdmin()+"");
                    bw.newLine();

                }

                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }


    public void modificarFichero(ArrayList<Usuario> users, String ruta) {

        // 1º Abrimos el fichero
        File fichero = new File(ruta);

        // 2º Comprobamos que existe
        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                // 3º Abrimos los flujos de escritura -> Con el append a false
                fw = new FileWriter(fichero, false);
                bw = new BufferedWriter(fw);


                // 4º 0peramos con el fichero
                // a) Recorremos el arrayList que queremos escribir en el fichero
                for (Usuario u : users) {
                    // b) escribrimos en el fichero
                    bw.write(u.getId()+":"+u.getName()+":"+u.getPassword()+":");
                    bw.write(u.isAdmin()+"");
                    bw.write("\n");
                }

                // 5º Cerrar flujos
                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }



}
