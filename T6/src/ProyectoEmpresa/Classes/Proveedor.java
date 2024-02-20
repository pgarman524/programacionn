package ProyectoEmpresa.Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Proveedor {
    private String nombre;
    private String dni;
    private String apellidos;
    private String direccion;
    private int ventas;

    // Constructor

    public Proveedor(String nombre, String dni, String apellidos, String direccion, int ventas) {
        this.nombre = nombre;
        setDni(dni);
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.ventas = ventas;
    }


    // Getters y setters


    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                ", dni: " + dni + "\n" +
                ", apellidos: " + apellidos + "\n" +
                ", direccion: " + direccion + "\n" +
                ", ventas: " + ventas + "\n";
    }

    @Override
    public boolean equals(Object prov) {
        Proveedor proveedor = (Proveedor) prov;
        return this.dni.equalsIgnoreCase(proveedor.dni);
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        String regex = "\\d{8}[a-zA-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);

        if (matcher.matches()) {
            this.dni = dni;
        } else {
            // Handle the case where the dni does not match the regex
            System.out.println("No es un dni.");
        }

    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
}
