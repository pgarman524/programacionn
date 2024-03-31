package AnalisisAirbnb.Model;

import Tema7Teoria.ProyectoAirBnB.Model.Alojamiento;

import java.util.Objects;

public class Propietario {
    private String host_id = "";
    private String host_name = "";

// ----------------------------------- CONSTRUCTOR ---------------------------------------

    public Propietario(String host_id, String host_name) {
        this.host_id = host_id;
        this.host_name = host_name;
    }

// ----------------------------------- MÉTODOS ---------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propietario that = (Propietario) o;
        return Objects.equals(host_id, that.host_id) && Objects.equals(host_name, that.host_name);
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "host_id='" + host_id + '\'' +
                ", host_name='" + host_name + '\'' +
                '}';
    }


    public int compareTo(Propietario o) {
        if (this.getHost_id().equalsIgnoreCase(o.getHost_id())) {
            return 1;
        } else if (this.getHost_id().equalsIgnoreCase(o.getHost_id())) {
            return -1;
        } else {
            return 0;
        }
    }

// ----------------------------------- GETTER AND SETTERS ---------------------------------------


    public String getHost_id() {
        return host_id;
    }

    public void setHost_id(String host_id) {
        this.host_id = host_id;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }
}
