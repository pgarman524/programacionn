package ProyectoBanco.Clases.impl;

import ProyectoBanco.Clases.api.Cuenta;

public class CuentaCorriente extends CuentaBancaria {

    @Override
    public void calcularIntereses() {
        this.saldo = saldo * INTERES_ANUAL_BASICO + saldo;

    }

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    /**
     *  ^extens CuentaBancaria$
     *  + calcularIntereses()
     *
     */


}
