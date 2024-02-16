package ProyectoMascotas.Clases;

import ProyectoMascotas.Clases.Mascotas;

import java.time.LocalDate;

public class Gato extends Mascotas {
    private String color;
    private boolean peloLargo;


    public Gato(String nombre, int edad, boolean estado, LocalDate fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    public void muestra() {
        super.muestra();
        System.out.println("El color del gato es: "+ this.color);
        if (this.peloLargo){
            System.out.println("Tengo pelo largo.");
        } else {
            System.out.println("No tengo pelo largo");
        }

    }

    public boolean habla() {
        return false;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
}
