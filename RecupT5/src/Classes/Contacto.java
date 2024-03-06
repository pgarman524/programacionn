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
        setNombre(nombre);
        setTelefono(telefono);
    }

    // --------------------------------------------------------------------------
    //                              GETTER AND SETTERS
    // --------------------------------------------------------------------------


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        /** if (getNombre().equalsIgnoreCase(this.nombre)) {
         System.out.println("Nombre existente, elija otro");
         } else {
         this.nombre = nombre;
         System.out.println("Usuario registrado.");
         }**/

        this.nombre = nombre;

    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        //Expresiones regulares para que puedas settear el num de tlf de dos maneras:
        //123456789  ||  123 45 67 89
        Pattern pattern = Pattern.compile("^\\d{3}\\s?(\\d{2}\\s?){2}\\d{2}$");
        Pattern pattern2 = Pattern.compile("^\\d{9}$");

        Matcher matcher = pattern.matcher(telefono);
        Matcher matcher1 = pattern2.matcher(telefono);

        if (matcher.find() || matcher1.find()) {
            this.telefono = telefono;

        } else {
            System.err.println("El teléfono ya se encuentra registrado o no existe");
        }
    }


}

