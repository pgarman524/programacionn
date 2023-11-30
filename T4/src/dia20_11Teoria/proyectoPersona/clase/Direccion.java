package dia20_11Teoria.proyectoPersona.clase;

import dia20_11Teoria.proyectoPersona.utiles.LocalidadValidator;

import java.lang.reflect.Constructor;

public class Direccion {
//Atributos de clase

    public String calle;
    public int numero;
    public String cp;
    public int puerta;
    public int piso;
    public String localidad;
    public String provincia;


    //Constructor de clase
    public Direccion(String calle, int numero, String cp, int puerta, int piso, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.puerta = puerta;
        this.piso = piso;

        LocalidadValidator  l = new LocalidadValidator();
        boolean cpYProvinciaCorrectos = l.checkProvincia(provincia,cp);

        if (cpYProvinciaCorrectos){

        }


        this.cp = cp;
        this.localidad = localidad;
        this.provincia = provincia;

    }


}
