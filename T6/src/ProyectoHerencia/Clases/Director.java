package ProyectoHerencia.Clases;

public class Director extends Jefe{
    private String asistente;

    public Director(String nombre, String dni, String sexo,String despacho, String asistente) {
        super(nombre, dni, sexo, despacho);
        this.asistente = asistente;
    }
}
