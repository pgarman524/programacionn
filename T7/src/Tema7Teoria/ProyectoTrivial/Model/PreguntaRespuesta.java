package Tema7Teoria.ProyectoTrivial.Model;

import java.util.Objects;

public class PreguntaRespuesta {
    private String pregunta;
    private String respuesta;

    // Constructor

    public PreguntaRespuesta(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }


    // GetterSetters

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreguntaRespuesta that = (PreguntaRespuesta) o;
        return Objects.equals(pregunta, that.pregunta) && Objects.equals(respuesta, that.respuesta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pregunta, respuesta);
    }

    @Override
    public String toString() {
        return "PreguntaRespuesta{" +
                "pregunta='" + pregunta + '\'' +
                ", respuesta='" + respuesta + '\'' +
                '}';
    }
}
