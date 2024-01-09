package repaso02;

public class Persona {

    //final implica que no puede modificarse nunca más este dato una vez establecido
    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    private final static  int mayoriaEdad = 18;


    //Constructor
    public Persona(String dni, String nombre, String apellidos, int edad) {
        //check dni

        this.dni = dni;

        this.nombre = nombre;
        this.apellidos = apellidos;
        if (edad >= 0){
        this.edad = edad;
        }
    }


    //Metodos de clase
    public void imprime() {

        System.out.println("Dni: " + this.dni + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nedad: " + this.edad);

    }

    public boolean esMayorEdad() {

        //Esto es como if else pero simplificado
        return this.edad >= Persona.mayoriaEdad;
    }

    public boolean esJubilado() {
        return this.edad >= 65;
    }

    public int diferenciaEdad(Persona p) {

        return Math.abs(this.edad - p.edad);


    }




    //**********************************************

    //Getter & Setter
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
