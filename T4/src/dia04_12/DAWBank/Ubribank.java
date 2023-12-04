package dia04_12.DAWBank;

import dia04_12.DAWBank.Clases.CuentasBancarias;

import java.util.Scanner;

public class Ubribank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Hola, bienvenide a Ubribank. Crearemos una cuenta para usted.");

        CuentasBancarias nueva = new CuentasBancarias("ES6621000418401234567891", "Juan Manuel Otelo Gutierrez");

        System.out.println("¿Cuanto dinero quiere ingresar?");

        double cantidadQueSeQUiereIngresar = 0.0;
        cantidadQueSeQUiereIngresar = scan.nextDouble();
        nueva.ingresar(cantidadQueSeQUiereIngresar);


        double  cantidadQueSeQuiereRetirar = 0.0;
        System.out.println("¿Cuánto dinero quiere retirar?");
        cantidadQueSeQuiereRetirar = scan.nextDouble();
        nueva.retirar(cantidadQueSeQuiereRetirar);

        nueva.mostrarSaldo();

    }
}
