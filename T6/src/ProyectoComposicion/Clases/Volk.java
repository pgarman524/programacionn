package ProyectoComposicion.Clases;

import java.util.ArrayList;

public class Volk {
    private String nombre;
    private ArrayList<Wagen> coches;

    public Volk(String nombre, ArrayList<Wagen> coches) {
        this.nombre = nombre;
        this.coches = coches;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Wagen> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Wagen> coches) {
        this.coches = coches;
    }
}
