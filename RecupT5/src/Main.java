import Classes.Agenda;
import Classes.Contacto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 1;
        Agenda agenda = new Agenda();
        try {
            do {

                Scanner scan = new Scanner(System.in);
                System.out.println("Bienvenido, ¿qué desea realizar?");
                System.out.println("1. Insertar contacto \n2. Buscar contacto" +
                        "\n3. Eliminar contacto \n0. Salir");
                op = scan.nextInt();

                switch (op) {
                    case 1:
                        String nombre = "";
                        String num = "";
                        System.out.println("Introduce el nombre del contacto: ");
                        nombre = scan.next();
                        System.out.println("Introduce el teléfono del contacto: ");
                        num = scan.next();
                        Contacto contacto = new Contacto(nombre, num);
                        agenda.anadirContacto(contacto);
                        break;
                    case 2:
                        String contactoABuscar = "";
                        System.out.println("Indique el contacto a buscar: ");
                        contactoABuscar = scan.next();
                        agenda.existeContacto(contactoABuscar);
                        break;
                    case 3:
                        String contactoAEliminar = "";
                        System.out.println("Indique el contacto a eliminar");
                        contactoAEliminar = scan.next();
                        agenda.eliminarContacto(contactoAEliminar);
                        break;
                    default:
                        break;
                }


            } while (op != 0);
        } catch (InputMismatchException e) {
            System.out.println("Opción no válida");
        }

    }
}