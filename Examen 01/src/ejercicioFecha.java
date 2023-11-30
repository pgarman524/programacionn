import java.util.Scanner;

/*
    Nombre: Pablo
    Apellido: García Mangana
    Ejercicio número 3
 */
public class ejercicioFecha {
    public static void main(String[] args) {
        //Principio del método main.

        // Creamos las variables principales para nuestro programa, ya que son números enteros. Usaremos int.
        int dia;
        int mes;
        int año;


        //Pedimos al usuario la fecha con scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor introduzca el día:");
        dia = scan.nextInt();

        System.out.println("Por favor introduzca el mes:");
        mes = scan.nextInt();

        System.out.println("Por favor introduzca el año:");
        año = scan.nextInt();

            //Creamos una serie de if para cada mes del año.  así si introducen un número este pasa a ser un nombre.
        if (mes == 1) {
            System.out.println("Es el " + dia + " de enero de " + año);
        }
        if (mes == 2) {
            System.out.println("Es el " + dia + " de febrero de " + año);
        }
        if (mes == 3) {
            System.out.println("Es el " + dia + " de marzo de " + año);
        }
        if (mes == 4) {
            System.out.println("Es el " + dia + " de abril de " + año);
        }
        if (mes == 5) {
            System.out.println("Es el " + dia + " de mayo de " + año);
        }
        if (mes == 6) {
            System.out.println("Es el " + dia + " de junio de " + año);
        }
        if (mes == 7) {
            System.out.println("Es el " + dia + " de julio de " + año);
        }
        if (mes == 8) {
            System.out.println("Es el " + dia + " de agosto de " + año);
        }if (mes == 9){
            System.out.println("Es el "+dia+" de septiembre de "+año);
        } if (mes ==10){
            System.out.println("Es el "+dia+" de octubre de "+año);
    }if (mes == 11){
            System.out.println("Es el "+dia+" de noviembre de "+año);
        } if (mes ==12){
            System.out.println("Es el "+dia+" de diciembre de "+año);
    }
        //finaliza el if
    }
//finalizamos el main
}
