package Tema7Teoria.ProyectoTrivial.Services;

import Tema7Teoria.ProyectoTrivial.Model.Participante;
import Tema7Teoria.ProyectoTrivial.Model.PreguntaRespuesta;

import java.io.*;
import java.util.ArrayList;

public class GestionFichero {


        /*
        Va a tener en principio dos métodos.

        1º - Va a ser para leer un fichero y volcar la información en un ArrayList de Preguntas


        2º - Va a ser para escribir un fichero la información que viene desde el arrayList de participantes

         */


    public ArrayList<PreguntaRespuesta> leerFicheroPreguntas() {

        // 0º Crerar e inicializar el ArrayList que al final pasaremos a la clase Trivial
        ArrayList<PreguntaRespuesta> arrDePreguntasTemporal = new ArrayList<>();

        // 1º Abrir el file (la ruta es la misma que en el ejercicio anteriror)

        String ls = File.separator;
        File fichero = new File("src/archivosTema7/ArchivosEjemplos/preguntas_respuestas.txt");


        // 2º Comprobar si el file existe, el modo lectura, etc.
        try {
            // 1º Comprobar que el fichero existe
            if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
                // 3º Abrir los flujos de lectura (Vamos a trabajar con un BufferedReader)
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                // 4º Operar con el fichero
                //Lo que hay que hacer es:
            /*
                - Seprarar la línea en pregunta y respuesta (con el .split)
                - Crear un objeto de tipo Pregunta
                - Si el objeto se ha creado correctamente, añadirlo al arrList arrDePreguntasTemporal

             */


                String linea = br.readLine();


                //Añadimos dentro del objeto PreguntaRespuesta en cada apartado una preg y su resp
                String preg = linea.split(":")[0];
                String resp = linea.split(":")[1];

                PreguntaRespuesta p = new PreguntaRespuesta(preg, resp);

                arrDePreguntasTemporal.add(p);

                // 5º Cerrar los flujos

                br.close();
                fr.close();


            }


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al operar con el fichero");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error general... eliminando todos sus archivos");
        }


        // 6º Devolver el arrDePreguntasTemporal
        return arrDePreguntasTemporal;
    }


    public void escribirFicheroPuntuaciones(ArrayList<Participante> arrPar) {

        // 1º Abrir el File (la ruta del fichero de puntuaiones)
        File puntuaciones = new File("src/archivosTema7/ArchivosEjemplos/puntuaciones.txt");

        // 2º Comprobar que existe y está modo escritura
        try {
            if (puntuaciones.exists() && puntuaciones.isFile() && puntuaciones.canRead()) {
                // 3º Abrir los flujos de Escritura (con BuffereWriter)
                FileWriter fw = new FileWriter(puntuaciones);
                BufferedWriter bw = new BufferedWriter(fw);
                // 4º Operar con el fichero
                // a) Recorrer el Arraylist arrPar
                // b) Escribir todos los registros

                for (int i = 0; i < arrPar.size(); i ++){
                    //El formato para escribir va a ser:
                    // id: [fecha, puntuacion; fecha, puntuacion]

                }
                // 5º Cerrar los flujos de escritura

                bw.close();
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al operar con el fichero");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error general... eliminando todos sus archivos");
        }







    }


}
