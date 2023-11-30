import java.util.InputMismatchException;
import java.util.Scanner;

public class PabloGarcia_ejercicio_1 {
    public static void main(String[] args) {
        //Declaramos un array bidimensional
        String[][] barraArr;
        barraArr = new String[10][10];

        //Nos movemos por el array bidimensional
        for (int i = 0; i < barraArr.length; i++) {
            for (int j = 0; j <= barraArr[i].length - 1; j++) {
                //Como vamos moviendonos por el array, i y j van transofmándose en "__"
                barraArr[i][j] = "__";

            }
        }
        //-----------------------------------------------------
        //Creamos la variable para seleccionar el menú
        int selector = 0;
        //Declaramos el Scanner
        Scanner scan = new Scanner(System.in);


        //Creamos un menú usando do while para que nos muestre las dos opciones
        do {

            System.out.println("Hola, ¿qué quiere hacer?");

            System.out.println("1.Comprar entrada.");
            System.out.println("0.Salir");

            //Este try catch nos da error si introducimos un valor que no es int
            try {

                selector = scan.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Por favor introduzca una elección válida");
            }


            if (selector == 1) {

                //Este try catch es para mostrar un error si llegamos a introducir un array que sobrepase los límites.
                try {
                    //Declaramos las variables de la fila y columna que vamos a comprar a continuación
                    int posX = 0;
                    int posY = 0;

                    System.out.println("Hola, introduzca la fila: ");
                    posX = scan.nextInt();
                    System.out.println("Hola introduzca la línea: ");
                    posY = scan.nextInt();

                    //Ahora lo que hacemos es, si el array introducido contiene "__" lo transformamos a "XX"
                    if (barraArr[posX][posY] == "__") {

                        barraArr[posX][posY] = "XX";

                    } else {
                        System.out.println("Esa posición ya está ocupada.");
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Lo siento, ese asiento no existe.");
                }
                //------------------------------------------------------------------------------------------------
                //Pequeño menú para elegir si salir o seguir comprando.

                int elegir;

                System.out.println("¿Quiere continuar comprando?");
                System.out.println("1.Sí");
                System.out.println("0.Salir");
                elegir = scan.nextInt();

                //Aquí mostramos los asientos comprados al salir y los que aun no están ocupados usando el for
                if (elegir == 0) {
                    System.out.println("Las filas compradas son: ");
                    for (int i = 0; i < barraArr.length; i++) {
                        for (int j = 0; j <= barraArr[i].length - 1; j++) {
                            System.out.print(barraArr[i][j]);
                        }
                    }
                    //salimos del bucle
                    break;
                }

            }


        } while (selector != 0);

    }
}
