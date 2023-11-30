import java.util.Scanner;

import static java.nio.file.Files.delete;


/**
 * LoginMejorado Ejercicio entrega
 *
 * 1DAW
 * PABLO GARCÍA MANGANA
 */

public class logingTocho {

    //Inicio los public para ñadir colorines a la consola
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        //Comenzamos declarando el array
        //arrNombre (Para los usuarios) y arrPass (Para las contraseñas)
        String[] arrNombre = new String[10];
        String[] arrPass = new String[10];

        //Creamos el scanner para más adelante. Esta Mickyherramienta será útil más adelante
        Scanner scan = new Scanner(System.in);

        //tenemos que declarar al menos 5 usuarios y 5 contraseñas según el enunciado
        arrNombre[0] = "jj";
        arrPass[0] = "jj2";

        arrNombre[1] = "asd";
        arrPass[1] = "asd2";

        arrNombre[2] = "Pablete";
        arrPass[2] = "Pablesx23#";

        arrNombre[3] = "Brunxouuu";
        arrPass[3] = "123Sº2sc#";

        arrNombre[4] = "123Sº2sc#";
        arrPass[4] = "Brunxouuu";



        //voy a dejar aquí declaradas todas las variables que vaya a ir utilizando.
        //******************************************************************************

        int menuChoose;
        String userDado = "";
        String passDado = "";
        boolean login = false;
        String userNuevo;
        String passNuevo;
        String userBaja;
        boolean userExiste = false;

        //******************************************************************************

        //Vamos a crear el menú. Para eso usaremos unos if y Do While.

        do {

            //Este if solo se activará si introducemos nuestro login correctamente.
            if (login == true) {
                System.out.println(ANSI_GREEN + "Hola, bienvenido " + userDado + ANSI_RESET);
            }

            //Aquí mostramos el menú de opciones.
            System.out.println("Elige lo que quieres hacer: ");
            System.out.println("1. Login");
            System.out.println("2. Registro");
            System.out.println("3. Baja");
            System.out.println("0. Salir");

            //Usamos el scan para pedir al usuario que ingrese un número. Este número dictamina el menú al que entrará.
            menuChoose = scan.nextInt();

            //Si "menuChoose" es 1. Abrimos el menú loging
            if (menuChoose == 1) {

                System.out.println("Hola, introduzca su usuario: ");
                userDado = scan.next();

                System.out.println("Introduzca su contraseña: ");
                passDado = scan.next();

                //Esto de usar el for para navegar en los array lo he averiguado con el BARD porque no tenía ni idea que también se usaba en este contexto.
                //Para el for aparte del bard me han ayudado angel y raquel así que dales un 0'5 o algo así. Una piruleta también vale.
                //Con este for nos movemos por el array y luego buscamos el String para comprobarlo con el String introducido.
                //Si el usuario y contraseña es correcto. Nos volverá a aparecer el menú con un nuevo mensaje.
                for (int i = 0; i < arrNombre.length; i++) {
                    for (int j = 0; j < arrNombre.length; j++) {

                        if (userDado.equals(arrNombre[i]) || passDado.equals(arrPass[j])) {
                            login = true;
                            userDado = userDado;


                        }
                    }
                    //Si el login es true. Usamos este if
                    if (login == true) {
                        System.out.println(ANSI_GREEN + "Acceso concedido." + ANSI_RESET);
                        //volvemos a declarar a login false antes de que nos devuelva al menú para evitar conflictos
                        login = false;
                        break;
                    }
                    if (login == false) {
                        System.err.println("Acceso denegado.");
                        System.out.println("");
                        System.err.println("Volviendo al menú principal.");
                        break;
                    }


                }
            }
            //Todo el menú 2 ha sido creado por chatgpt porque después de 2 días y medio seguidos peleando con esto no lo he logrado.
            //Voy a explicar lo que creo que hace  con mis palabras al menos...
            if (menuChoose == 2) {

                //Esto sí logré hacerlo yo. Pedimos usuario y contraseña
                System.out.println("Introduce el usuario que quieres registrar: ");
                userNuevo = scan.next();
                System.out.println("Introduce la contraseña que quieres registrar: ");
                passNuevo = scan.next();


                //Aquí vamos a movernos por el array de nombres
                for (int i = 0; i < arrNombre.length; i++) {
                    //Si el array de nombres es null, sobrescribe en ese index por user nuevo
                    //Había llegado a una concluión cercana pero no lograba que funcionase del todo...
                    if (arrNombre[i] == null) {
                        arrNombre[i] = userNuevo;
                        arrPass[i] = passNuevo;
                        System.out.println(ANSI_GREEN + "Usuario registrado." + ANSI_RESET);

                        userExiste = false;
                        break;
                    }
                    if (userNuevo.equals(arrNombre[i])) {
                        userExiste = true;
                        break;
                    }
                }

                if (userExiste) {
                    System.err.println("El usuario ya está registrado");
                    System.err.println("Volviendo al menú principal.");
                }
            }
            //Por alguna razón el menú 3 sí lo conseguí por mi cuenta antes de realizar el 2 al menos cinco veces. Lo cual no entiendo pero weno...
            if (menuChoose == 3) {
                //En este menú nos daremos de baja

                for (int i = 0; i < arrNombre.length; i++) {
                    System.out.println("Introduce el usuario que quieres dar de baja: ");
                    userBaja = scan.next();
                    //Recorremos el array  para buscar qué usuario está registrado.
                    //cuando encuentra el usuario lo deja en null
                    if (userBaja.equals(arrNombre[i])) {
                        System.out.println(ANSI_YELLOW + "Este usuario se eliminará." + ANSI_RESET);
                        arrNombre[i] = null;
                        arrPass[i] = null;
                        break;
                    } else {
                        System.err.println("Usuario no encontrado.");
                    }
                }


            }


        } while (menuChoose != 0);
    }
}