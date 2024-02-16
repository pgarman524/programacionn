package ProyectoMascotas.Clases;

import java.time.LocalDate;

public class Loro extends Ave {
    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, boolean estado, LocalDate fechaNacimiento, boolean pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public void muestra() {
        super.muestra();
        System.out.println("Mi origen es: " + this.origen);

    }

    public void saluda() {

    }

    @Override
    public boolean volar() {
        if (vuela) {
            return true;
        } else {
            return false;
        }
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
}
