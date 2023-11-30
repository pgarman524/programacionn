package ejercicios.prueba_en_clase.trabajo;

import java.util.Scanner;

/*
1. Que muestre la asignatura en la que se ha matriculado.
2. Añadir opción "0. salir"
 */
public class complicado_ejer {
    public static void main (String[] args) {
        int opcion;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("¿Qué asignatura quieres matricularte?");
            System.out.println("1.Programación");
            System.out.println("2.Entornos");
            System.out.println("3.Bases de datos");
            System.out.println("4.Lenguajes de marcas");
            System.out.println("0. Salir");
            opcion = scan.nextInt();
        }  while (opcion != 1 && opcion != 2 && opcion  != 3 && opcion !=4 && opcion != 0);
        int opcion1 =1;
        int opcion2 =2;
        int opcion3 =3;
        int opcion4 =4;
        int opcion0 = 0;

    if (opcion1 == opcion) {
        System.out.println("se ha matriculado en Programación.");
    } if (opcion2 == opcion) {
            System.out.println("se ha matriculado en Entornos.");
        }if (opcion3 == opcion) {
            System.out.println("se ha matriculado en Bases de datos.");
        } if (opcion4 == opcion) {
            System.out.println("se ha matriculado en Lenguajes de marcas.");
        }if (opcion0 == opcion) {
            System.out.println("Ha elegido no matricularse.");
        }

    }
}
