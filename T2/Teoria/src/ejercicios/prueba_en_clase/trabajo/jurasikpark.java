package ejercicios.prueba_en_clase.trabajo;

import java.util.Scanner;

public class jurasikpark {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();

       while (num != 0) {
            System.out.println("Ahahaha, no has dicho la contraseña correcta");
            num =scan.nextInt(); //vuelves a pedir el número

       }
    }
}
