package Tema7Teoria.ProyectoAirBnB.Model;

import java.util.Objects;

public class Alojamiento implements Comparable<Alojamiento> {

    private String id;
    private String name;

    private Propietario propietario;
    private double precio;


    //Constructor de los dos, getter and setters, Equals, toString


    //Constructor

    public Alojamiento(String id, String name, Propietario propietario, double precio) {
        this.id = id;
        this.name = name;
        this.propietario = propietario;
        setPrecio(precio);
    }

    // METODOS

    @Override
    public String toString() {
        return "Alojamiento{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", propietario='" + propietario + '\'' + ", precio=" + precio + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Alojamiento) {
            Alojamiento a = (Alojamiento) obj;
            return a.getId().equalsIgnoreCase(this.getId());
        }
        return false;

    }

    @Override
    public int compareTo(Alojamiento o) {
        if (this.getPrecio() > o.getPrecio()) {
            return 1;
        } else if (this.getPrecio() < o.getPrecio()) {
            return -1;
        } else {
            return 0;
        }
    }


    //GETTER AND SETTERS


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (precio > 0) {

            this.precio = precio;
        }

    }

    public double getPrecio(Alojamiento alojamiento) {
        return precio;
    }
}
