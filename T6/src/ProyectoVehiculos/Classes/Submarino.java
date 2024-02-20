package ProyectoVehiculos.Classes;

public class Submarino extends Acuatico{
    private double profundidad;


// ----------------------------------------------------------
//                      CONSTRUCTOR
// ----------------------------------------------------------

    public Submarino(String matricula, String modelo, String eslora, double profundidad) {
        super(matricula, modelo, eslora);
        this.profundidad = profundidad;
    }


// ----------------------------------------------------------
//                      GETTER & SETTERS
// ----------------------------------------------------------


    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
}
