import java.util.Scanner;

public class usuarioContraseña {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String usuario = "Pablito";
        String contrasenia = "ni123456";

        String usuarioDado;
        String contraseniaDada;

        do {
            System.out.println("Hola, introduzca su usuario: ");
            usuarioDado = scan.next();

            System.out.println("Introduzca su contraseña: ");
            contraseniaDada = scan.next();;

            if (!usuarioDado.equals(usuario) || !contraseniaDada.equals(contrasenia)){
                System.err.println("Acceso denegado.");} // con "err" el texto aparece en rojo :O!

        } while (!usuarioDado.equals(usuario) || !contraseniaDada.equals(contrasenia));
        System.out.println("Acceso garantizado.");

    }
}
