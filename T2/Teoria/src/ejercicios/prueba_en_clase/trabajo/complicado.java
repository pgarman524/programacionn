package ejercicios.prueba_en_clase.trabajo;

import java.util.Scanner;

/*
menú para seleccionar una opción
    1.Programación
    2.Entornos
    3.Bases de datos
    4.Lenguajes de marcas

 */
public class complicado {
    public static void main (String[] args) {
    int opcion;
        Scanner scan = new Scanner(System.in);

    do{
        System.out.println("¿Qué asignatura quieres matricularte?");
        System.out.println("1.Programación");
        System.out.println("2.Entornos");
        System.out.println("3.Bases de datos");
        System.out.println("4.Lenguajes de marcas");
        opcion = scan.nextInt();
    }  while (opcion != 1 && opcion != 2 && opcion  != 3 && opcion !=4);


    }
    }

