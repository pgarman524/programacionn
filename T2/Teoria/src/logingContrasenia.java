import java.util.Scanner;

public class logingContrasenia {
    public static void main(String[] args) {
        //Hacer un programa que lea una contraseña dada por el usuario y que la compare con la existente. Si la contraseña coincide se acepta la entrada

        Scanner scan = new Scanner(System.in);

        String contrasenia;

        String contraseniaCorrecta = "123456789";

        System.out.println("Introduce la contraseña: ");
        contrasenia = scan.next();
        if (contrasenia.equals(contraseniaCorrecta)){
            System.out.println("La contraseña es correcta.");
        }else {
            System.out.println("La contraseña es incorrecta");
        }
    }
}
