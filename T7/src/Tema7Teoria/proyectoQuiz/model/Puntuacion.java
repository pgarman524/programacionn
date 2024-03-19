package Tema7Teoria.proyectoQuiz.model;



import java.time.LocalDateTime;
import java.util.Objects;

public class Puntuacion implements Comparable<Puntuacion> {

    private LocalDateTime fecha;
    private int puntuacion;

    public Puntuacion(int puntuacion) {
        this.fecha = LocalDateTime.now();
        setPuntuacion(puntuacion);
    }

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

        if(puntuacion >= 0) {
            this.puntuacion = puntuacion;
        }
    }

    @Override
    public String toString() {
        return "Puntuacion{" +
                "fecha=" + fecha +
                ", puntuacion=" + puntuacion +
                '}';
    }


    @Override
    public int compareTo( Puntuacion o) {

        if(this.puntuacion > o.puntuacion) {
            return 1;
        } else if(this.puntuacion < o.puntuacion) {
            return -1;
        } else {
            return 0;
        }
    }
}
