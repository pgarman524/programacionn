package Tema7Teoria;

import java.io.File;
import java.io.IOException;

public class AccesoFicheros {
    public static void main(String[] args) {
        File fichero1 = new File("C:\\Users\\Pgarman524\\Desktop\\programacion\\T7\\src\\archivosTema7\\Fich_noexiste.txt");


        if (fichero1.exists()) {
            System.out.println("El fichero existe y tiene de nombre " + fichero1.getName());
        } else {
            System.out.println("El fichero no existe.");

            System.out.println("Creando fichero...");
            try {
                fichero1.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al crear eñ fichero");
            }
        }

        //Vamos a obtener información del fichero
        System.out.println("Nombre del fichero: " + fichero1.getName());
        System.out.println("Padre del fichero: " + fichero1.getParent());
        System.out.println("Ruta absoluta del fichero: " + fichero1.getAbsolutePath());
        try {
            System.out.println("Ruta canónica del fichero: " + fichero1.getCanonicalPath());

        } catch (Exception e) {
        }
        System.out.println();


        //Vamos a intentar borrar el fichero:


        if (fichero1.delete()) {
            System.out.println("Se ha eliminado el fichero.");
        } else {
            System.out.println("No se ha podido eliminar el fichero.");
        }


        //EJERCICIO
        //Tenéis que acceder al directorio alumnos

        //Tenéis que preguntar si existe

        //Si existe, tenéis que listar todos los ficheros que contengan los directorios.


        File directorio = new File("C:\\Users\\Pgarman524\\Desktop\\programacion\\T7\\src\\archivosTema7\\alumnos");

        if (directorio.exists()) {
            System.out.println("Esiste");
        } else {
            System.out.println("Esiste");
        }


        //listFiles() te devuelve un array con todos los Files contenidos en el directorio
        File[] ficherosDelDirectorio = directorio.listFiles();


        //Tenemos que recorrer el array
        for (int i = 0; i < ficherosDelDirectorio.length; i++) {
            //Accedemos a cada elemento del array cdirectamente con [i]

            String nombreDelFichero = ficherosDelDirectorio[i].getName();

            System.out.println("Nombre: "+nombreDelFichero);
        }



    }


}
