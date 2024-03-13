package Tema7Teoria;


import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuizJuegoRandom {

    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        // Vamos a leer un fichero que va a contener preguntas y respuestas, separadas por :
        String ls = File.separator;
        File fichero = new File("src/archivosTema7/ArchivosEjemplos/preguntas_respuestas.txt");

        ArrayList<String> preguntas = new ArrayList<>();
        ArrayList<String> respuestas = new ArrayList<>();

        try {
            // 1º Comprobar que el fichero existe
            if (fichero.exists() && fichero.isFile() && fichero.canRead()) {

                // 2º Abrir los flujos de lectura (Vamos a trabajar con un BufferedReader)
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);

                // 3º Operar con el fichero
                String pregunta = "";
                String respuesta = "";

                String linea = br.readLine();
                while (linea != null) {
                    //System.out.println(linea);
                    String[] lineaSeparada = linea.split(":");
                    pregunta = lineaSeparada[0];
                    respuesta = lineaSeparada[1];
                    preguntas.add(pregunta);
                    respuestas.add(respuesta);
                    linea = br.readLine();
                }


                // 4º Cerrar flujos
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


        //Empieza el programa
        //Hacer 10 preguntas random
        //Almacenar la puntuación del usuario
        //Escribir el nombre del usuario junto con su puntuación en un fichero

        //Códio para escoger 10 preguntas al azar
        ArrayList<String> preguntasParaJuego = new ArrayList<>();
        ArrayList<String> respuestasParaJuego = new ArrayList<>();


        String respuestaUsuarioR = "";
        int ncorrectasR = 0;
        Random r = new Random();

        String nombre = "";

        System.out.println("Introduzca su nombre: ");
        nombre = scan.nextLine();


        while (preguntasParaJuego.size() <= 9) {
            int nRandom = r.nextInt(preguntas.size());  //Genera un Nº Random entre 0 y NºPreguntas del fichero

            String pregunta = preguntas.get(nRandom);
            String respuesta = respuestas.get(nRandom);


            if (preguntasParaJuego.contains(pregunta)) {
                System.out.println("Pregunta duplicada");
            } else {
                preguntasParaJuego.add(pregunta);
                respuestasParaJuego.add(respuestas.get(nRandom));
            }


            System.out.println(pregunta);
            respuestaUsuarioR = scan.nextLine();

            if (respuestaUsuarioR.equalsIgnoreCase(respuesta)) {
                System.out.println(green + "¡Respuesta correcta!" + reset);
                ncorrectasR++;

            } else {
                System.out.println(red + "Respuesta incorrecta..." + reset);
            }

            System.out.println(nombre + " tu resultado es de: " + ncorrectasR + " / 10");

        }


        File archivoNombre = new File("src/archivosTema7/proyectoQuiz/archivoNombre.txt");

        if (!archivoNombre.exists()) {
            try {
                // 1º Comprobar que el fichero existe
                archivoNombre.createNewFile();

                // 2º Abrir los flujos de escritura (Vamos a trabajar con un BufferedWriter)
                FileWriter fw = null;

                fw = new FileWriter(archivoNombre);

                String cadenaAEscribir = nombre + ":" + ncorrectasR;


                // 3º Operar con el fichero
                fw.write(cadenaAEscribir + "\r\n");

                // 4º Cerrar flujos
                fw.close();


            } catch (
                    IOException e) {
                e.printStackTrace();
                System.out.println("Error al operar con el fichero");
            } catch (
                    Exception e) {
                e.printStackTrace();
                System.out.println("Error general... eliminando todos sus archivos");
            }
        }

        //Juego normal -> Hacer las 10 preguntas(preguntad el nombre del usuario)


        //Escribir en el fichero el nombre:Puntuación(atención no sobreescribir los datos)

    }
}


