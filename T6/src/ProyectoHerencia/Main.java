package ProyectoHerencia;

import ProyectoHerencia.Clases.Cliente;
import ProyectoHerencia.Clases.Empleado;
import ProyectoHerencia.Clases.PersonaH;

public class Main {
    public static void main(String[] args) {
        //Creamos un cliente
        Cliente cl = new Cliente("Paco", "12345678D", "Macho", "1", true);
        cl.presentacion();

        //Creamos un empleado
        Empleado mp = new Empleado("Ana", "87654321S", "Hembra", 2370.00);
        mp.presentacion();

        //Creamos una personaH
        PersonaH per = new PersonaH("Manolo","3214567S","M");
        
    }
}
