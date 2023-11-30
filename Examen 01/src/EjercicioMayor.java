import java.util.Scanner;

/*
Nombre: Pablo
Apellidos: García Mangana
Ejercicio número 4
*/
public class EjercicioMayor {
    public static void main(String[] args) {
        //comienza el main

        //Llamamos al Scanner para poder pedir los números más adelante
        Scanner scan = new Scanner(System.in);

        //Para "no pillarnos los dedos" hacemos double y así pueden meter números con decimales.
        double num1;
        double num2;

        //Introducimos el 1º número aquí
        System.out.println("Introduce el primer número: ");
        num1 = scan.nextDouble();

        //Introducimos el 2º número aquí
        System.out.println("Introduce el primer número: ");
        num2 = scan.nextDouble();

        //Comenzamos los if aquí
        if (num1 == num2){
            System.out.println("Los dos números son iguales :D");
        } else if (num1 != num2) { //Ojo cuidado que añadimos más if dentro de else!!
            if (num1 >num2){
                System.out.println("¡El primer número es el mayor! :D");
            } else {
                System.out.println("¡El segundo número es el mayor! D:)");
            }
        //Aquí terminan los if.

        }
    }
//aquí acaba el main
}
