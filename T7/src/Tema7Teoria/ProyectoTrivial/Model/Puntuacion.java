package Tema7Teoria.ProyectoTrivial.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Puntuacion implements Comparable<Puntuacion> {
    private LocalDateTime fecha;
    private int puntuacion;

    // Constructor


    public Puntuacion(LocalDateTime fecha, int puntuacion) {
        this.fecha = fecha;
        this.puntuacion = puntuacion;
    }

    //Getter and Setters
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Puntuacion that = (Puntuacion) o;
        return puntuacion == that.puntuacion && Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, puntuacion);
    }

    @Override
    public String toString() {
        return "Puntuacion{" +
                "fecha=" + fecha +
                ", puntuacion=" + puntuacion +
                '}';
    }


    @Override
    public int compareTo(Puntuacion o) {
        if (this.puntuacion > o.puntuacion) {
            return 1;
        } else if (this.puntuacion < o.puntuacion) {
            return -1;
        } else {
            return 0;
        }
    }
}
