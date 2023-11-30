import java.util.Scanner;

public class Condicionales {
    public static void main (String[] args) {
        /*Nombre:  Pablo
        Apellidos: García Mangana
        Actividad: Condicionales
                 */
        double suma; //he añadido double porque la división puede salir decimales y romper la máquina.
        double resta;
        double producto;
        double division;

        System.out.println("Introduzca la ecuación");
        Scanner scan = new Scanner(System.in);
        double a =scan.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        double b =scan2.nextDouble();
//he añadido los dos Scan para que puedas seleccionar dos números
        suma = (a + b);
        resta = (a - b);
        producto = (a % b);
        division = (a / b);

        System.out.println("El resultado es: "+"  (+)"+suma+ " (-)"+ resta+" (%)"+ producto +" (/)"+ division);

    }
}
