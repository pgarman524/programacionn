package ProyectoBanco;

import ProyectoBanco.Clases.impl.CuentaAhorro;
import ProyectoBanco.Clases.impl.CuentaCorriente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CuentaCorriente pablo = new CuentaCorriente("123456789123456ES", 3580);
        CuentaCorriente pabloJr = new CuentaCorriente("123456789123456ES", 3580);

        CuentaAhorro udehde = new CuentaAhorro("123456789123456ES", 3580, 10);

        pablo.ingresoDinero(450.50);

        Scanner scan = new Scanner(System.in);

        System.out.println("Indique la cantidad a traspasar: ");
        double cant = scan.nextDouble();
        pablo.traspasarDinero(cant, pabloJr);

    }
}
