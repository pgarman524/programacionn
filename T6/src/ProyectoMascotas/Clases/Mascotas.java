package ProyectoMascotas.Clases;

import java.time.LocalDate;

public class Mascotas {
    protected String nombre;
    protected int edad;
    protected boolean estado;
    protected LocalDate fechaNacimiento = LocalDate.of(1989, 12, 19);


    public Mascotas(String nombre, int edad, boolean estado, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }


    public void muestra() {
        if (this.estado) {
            System.out.println("Hola mi nombre es " + this.nombre + " y tengo " + this.edad + " años.");
            if (fechaNacimiento.getMonthValue() == LocalDate.now().getMonthValue() && fechaNacimiento.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
                System.out.println("Y  es mi cumpleaños.");
            }
        } else {
            System.out.printf("f en chat");
        }

    }

    public void cumpleanios() {

        if (fechaNacimiento.getMonthValue() == LocalDate.now().getMonthValue() && fechaNacimiento.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
            edad++;
        }

    }

    public void morir() {
        this.estado = !this.estado;
    }


    public boolean habla() {
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
