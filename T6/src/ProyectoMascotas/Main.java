package ProyectoMascotas;

import ProyectoMascotas.Clases.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Perro oreo = new Perro("Oreo", 8, true, LocalDate.now(), "Schauzer", false);
        Perro goku = new Perro("Goku", 6, true, LocalDate.now(), "Jorshire", false);
        Gato pulga = new Gato("Pulga", 4, true, LocalDate.now(), "Cobrizo", true);
        Loro pirri = new Loro("Pirri", 12, true, LocalDate.now(), true, true, "Sudán", true);


        Inventario invet = new Inventario();

        invet.anadirMascota(oreo);
        invet.anadirMascota(goku);
        invet.anadirMascota(pulga);
        invet.anadirMascota(pirri);

        invet.mostrarDatosAnimales();

        invet.eliminarMascota("Pulga");
        System.out.println("");
        invet.mostrarDatosAnimales();
        System.out.println("----------------------------");
        invet.mostrarTipoYNombreAnimal();
        System.out.println("----------------------------");


    }
}

