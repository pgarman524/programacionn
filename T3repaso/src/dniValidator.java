import java.util.Scanner;

public class dniValidator {
    public static void main(String[] args) {
        String dni;
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce un dni: ");
        dni = scan.next();

        if (dni.length() == 9 ){



        }else {
            System.out.println("Error, no es un DNI");
        }


    }
}
