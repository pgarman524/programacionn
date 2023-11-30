import java.util.Scanner;

public class ejercicioMenu {
    /*
    Crear una tienda y hacer un menú que diga:

bienvenid@ a x:
1. Iniciar sesion
3. Ver productos
4. Salir
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eleccion;
        int salir;

        String usuario = "Pablito";
        String contrasenia = "ni123456";

        String usuarioDado;
        String contraseniaDada;


        do {
            System.out.println("Bienvenido a Tuscosas SL.");
            System.out.println("Elige qué quiere hacer:");
            System.out.println("1. Iniciar Sesión.");
            System.out.println("2. Ver productos.");
            System.out.println("3. Salir.");

            eleccion = scan.nextInt();
            int elegirProducto;
            if (eleccion == 1) {
                do {
                    System.out.println("Hola, introduzca su usuario: ");
                    usuarioDado = scan.next();

                    System.out.println("Introduzca su contraseña: ");
                    contraseniaDada = scan.next();


                    if (!usuarioDado.equals(usuario) || !contraseniaDada.equals(contrasenia)) {
                        System.err.println("Acceso denegado."); // con "err" el texto aparece en rojo :O!
                        System.out.println("");
                        System.out.println("¿Quiere volver a intentarlo?");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        int choose;
                        choose = scan.nextInt();
                        if (choose == 1){

                        } else if (choose == 2){
                            break;
                        }

                    }

                } while (!usuarioDado.equals(usuario) || !contraseniaDada.equals(contrasenia));
                System.out.println("");

                //*****************************************************************
            } else if (eleccion == 2) {
                int opcionP;
                int cafe = 0;
                int seguirDurmiendo = 0;
                int agua = 0;
                int colacao = 0;
                do {
                    System.out.println("Aquí está la lista de productos:");
                    System.out.println("- 1.Café");
                    System.out.println("- 2.Seguir durmiendo");
                    System.out.println("- 3.Agua");
                    System.out.println("- 4.Colacao");
                    System.out.println("- 0.Salir");

                    System.out.println("Elige el producto");
                    elegirProducto = scan.nextInt();


                    if (elegirProducto == 1) {
                        System.out.println("Ha seleccionado café.");
                        cafe++;
                    }
                    if (elegirProducto == 2) {
                        System.out.println("Ha  elegido  Seguir durmiendo.");
                        seguirDurmiendo++;
                    }
                    if (elegirProducto == 3) {
                        System.out.println("Ha elegido agua.");
                        agua++;
                    }
                    if (elegirProducto == 4) {
                        System.out.println("Ha elegido Colacao.");
                        colacao++;
                    }

                    System.out.println("Tiene en su carrito: " + cafe + " de café, " + seguirDurmiendo + " de seguir durmiendo, " + agua + " de agua " + colacao + "  y de colacao.");
                } while (elegirProducto != 0);
                    break;

            }
            //******************************************************************************
            if (eleccion == 3){
                System.out.println("Ha salido del menú");
            }
        } while (eleccion != 3);
        System.out.println("Ha salido del menú.");
    }
}
