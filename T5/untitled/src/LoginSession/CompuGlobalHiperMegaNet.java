package LoginSession;

import LoginSession.Clases.Session;
import LoginSession.Clases.User;
import LoginSession.Services.UserSessionService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompuGlobalHiperMegaNet {

    public static void main(String[] args) {

        User user1 = new User("pepito", "123");
        Session sesionPepito = new Session("1", user1);

        UserSessionService.userRegistered.add(user1);
        UserSessionService.activeSessions.add(sesionPepito);


        System.out.println("Hola, bienvenido a Compuglobalhipermeganet");
        int menu = 1;
        do {
            System.out.println("""
                    1.Login
                    2.Alta
                    0.Salir
                    """);
            Scanner scan = new Scanner(System.in);
            menu = scan.nextInt();
            try {
                switch (menu) {
                    case 1:
                        System.out.println("introduzca su user: ");
                        String nombreUsuario = scan.nextLine();

                        break;
                    case 2:

                        break;
                    case 0:
                        System.out.println("Nos vemos");
                        break;

                    default:
                        System.err.println("Introduzca valor válido");
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Introduzca un valor válido");
            }

        } while (menu != 0);

    }
}
