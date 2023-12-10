
import Clases.CuentasBancarias;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ubribank {

    //Colores para la consola que sino es muy aburrido

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {

        //Vamos a declarar las variables de la clase:
        int menu = 0;
        String iban = " ";
        String titular = " ";
        double dineroAIngresar;
        double dineroARetirar;

        System.out.println(ANSI_BLUE + "Hola, bienvenide a Ubribank. Crearemos una cuenta para usted.");
        System.out.println("Introduzca su iban, por favor: ");
        Scanner scan = new Scanner(System.in);
        iban = scan.next();
        //Iban de prueba ES6621700468404234567891

        System.out.println("Introduzca el nombre y apellidos del titular, por favor: ");
        titular = scan.next();
        scan.nextLine();
        //Titular de prueba Juan Manuel Otelo Gutierrez


        //Constructor de la "nueva" cuenta
        CuentasBancarias nueva = new CuentasBancarias(iban, titular);

        System.out.println(ANSI_RESET + "Comprobando si los datos introducidos son correctos...");
        //Con esto comprobamos el Iban si es correcto o no
        nueva.finalizarSiIbanIncorrecto(iban);
        nueva.comprobarIban(iban);


        do {
            try {
                System.out.println("¿Qué desea realizar?");
                System.out.println(" 1. Datos de la cuenta." +
                        "\n 2. Mostrar IBAN." +
                        "\n 3. Titular de la cuenta." +
                        "\n 4. Mostrar Saldo disponible." +
                        "\n 5. Ingresar dinero." +
                        "\n 6. Retirar dinero." +
                        "\n 7. Historial de movimientos." +
                        "\n 8. Salir.");

                menu = scan.nextInt();


                if (menu == 1) {

                    nueva.mostrarDatosCuenta();


                } else if (menu == 2) {

                    nueva.mostrarIban();

                } else if (menu == 3) {

                    nueva.mostrarTitular();

                } else if (menu == 4) {

                    nueva.mostrarSaldo();

                } else if (menu == 5) {
                    System.out.println(ANSI_BLUE + "Introduzca una cantidad a ingresar: " + ANSI_RESET);

                    dineroAIngresar = scan.nextDouble();
                    nueva.ingresar(dineroAIngresar);

                } else if (menu == 6) {
                    System.out.println(ANSI_BLUE + "Introduzca una cantidad a retirar: " + ANSI_RESET);

                    dineroARetirar = scan.nextDouble();
                    nueva.retirar(dineroARetirar);

                } else if (menu == 7) {
                    nueva.mostrarMovimientos();


                }

            } catch (InputMismatchException j) {
                System.err.println("Por favor introduzca un número válido");
                return;
            }
        } while (menu != 8);
        System.out.println(ANSI_BLUE + "Ha sido un placer, ¡espero que vuelva en otro momento!");


    }
}
