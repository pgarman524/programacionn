package ProyectoBanco.Clases.impl;

import ProyectoBanco.Clases.api.Cuenta;

public class CuentaAhorro extends CuentaBancaria {
    private static double saldoMinimo = 10;



    @Override
    public void calcularIntereses() {
        if (this.saldo < saldoMinimo) {
            this.saldo = saldo * (INTERES_ANUAL_BASICO / 2) + saldo;
        } else {
            this.saldo = saldo * (INTERES_ANUAL_BASICO * 2) + saldo;
        }
    }

    public CuentaAhorro(String iban, double saldo, double saldoMinimo) {
        super(iban, saldo);
        CuentaAhorro.saldoMinimo = saldoMinimo;
    }
    /**
     * ^extens CuentaBancaria$
     *  - saldoMinimo:double=10
     *
     *  + calcularIntereses()
     */


}
