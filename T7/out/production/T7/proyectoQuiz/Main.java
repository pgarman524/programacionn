package archivosTema7.proyectoQuiz;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String reset = "\u001B[0m";

    public static void main(String[] args) {

        //Vamos a leer un fichero que va a contener preguntas y respuestas, separadas por ':'
        String ls = File.separator;
        File fichero = new File("src" + ls + "archivosTema7" + ls + "ArchivosEjemplos" + ls + "preguntas_respuestas.txt");

        ArrayList<String> preguntas = new ArrayList<>();
        ArrayList<String> respuestas = new ArrayList<>();

        // 1º Comprobar que el fichero existe
        try {

            if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
                // 2º Abrir los flujos de lectura (Vamos a trabajar con un Buffered)
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);

                // 3º Operar con el fichero
                String pregunta = "";
                String respuesta = "";

                String linea = br.readLine();
                while (linea != null) {
                    System.out.println(linea);
                    String[] lineaSeparada = linea.split(":");
                    pregunta = lineaSeparada[0];
                    respuesta = lineaSeparada[1];
                    preguntas.add(pregunta);
                    respuestas.add(respuesta);
                    linea = br.readLine();
                }

                //Recorrer preguntas e imprimo cada elemento
                for (int i = 0; i < preguntas.size(); i++) {
                    System.out.println("Pregunta " + i + ": " + preguntas.get(i));
                }
                //Recorrer respuestas e imprimo cada elemento
                for (int i = 0; i < respuestas.size(); i++) {
                    System.out.println("Respuestas " + i + ": " + respuestas.get(i));
                }

//4º Cerrar flujos
                br.close();
                fr.close();
            }


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al abrir el fichero.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al abrir el fichero.");
        }


        /*
        + Hacer un prequeño programa que te pregunte todas las preguntas
        + Compruebe si la respuesta es correta
        (opc) -> Que vaya sumando el nº de respuestas correctas y muestre la puntuación final
         */


        int puntos = 0;
        String escribir = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido a pasa palabra. Primera pregunta: ");
        for (int i = 0; i < preguntas.size(); i++) {

            double selector = Math.random();

            if (selector < 0.35){
                System.out.println(preguntas.get(0));

                System.out.println("Respuesta");
                escribir = scan.next();
                if (escribir.equalsIgnoreCase(respuestas.get(0))) {
                    System.out.println(green + "¡Respuesta correcta!" + reset);
                    puntos++;

                } else {
                    System.out.println(red + "Respuesta incorrecta..." + reset);
                }

            } else if (selector > 0.35 && selector < 0.75) {
                System.out.println(preguntas.get(1));

                System.out.println("Respuesta");
                escribir = scan.next();
                if (escribir.equalsIgnoreCase(respuestas.get(1))) {
                    System.out.println(green + "¡Respuesta correcta!" + reset);
                    puntos++;

                } else {
                    System.out.println(red + "Respuesta incorrecta..." + reset);
                }
            }else {
                System.out.println(preguntas.get(2));


                System.out.println("Respuesta");
                escribir = scan.next();
                if (escribir.equalsIgnoreCase(respuestas.get(2))) {
                    System.out.println(green + "¡Respuesta correcta!" + reset);
                    puntos++;

                } else {
                    System.out.println(red + "Respuesta incorrecta..." + reset);
                }
            }



        }

        System.out.println("Tu resultado es de: " + puntos + " / " + preguntas.size());


        /*
        //OTRA FORMA DE HACER PREGUNTAS RANDOM CON INT Y NO DOUBLE


        String respuestaUsuarioR = "";
        String salir = "";
        int ncorrectasR = 0
        Random r = new Random();

        while (salir.equalsIgnoreCase("si")){
         int = nRandom = r.nextInt(preguntas.size());  //Genera un número entre 0 y preguntas.size()

       String pregunta = preguntas.get(nRandom);
       String respuesta = respuestas.get(nRandom);


            System.out.println(pregunta));
            respuestaUsuarioR = scan.nextLine();

              System.out.println("");
                escribir = scan.next();
                if (escribir.equalsIgnoreCase(respuesta))) {
                    System.out.println(green + "¡Respuesta correcta!" + reset);
                    puntos++;

                } else {
                    System.out.println(red + "Respuesta incorrecta..." + reset);
                }

                 System.out.println("Tu resultado es de: " + puntos + " / " + preguntas.size());

        }


         */



    }


}
