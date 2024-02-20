package ProyectoVehiculos.Classes;

public class Moto extends Terrestre{
    private String color;

// ----------------------------------------------------------
//                      CONSTRUCTOR
// ----------------------------------------------------------


    public Moto(String matricula, String modelo, int ruedas, String color) {
        super(matricula, modelo, ruedas);
        this.color = color;
    }

// ----------------------------------------------------------
//                      GETTER & SETTERS
// ----------------------------------------------------------


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
