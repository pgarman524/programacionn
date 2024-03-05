package ejerRepaso;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Multiplicar {
    public static void main(String[] args) throws IOException {

        int num = 0;

        Scanner scan = new Scanner(System.in);

        File fichero1 = new File("src/archivosTema7/multiplicar.txt");


        if (!fichero1.isFile()) {
            fichero1.createNewFile();
        } else {
            System.out.println("El fichero existe y no se puede sobrescribir.");
        }


        num = scan.nextInt();

        if(fichero1.exists() && fichero1.isFile() && fichero1.canWrite()) {
            FileWriter fw = null;

            


        }

        }
}
