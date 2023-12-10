package Clases;

public class CuentasBancarias {
    //Colores para la consola que sino es muy aburrido
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_RESET = "\u001B[0m";


    private String iban;

    private double saldo;
    private String titular;

    public String[] movimientos;

    /**
     * Clase constructora de cuenta bancaria
     *
     * @param iban
     * @param titular
     */
    public CuentasBancarias(String iban, String titular) {
        this.saldo = 0.0;
        this.movimientos = new String[100];
        this.iban = iban;
        this.titular = titular;


    }


    //Metodos de clase

    /**
     * Clase para ingresar el dinero
     *
     * @param cantidadIngreso
     */
    public void ingresar(double cantidadIngreso) {

        //Aquí pondría la pregunta pero la he pasado al main porque sino aparece después del scan


        //Como la cantidad es negativa, no sumamos el saldo a la cuenta. Así engañamos al cliente haciendo pensar que esto es más complejo de lo que es
        if (cantidadIngreso < 0) {
            System.err.println("La cantidad a ingresar es negativa");

        } else if (cantidadIngreso > 3000) {
            System.err.println("Cuidado, esa cantidad es mayor al permitido, vamos a contactar con Hacienda");
            this.saldo += cantidadIngreso;

            //Esta fórmula la usaremos en todos los momentos que hagamos una transacción bancaria para registrar el movimiento en la clase registroMovimiento.
            //Como es un array, usamos el for para recorrerlo de principio a fin.
            //luego creamos un if que nos transforme los huecos null en la transacción que hemos dicho que registre. Así si el hueco no es null no lo sobreescribe.

            for (int i = 0; i < movimientos.length; i++) {
                if (movimientos[i] == null) {
                    movimientos[i] = ANSI_GREEN + "Su transacción ha sido de + " + cantidadIngreso + ANSI_RESET;

                    //En esta parte probé a usar: exit, que no funcionaba. Break sí funcionaba pero registraba todos los i null a un solo registro y por alguna razón al usar return a secas funcionó correctamente.

                    return;
                }
            }

        } else {
            System.out.println("Usted va a ingresar: " + cantidadIngreso);
            this.saldo += cantidadIngreso;

            for (int i = 0; i < movimientos.length; i++) {
                if (movimientos[i] == null) {
                    movimientos[i] = ANSI_GREEN + "Su transacción ha sido de + " + cantidadIngreso + ANSI_RESET;
                    return;
                }
            }

        }

    }


    /**
     * Clase para retirar el dinero
     *
     * @param cantidadARetirar
     */
    public void retirar(double cantidadARetirar) {

        //Aquí pondría la pregunta pero la he pasado al main porque sino aparece después del scan

        //Preguntar a Diego por qué no funciona --> if (cantidadARetirar <= -50) <-- pero sí funciona esta forma
        if (saldo - cantidadARetirar <= -50) {
            System.err.println("Lo siento, no tiene suficiente dinero");
        } else if (saldo <= 0) {
            System.out.println("Retirando su saldo.");
            saldo -= cantidadARetirar;
            System.err.println("Cuidado, su saldo es negativo. Saldo actual: " + saldo);
            for (int i = 0; i < movimientos.length; i++) {
                if (movimientos[i] == null) {
                    movimientos[i] = ANSI_YELLOW + "Su transacción ha sido de - " + cantidadARetirar + ANSI_RESET;
                    return;
                }
            }
        } else {
            System.out.println("Retirando su saldo.");
            saldo -= cantidadARetirar;
            for (int i = 0; i < movimientos.length; i++) {
                if (movimientos[i] == null) {
                    movimientos[i] = ANSI_YELLOW + "Su transacción ha sido de - " + cantidadARetirar + ANSI_RESET;
                    return;
                }
            }
        }

    }


    //Creé una nueva clase para evitar errores.

    /**
     * Clase para terminar el programa si el iban es incorrecto
     *
     * @param iban
     * @return true
     */
    public static boolean finalizarSiIbanIncorrecto(String iban) {
        if (!comprobarIban(iban)) {

            System.exit(0);

        }
        return true;
    }

    /**
     * Clase para comprobar el iban si es correcto o no
     *
     * @param iban
     * @return true
     */
    public static boolean comprobarIban(String iban) {


        if (iban.length() < 24) {
            System.err.println("El iban es erroneo");
            return false;


            //Con substring transformamos desde la posición que queremos hasta la final que buscamos para así poder separarlo y analizar si este empieza con ES.
            // Si el banco fuese internacional, deberíammos añadir más opciones, ES,FR,EN...
        } else {
            if (iban.substring(0, 2).equals("ES")) {

                try {

                    //Volvemos a dividir el String para quedarnos solo con los números.
                    //Usando el for recorremos el String y con parseInt transformamos esos String en int.
                    // Si da error, el try catch lo recoge y nos dice que el IBAN es incorrecto ya que un iban solo tiene carácteres numéricos

                    String parteNumerica = iban.substring(2, 24);

                    // for que recorra el String parteNumerica
                    // cada i... haces un charAt(i) y compruebas que ese caracter es un numero
                    for (int i = 0; i <= parteNumerica.length() - 1; i++) {

                        Integer.parseInt(parteNumerica.charAt(i) + "");


                    }

                    return true;
                } catch (NumberFormatException ex) {

                    System.err.println("IBAN incorrecto.");
                    return false;
                }

            } else {
                System.err.println("IBAN incorrecto.");
                return false;
            }

        }

    }


    /**
     * Clase para mostar los datos de la cuenta
     */
    public void mostrarDatosCuenta() {
        mostrarTitular();
        mostrarIban();
        mostrarSaldo();


    }

    /**
     * Clase para mostrar el iban
     */
    public void mostrarIban() {

        System.out.println(this.iban);
    }

    /**
     * Clase para mostrar el titular
     */
    public void mostrarTitular() {

        System.out.println(this.titular);

    }

    /**
     * Clase para mostrar el saldo
     */

    public void mostrarSaldo() {

        if (this.saldo > 0) {
            System.out.println(ANSI_GREEN + this.saldo + ANSI_RESET);
        } else if (this.saldo < 0) {
            System.err.println(this.saldo);

        }


    }

    /**
     * Clase para mostrar los movimientos que no sean null
     */

    public void mostrarMovimientos() {
        for (int i = 0; i < movimientos.length; i++) {

            if (movimientos[i] != null) {


                System.out.println(movimientos[i]);
            }


        }
    }


}
