import java.util.Scanner;

public class proyectoUt2_CafeteriaUbricoffe {
    //Esto son unas pijerías que he buscado en internet para cambiar el color de las letras de la consola
    //Con esto puedo cambiar el color de las letras de la consola a amarillo
    public static final String ANSI_YELLOW = "\u001B[33m";
    //Lo mismo pero en verde.
    public static final String ANSI_GREEN = "\u001B[32m";
    //Con esta devuelvo el color de las letras del código a su estado original
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {

        //En este proyecto realizaremos un menú de registro y una tienda de cafés en consola usando java

        //Primero deberemos declarar quién será el usuario y su contraseña con Strings
        String user = "Pablo";
        String pass = "1234palito";

        //Estos strings son los que deberemos insertar correctamente para que el programa nos permita acceder
        // Importaremos el Scanner de java para poder introducir la contraseña y el usuario
        // por la persona que ejecute el programa

        Scanner scan = new Scanner(System.in);
        String userDado;
        String passDado;



        System.out.println(ANSI_GREEN+"Bienvenido a Ubricoffee"+ANSI_RESET);
        System.out.println(" ");

        do {
            System.out.println("Hola, introduzca su usuario: ");
            userDado = scan.next();

            System.out.println("Introduzca su contraseña: ");
            passDado = scan.next();

            if (!userDado.equals(user) || !passDado.equals(pass)) {
                System.err.println("Acceso denegado.");
                System.out.println("");

                //Creamos un submenú para que pregunte si queremos volver a introducir el pass

                System.out.println("¿Quiere volver a intentarlo?");
                System.out.println("1. Sí");
                System.out.println("2. No");

                int si;
                //si decimos sí, entonces vuelve a repetir. Sino, sale del programa.
                si = scan.nextInt();
                if (si == 1){

                }else {
                    //break nos ayuda a que salga de este bucle
                    break;}

            }
            //El bucle se repetirá hasta que de la contraseña correcta usando estos equals
            // podemos comparar si los Strings introducidos son los mismo que se piden
        } while (!userDado.equals(user) || !passDado.equals(pass));

        //Con esta declaración nos aseguramos que este mensaje SOLO aparezca cuando
        //las credenciales del usuario son las correctas
        if (userDado.equals(user) && passDado.equals(pass)){
            System.out.println(ANSI_GREEN+"¡Hola "+user+"!"+ANSI_RESET );} else {

            System.out.println("Adios.");
            //Con esta línea de código puedo acabar con el programa sin que pase por los demás menús
            //La he buscado por internet ya que necesitaba que cuando decidiesemos no volver a repetir
            //el usuario, el programa no saltara a la siguiente línea de código.
            System.exit(0);
        }

        //Ahora que estamos logueados tenemos que crear una tienda

        //Primero creamos las variables
        //necesitamos una variable para usar el scan, en este caso será elegirProducto
        int elegirProducto;

        //ahora creamos las variables de los productos de la tienda.
        //Todas tienen por defecto el valor 0, para así cada vez que seleccionemos una se añada una cantidad al registro
        int cafe = 0;
        int agua = 0;
        int tostada = 0;
        int colacao = 0;
        //Añadimos un double que será el precio total a pagar tras realizar el pedido.
        double pagar = 0;

        //Este int nos servirá para preguntar si quiere revisar la compra para añadir algún producto más
        // al finalizarla o si quiere acabar y pasar a pagar.
        int si2;


        //Primer bucle do while para el menú de si seguir comprando o salir del programa
        do {


            //Segundo bucle. Para hacer este menú hemos de crear un bucle do while, para que al menos este se repita una vez
            // y que cada vez que introduzcamos un producto a comprar nos vuelva a preguntar si queremos algo más

            do {
                System.out.println("Aquí está la lista de productos:");
                System.out.println("- 1.Café    1€");
                System.out.println("- 2. Agua    0,50€");
                System.out.println("- 3.Tostada     1,20€");
                System.out.println("- 4.Colacao     1€");
                System.out.println("- 0.Salir");

                //Con este scan elegimos el producto de la lista
                System.out.println("Elige el producto");
                elegirProducto = scan.nextInt();

                //creamos una serie de if, una por cada producto
                if (elegirProducto == 1) {
                    System.out.println("Ha seleccionado café.");
                    //Con esta declaración añadimos +1 a nuestra variable cada vez que la elijamos
                    cafe++;

                    //Con esta declaración añadimos en la variable pagar el precio de, en este caso el café
                    //la varaible pagar se deberá repetir en cada if, por lo que usamos += para que se guarde
                    //la suma del precio de los productos en esta variable
                    pagar += 1;
                }
                if (elegirProducto == 2) {
                    System.out.println("Ha  elegido  agua.");
                    agua++;
                    pagar += 0.5;
                }
                if (elegirProducto == 3) {
                    System.out.println("Ha elegido tostada.");
                    tostada++;
                    pagar += 1.2;
                }
                if (elegirProducto == 4) {
                    System.out.println("Ha elegido Colacao.");
                    colacao++;
                    pagar += 1;
                }
                //Ahora creamos la lista de la compra, para eso crearemos un "sout"
                System.out.println("Tiene en su carrito: " + cafe + " de café, " + tostada + " de tostadas, " + agua + " de agua y" + colacao + " de colacao.");

                //Ahora que hemos terminado de comprar, debemos crear un mensaje que comunique al usuario
                // cuánto ha de pagar por todo lo que lleva pedido.
                System.out.println("Pago estimado: " + pagar);


            } while (elegirProducto != 0); //El DO WHILE se repetirá hasta que introduzcamos 0 en elegirProducto

            System.out.println("¿Quiere pedir algo más?");
            System.out.println("1. Sí");
            System.out.println("2. No");


            //si decimos sí, entonces vuelve a repetir. Sino, sale del programa.
            si2 = scan.nextInt();
            if (si2 == 1){

            }else {
                //break nos ayuda a que salga de este bucle
                break;}

        } while (si2 != 0);

        System.out.println(ANSI_YELLOW+"Total a pagar: "+ANSI_RESET + pagar);
        System.out.println(" ");
        //Y con esto me despido de esta práctica.
        System.out.println("Muchas gracias por su visita. Vuelva otro día "+user+".");}

}

/*
    PREGUNTAS

    a.¿Cuál es la parte más compleja a la hora de trabajar con bucles?
    Primero saber para qué quieres usarlo, dependiendo qué sea puede ser útil uno u otro.
    La otra parte compleja es saber cuándo acaban y controlarlo correctamente. Que no se cree un bucle infinito.

    b.¿Por qué has decidido utilizar un bucle while en lugar de un do-while? (O al revés si así ha sido el caso)
    Necesitaba que los menús apareciesen al menos una vez mientras se cumpliese lo establecido. Por eso seleccioné DO WHILE

    c.¿Cuál ha sido la parte más compleja de la práctica?
     Entender el funcionamiento de los bucles y el por qué fallan. También sumar los productos y que estos no se reseteen
    al principio de cada bucle, sino que mantengan los valores que se le van añadiendo cada vez que se repoduce el bucle.
 */
