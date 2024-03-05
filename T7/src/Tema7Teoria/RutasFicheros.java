package Tema7Teoria;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class RutasFicheros {
    public static void main(String[] args) {

        // Para conocer la línea separadora  hacemos uso de
        String lineaSeparadora = File.separator;
        System.out.println("La línea separadora es: " + lineaSeparadora);

        // Rutas absolutas vs Rutas relativas
        File fileAbsoluto = new File("C:\\Users\\Pgarman524\\Desktop\\programacion\\T7\\src\\archivosTema7\\Fich.txt");

        System.out.println("¿El fichero existe? " + fileAbsoluto.exists());

        File fileRelativo = new File("src" + lineaSeparadora + "/archivosTema7/Fich.txt");
        System.out.println("¿El fichero existe? " + fileRelativo.exists());


        // 0º Comprobamos si el fichero existe
        if (fileRelativo.exists()) {
            // 1º Abrir el flujo de lectura -> Al leer/escribir ficheros se lanzan excepciones
            // esas excepciones son de IOEception y FileNotFoundExcepion
            FileReader fL = null;

            try {
                //Aquí abrimos el flujo de lectura al crear un objeto de tipo FileReader
                fL = new FileReader(fileRelativo, StandardCharsets.UTF_8);

                //2º Operamos con el fichero -> leer info
                int caracter = fL.read();
                while (caracter != -1) {
                    System.out.print((char) caracter);
                    caracter = fL.read();
                }
                //3º Cerramos los flujos
                fL.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        //Ahora vamos a hacer escritura
        if (fileRelativo.exists() && fileRelativo.isFile()) {
            FileWriter fW = null;
            try {
                //fW = new FileWriter(fileRelativo, true);      --->     Si queremos continuar el fichero y que no se sobreescriba
                fW = new FileWriter(fileRelativo);
                //Escribimos el fichero
                Scanner scan = new Scanner(System.in);
                String lineaAEscribir = scan.nextLine();
                fW.write(lineaAEscribir);
                //Cerramos el flujo
                fW.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }







    }


    /**
     * - Abrir flujo
     * - Operar con el fichero
     * - Cerrar el flujo
     */


}

