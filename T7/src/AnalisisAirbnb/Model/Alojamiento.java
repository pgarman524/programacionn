package AnalisisAirbnb.Model;

import java.util.Objects;

public class Alojamiento {
    private String id ="";
    private String nombre =  "";
    private Propietario propietario;
    private double precio = 0;


// ----------------------------------- CONSTRUCTOR ---------------------------------------

    public Alojamiento(String id, String nombre, Propietario propietario, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.propietario = propietario;
        setPrecio(precio);
    }


// ----------------------------------- MÉTODOS ---------------------------------------

    @Override
    public String toString() {
        return "Alojamiento: " +
                "id: " + id + '\'' +
                ", nombre: " + nombre + '\'' +
                ", propietario: " + propietario +
                ", precio: " + precio
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alojamiento that = (Alojamiento) o;
        return Double.compare(precio, that.precio) == 0 && Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre) && Objects.equals(propietario, that.propietario);
    }


    public int compareTo(Alojamiento o) {
        if (this.getPrecio() > o.getPrecio()) {
            return 1;
        } else if (this.getPrecio() < o.getPrecio()) {
            return -1;
        } else {
            return 0;
        }
    }

// ----------------------------------- GETTER AND SETTERS ---------------------------------------


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (this.precio < 0){

        }else {
            this.precio = precio;
        }
    }
}
