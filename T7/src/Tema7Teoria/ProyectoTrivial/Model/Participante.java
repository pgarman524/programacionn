package Tema7Teoria.ProyectoTrivial.Model;

import java.util.ArrayList;
import java.util.Objects;

public class Participante {
    private String nombre;
    private String id;
    private ArrayList<Puntuacion> puntuacion;

    // Constructor

    public Participante(String nombre, String id, ArrayList<Puntuacion> puntuacion) {
        this.nombre = nombre;
        this.id = id;
        this.puntuacion = puntuacion;
    }

    // Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Puntuacion> getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(ArrayList<Puntuacion> puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(id, that.id) && Objects.equals(puntuacion, that.puntuacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id, puntuacion);
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
