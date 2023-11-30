import java.util.Scanner;

public class PabloGarcia_ejercicio_4 {
    public static void main(String[] args) {
        String dni;
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce un dni: ");
        dni = scan.next();

        if (dni.length() == 9) {
        char ultimoChar = dni.charAt(8);
            System.out.println(ultimoChar);

            if (ultimoChar <= 65 ||ultimoChar >=90 ){
                System.out.println("El Dni es correcto");

            }else {
                System.out.println("Error, Dni inválido");
            }

        } else {
            System.out.println("Error, no es un DNI");
        }


    }
}

