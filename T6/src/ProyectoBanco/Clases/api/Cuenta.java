package ProyectoBanco.Clases.api;

public interface Cuenta {
    public boolean ingresoDinero(double cantidadIngresar);

    public boolean retirarDinero(double cantidadARetirar);

    public boolean traspasarDinero(Cuenta otraCuenta, double cantidadTraspaso);

    public void calcularIntereses();


}
