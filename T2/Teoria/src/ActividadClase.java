import java.util.Scanner;

public class ActividadClase {
    public static void main(String[] args) {
        /*
        Usar el bucle correcto:
            1.  Hacer programa que pida números y los muestre en el programa hasta que el usuario introduzca un número negativo.
            -> introduce5
            -> muestro "Numero introducido:5"
            -> introduce -1
            -> muestra "adiosito"

            2. Hacer un programa que pida un número (positivo) y muestre los valores pares desde 0 hasta ese número.
            Si el usuario no introduce el número correcto, el programa debe seguir pidiéndole
            que introduzca un número correcto.

            EJEMPLO
            ->Programa pide un número
            ->Usuario introduce -5
            ->Programa muestra -> Error, pruebe  de nuevo
            ->Usuario introduce -10
            ->Programa muestra -> Error, pruebe  de nuevo
            ->Usuario introduce 4
            ->Programa muestra -> 0,2,4
            FIN
         */

        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();


    while (num >= 0){
        System.out.println("Introduce un número negativo");
        num =scan.nextInt();
    } if (num < 0){
            System.out.println("adiosito");
        }


    }
}
