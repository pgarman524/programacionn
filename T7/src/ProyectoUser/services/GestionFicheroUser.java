package ProyectoUser.services;

import ProyectoUser.model.Usuario;

import java.io.*;
import java.util.ArrayList;

public class GestionFicheroUser {


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


}
