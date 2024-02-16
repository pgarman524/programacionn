package ProyectoHerencia.Clases;

public class Empleado extends PersonaH {

    private double sueldo;

    public Empleado(String nombre, String dni, String sexo, double sueldo) {
        super(nombre, dni, sexo);

        this.sueldo = sueldo;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void presentacion() {

        System.out.println("__________________________________");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Sueldo: " + this.sueldo);
        System.out.println("__________________________________");
    }
}
