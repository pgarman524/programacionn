package proyectoUser22222.model;

import java.util.Objects;

public class Butaca {
    private int fila;
    private int asiento;
    private String idUser;

    //                               CONSTRUCTOR

    public Butaca(int fila, int asiento, String idUser) {
        this.fila = fila;
        this.asiento = asiento;
        this.idUser = idUser;
    }

    //                              GETTER & SETTERS

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }


    @Override
    public boolean equals(Object o) {
        if (o instanceof Butaca) {
            Butaca b = (Butaca) o;
            return b.getFila() == this.fila && b.getAsiento() == this.asiento;
            
        } else {
            return false;
        }


    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, asiento, idUser);
    }

    @Override
    public String toString() {

        //Debe devolver de forma -> fila:asiento:iduser
        return fila + ":" + asiento + ":" + idUser;
    }
}
