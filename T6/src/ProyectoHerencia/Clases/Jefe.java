package ProyectoHerencia.Clases;

public class Jefe extends PersonaH{
    private String despacho;


    public Jefe(String nombre, String dni, String sexo, String despacho) {
        super(nombre, dni, sexo);
        this.despacho = despacho;
    }
}
