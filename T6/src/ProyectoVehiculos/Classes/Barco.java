package ProyectoVehiculos.Classes;

public class Barco extends Acuatico{
    private boolean motor;



// ----------------------------------------------------------
//                      CONSTRUCTOR
// ----------------------------------------------------------

    public Barco(String matricula, String modelo, String eslora, boolean motor) {
        super(matricula, modelo, eslora);
        this.motor = motor;
    }






// ----------------------------------------------------------
//                      GETTER & SETTERS
// ----------------------------------------------------------


    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }
}
