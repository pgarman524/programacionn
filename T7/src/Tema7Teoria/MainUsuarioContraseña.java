package Tema7Teoria;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainUsuarioContraseña {
    public static void main(String[] args) {

        File ficheroUsuario = new File("src/archivosTema7/Usuario");

        if (ficheroUsuario.exists() && ficheroUsuario.isFile() && ficheroUsuario.canWrite()) {

            FileWriter fw = null;
            try {
                fw = new FileWriter(ficheroUsuario);

                String cadenaAEscribir = "";
                String cadenaAEscribir2 = "";
                while (!cadenaAEscribir.equalsIgnoreCase("fin")) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Dime tu usuario: ");
                    cadenaAEscribir = scan.nextLine();
                    System.out.println("Dime su contraseña: ");
                    cadenaAEscribir2 = scan.nextLine();

                    if (!cadenaAEscribir.equalsIgnoreCase("fin")) {
                        fw.write(cadenaAEscribir + ":" + cadenaAEscribir2 + "\n\r");
                    }
                }

                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al operar con el fichero");
                // Para cerrar el flujo en caso de error
                if (fw != null) {
                    try {
                        fw.close();
                    } catch (Exception ex) {
                        e.printStackTrace();
                    }
                }
            }


        }


        File ficheroParaLeer = new File("src/archivosTema7/Usuario");

        if (ficheroParaLeer.exists() && ficheroParaLeer.isFile() && ficheroParaLeer.canRead()) {


            FileReader fr = null;

            try {
                fr = new FileReader(ficheroParaLeer);

                int caracter = 0;


                while (caracter != -1) {
                    caracter = fr.read();
                    System.out.print((char) caracter);
                }


                fr.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
