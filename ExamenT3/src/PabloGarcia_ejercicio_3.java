import java.util.InputMismatchException;
import java.util.Scanner;

public class PabloGarcia_ejercicio_3 {
    public static void main(String[] args) {

        //Declaramos la variable del número N y del número  M
        int valorM;

        int valorN;

        try {
            //Pedimos al usuario  el valorN y el valorM
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduzca el tamaño del array.");
            valorN = scan.nextInt();
            System.out.println("Introduzca el  número en ese array");
            valorM = scan.nextInt();

            //Hacemos que arrN sea igual de grande que valorN
            int[] arrN = new int[valorN];

            //nos movemos por el array y damos a i el valor de valorM
            for (int i = 0; i < arrN.length; i++) {
                arrN[i] = valorM;
                System.out.println(arrN[i]);

            }


            //Recoge los errores para mostrar un texto explicativo.
        } catch (InputMismatchException e) {
            System.out.println("Introduzca un número por favor.");
        } catch (IndexOutOfBoundsException o) {
            System.out.println("Jaja no crack, ese número es muy grande.");
        }
    }
}
