package ProyectoBanco.Clases.impl;

public abstract class CuentaBancaria {
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    /**
     * - iban:String
     * - saldo: double
     * - interesAnunalBasico:double = 0.02;
     * ------------
     * + getters y setters
     * + ingresoDinero(importe: double):boolean /true bien false mal
     * + retirarDinero(importe: double):boolean        "  "
     * - anadir(importe: double)
     * + traspasarDinero(importe:double, cuentaDestino:CuentaBancaria):boolean
     * + calcularIntereses()
     */




    protected String iban;
    protected double saldo;

    protected static final double INTERES_ANUAL_BASICO = 0.02;


    //Al ser abstracto, este método se implementará de distintas formas en las demás clases.
    public abstract void calcularIntereses();



    public boolean traspasarDinero (double importe, CuentaBancaria cuentaDestino){

        //Si el slado es mayor que 0
        //añadimos importe al saldo de la cuenta destino
        //Luego retiramos el saldo de la cuenta padre
        if (importe > 0) {
            anadir(importe + cuentaDestino.saldo);
            anadir(importe - this.saldo);
        return true;
        }else {
            System.err.println("Error");
            return false;

        }

    }

    private void anadir(double importe){
        if (importe > 0) {
            this.saldo = saldo + importe;
        }
    }


    public boolean ingresoDinero(double importe) {
        if (importe > 0) {
            anadir(importe);
            return true;
        } else {
            System.out.println("Ingreso negativo.");
            return false;
        }
    }

    public boolean retirarDinero(double importe) {
        if (importe < -100) {
            anadir(-importe);
            return true;
        } else {
            System.out.println("Retirada imposible");
            return false;
        }
    }



}
