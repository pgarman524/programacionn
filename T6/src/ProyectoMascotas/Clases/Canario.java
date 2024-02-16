package ProyectoMascotas.Clases;

import java.time.LocalDate;

public class Canario extends Ave {

    private String color;
    private boolean canta;


    public Canario(String nombre, int edad, boolean estado, LocalDate fechaNacimiento, boolean pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    @Override
    public void muestra() {
        super.muestra();
        System.out.println("Mi origen es: " + this.color);

    }

    public void saluda() {

    }

    public boolean canta() {
        if (canta) {
            return true;
        } else {
            return false;
        }
    }

    public boolean volar() {
        if (vuela) {
            return true;
        } else {
            return false;
        }
    }
}
