package dia04_12.DAWBank.Clases;

public class CuentasBancarias {
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

        //FALTA por settear el iban del titular

    }


    //Metodos de clase

    /**
     * Clase para ingresar el dinero
     *
     * @param cantidadIngreso
     */
    public void ingresar(double cantidadIngreso) {
        //cantidad negativa
        if(cantidadIngreso < 0){
            System.err.println("La cantidad a ingresar es negativa");

        }
        else if (cantidadIngreso > 3000) {
            System.err.println("Cuidado, esa cantidad es mayor al permitido, vamos a contactar con Hacienda");
            this.saldo += cantidadIngreso;
        } else {
            System.out.println("Usted va a ingresar: " + cantidadIngreso);
            this.saldo += cantidadIngreso;
        }


    }

    /**
     * Clase para retirar el dinero
     *
     * @param cantidadARetirar
     */
    public void retirar(double cantidadARetirar) {

        if (saldo < -50) {
            System.err.println("Lo siento, no tiene suficiente dinero");
        } else if (saldo < 0) {
            System.out.println("Retirando su saldo.");
            saldo -= cantidadARetirar;
            System.err.println("Cuidado, su saldo es negativo. Saldo actual: " + saldo);
        } else {
            System.out.println("Retirando su saldo.");
            saldo -= cantidadARetirar;
        }

    }

    public static boolean comprobarIban (String iban) {
       if ( iban.length() >  22 ){
           System.err.println("El iban es erroneo");
           return false;
       } else if (iban.length() < 22) {
           
       }
        return true;
    }





    /**
     * Clase para mostar los datos de la cuenta
     */
    public void mostrarDatosCuenta() {
        mostrarIban();
        mostrarSaldo();
        mostrarTitular();
        mostrarMovimientos();

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
        System.out.println(this.saldo);
    }

    /**
     * Clase para mostrar los movimientos
     */

    public void mostrarMovimientos() {
        for (int i = 0; i < movimientos.length; i++) {
            System.out.println(movimientos[i]);


        }
    }
}
