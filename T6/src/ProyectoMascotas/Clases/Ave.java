package ProyectoMascotas.Clases;

import java.time.LocalDate;

public class Ave extends Mascotas{
    protected boolean pico;
    protected boolean vuela;


    public Ave(String nombre, int edad, boolean estado, LocalDate fechaNacimiento, boolean pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }


    public boolean volar() {
        if (vuela) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPico() {
        return pico;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
}
