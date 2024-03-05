package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contacto {

    private String nombre;
    private String telefono;

    // --------------------------------------------------------------------------
    //                              CONSTRUCTOR
    // --------------------------------------------------------------------------

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // --------------------------------------------------------------------------
    //                              MÉTODOS
    // --------------------------------------------------------------------------


    // --------------------------------------------------------------------------
    //                              GETTER AND SETTERS
    // --------------------------------------------------------------------------


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {

        Pattern pattern = Pattern.compile("^\\d{3}\\s?(\\d{2}\\s?){2}\\d{2}$");
        Pattern pattern2 = Pattern.compile("^\\d{9}$");

        Matcher matcher = pattern.matcher(telefono);
        Matcher matcher1 = pattern2.matcher(telefono);

        if (matcher.find() && matcher1.find()) {
            if (getTelefono().equals(this.telefono)) {
                System.out.println("El teléfono ya se encuentra registrado.");
            } else {
                this.telefono = telefono;
            }
        }


    }
}
