package dia14_11Teoria;

import java.util.Scanner;

public class Teoria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dni = scan.next();
    }

    /**
     * Métodos clase Strings:
     * .substring()   --> Separa el String
     * <p>
     * Ej:
     * cadena="12345678A"
     * String parteNum = cadena.substring(0,8);
     * ---> el 0 al 8 se refire que cogerá desde la posición 0 hasta la anterior a 8
     */

    //Función que comprueba que la parte numérica del dni
    // es efectivamente un número.
    public static boolean comprobarParteNumerica(String dni) {
        String parteNumerica = ""; //String auxiliar para almacenar la parte numérica

        try {
            //Para obtener la parte numérica, hago un substring de la posición 0 a la 8
            parteNumerica = dni.substring(0, 8);
            System.out.println("La parte numérica es: " + parteNumerica);

            //Por último voy a comprobar que efectivamente es un número
            int numero = Integer.parseInt(parteNumerica);
            System.out.println("La parte numércia como número es: " + numero);

        } catch (Exception e) {
            //Si lanza una excepción significa que la parte numérica del dni es incorrecta.
            System.out.println("Error en los datos.");
            return false;
        }
        return true;
    }
}
