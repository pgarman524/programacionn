package Tema7Teoria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTeoria {
    public static void main(String[] args) {


        //Teoría de Buffered Reader
        /*
        Es una clase en java que hereda de Reader.
        Esta clase BufferedReader añade funcionalidades muy útiles como puede ser el método .readline()
        Este método .readLine lee una línea entera del fichero y la devuelve en forma de String

        Para construir un objeto de tipo BufferedReader, le pasamos por parámetros otro Reader

         */
        // 0º Abrir el fichero
        String ls = File.separator;
        File fichero = new File("src" + ls + "archivosTema7" + ls + "ArchivosEjemplos" + ls + "bufferedFichero.txt");

        //Altamente necesario el try catch
        try {
            //1º Comprobar que existe
            if (fichero.exists() && fichero.canRead() && fichero.isFile()) {

                //2º Abrir flujo de lectura
                // Vamos a operar con BufferedReader, que admite por param un Reader
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                //En este punto ya tenemos un BufferedReader a punto y listo para leer

                //3º Operar con el fichero
                String lineaDelFichero = br.readLine();     //lee una línea
                while (lineaDelFichero != null){    //Si la línea que se ha leído es diferente de null
                    System.out.println(lineaDelFichero);    //Entonces la imprime
                    lineaDelFichero = br.readLine();    // Y acto seguido, lee la siguiente línea
                }

                // Cuando sale del bucle significa que ya no hay más líneas que leer
                // dicho con otras palabras, Se ha alcanzado el finald el texto.

                //4º Cerrar los flujos
                br.close();
                fr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al operar el fichero.");
        }

    }


    //readLine() String -> nos lee una línea entera

    //Para escribir ficheros se puede hacer lo mismo que con read pero usando write
}
