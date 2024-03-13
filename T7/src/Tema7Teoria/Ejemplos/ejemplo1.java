package Tema7Teoria.Ejemplos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class ejemplo1 {
    public static void main(String[] args) {


        /*
        Enunciado
        Crear un programa que lea un fichero de texto plano y cuente
        las palabras que hay en él.
        El programa debe mostrar el número de palabras que hay.
        (Opcional) Mostrar las palabras también.
         */

        /*
        Consejo: Cread un Arraylit<String> para almacenar las
        palabras que vayáis identificando.
         */


        File ejemplo1 = new File("src/archivosTema7/ArchivosEjemplos/fich_ejemplo1.txt");

        if (ejemplo1.exists() && ejemplo1.isFile() && ejemplo1.canWrite()) {

            FileReader fr = null;
            try {
                fr = new FileReader(ejemplo1);

                int caracter = 0;
                //Pasar l contenido de un File a un String
                String palabras = Files.readString(ejemplo1.toPath());
                System.out.println(palabras);
                //Creamos un array viejuno donde almacenaremos las palabras
                String[] cadena;
                //Separamos las palabras por espacios en blanco y las guardamos en el array
                cadena = palabras.split(" ");
                //Mostramos la longitud del array para ver uántas palabras existen
                int contador = cadena.length;

                System.out.println(contador);

                //Cerramos el flujo del archivo
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al leer el fichero.");
            }

        }


    }
}

//Otra forma
/*
 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ejemplo1 {
    public static void main(String[] args) {

        Enunciado
        crear un programa que lea un fichero de texto plano y cuente las palabras que hay en el
        -- El programa debe mostrar el numero de palabras que hay
        (opcional) Mostrar las palabras tambien

  //  File fichero1 = new File("src/Tema7/fich_ejemplos.txt");


    FileReader fr = null;
        try {
                fr = new FileReader(fichero1, StandardCharsets.ISO_8859_1);

                // declarar variables
                int nPalabras = 0;
                int caracter = 0;

                // leer un caracter cone el metodo.read()


                while (caracter != -1) { // Mientras caracter sea diferente de -1... seguimos leyendo
                caracter = fr.read(); // fr.read() devuelve un entero... EL CARACTER EN UNICODE
                if (caracter == 32 || caracter == -1){
                nPalabras ++;
                }

                System.out.print((char) caracter); // Aquí... el (char) caracter lo que hace es
                // cambiar de número a caracter... obtiene caracter correspondiente del código UNICODE
                }

                System.out.println("El numero de palabras es" + nPalabras);

                fr.close();

                }catch (IOException e){
                System.out.println("error");
                }
                }
                }
 */