package ProyectoVehiculos.Classes;

public class Coche extends Terrestre{
    private boolean aireAcondicionado;

// ----------------------------------------------------------
//                      CONSTRUCTOR
// ----------------------------------------------------------


    public Coche(String matricula, String modelo, int ruedas, boolean aireAcondicionado) {
        super(matricula, modelo, ruedas);
        this.aireAcondicionado = aireAcondicionado;
    }

// ----------------------------------------------------------
//                          MÉTODOS
// ----------------------------------------------------------

    // NONE



// ----------------------------------------------------------
//                      GETTER & SETTERS
// ----------------------------------------------------------


    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
}
