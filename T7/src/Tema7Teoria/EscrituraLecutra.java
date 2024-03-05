package Tema7Teoria;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscrituraLecutra {

    public static void main(String[] args) {

        // VAMOS A ESCRIBIR EN UN FICHERO COSAS HASTA QUE SE ESCRIBA FIN
        // 0º Obtener la barra separadora
        String ls = File.separator;

        // 1º Abrir el fichero
        File ficheroPrueba = new File("src/archivosTema7/fichero_prueba.txt");

        // 2º Comprobar que el fichero existe
        if(ficheroPrueba.exists() && ficheroPrueba.isFile() && ficheroPrueba.canWrite()) {

            // 3º Abrir flujos (en este caso, de escritura) -> Lanza IOException
            FileWriter fw = null;
            try {
                fw = new FileWriter(ficheroPrueba);

                String cadenaAEscribir = "";
                Scanner scan = new Scanner(System.in);
                while (!cadenaAEscribir.equalsIgnoreCase("fin")) {

                    System.out.println("Oh Elron, dime algo bonito...");
                    cadenaAEscribir = scan.nextLine();

                    if(!cadenaAEscribir.equalsIgnoreCase("fin")) {
                        // 4º Operar con el fichero
                        fw.write(cadenaAEscribir+"\r\s");
                    }
                }

                // 5º Cerrar los flujos
                fw.close();


            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al operar con el fichero");
                // Para cerrar el flujo en caso de error
                if (fw != null) {
                    try {
                        fw.close();
                    } catch (Exception ex){
                        e.printStackTrace();
                    }
                }
            }


            // AHORA LECTURA DE FICHERO
            // 1º Abrir el fichero
            File ficheroParaLeer = new File("src/archivosTema7/fichero_prueba.txt");

            // 2º Comprobar que existe
            if ( ficheroParaLeer.exists() && ficheroParaLeer.isFile() && ficheroParaLeer.canRead()) {

                // 3º Abrir flujos de lectura -> Lanza IOException
                FileReader fr = null;

                try {
                    fr = new FileReader(ficheroParaLeer);

                    // 4º Operar con el fichero
                    int caracter = 0;
                    while (caracter != -1) { // Mientras caracter sea diferente a -1... seguimos leyendo
                        caracter = fr.read(); // fr.read() devuelve un entero... ELL CARACTER EN UNICODE

                        System.out.print((char) caracter); // Aquí... el (char) caracter lo que hace es
                        // cambiar el número a caracter... obtiene carcter correspondiente del código UNICODE
                    }

                    // 5º Cerrar los flujos
                    fr.close();

                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error");
                }


            }
        }

    }

}
