package ProyectoAstros;

import ProyectoAstros.Clases.Planeta;
import ProyectoAstros.Clases.Satelite;

public class Main {
    public static void main(String[] args) {
        Planeta tierra = new Planeta(6738.4, 23.56, 5975, 17.18, "Tierra", 150000000, 365.04, true);
        Planeta jupiter = new Planeta(71492,45.300,  1000000,-121.15,"Júpiter",750000000, 4330, true);


        Satelite luna = new Satelite(3474.8, 23.56, 7, -96, "Luna", 384400, 23.56);
        Satelite europa = new Satelite(3121,72.55,5, -163, "Europa", 664862, 23.56);


        tierra.muestra();
        System.out.println("");
        luna.muestra();

        if (tierra.esMayor(luna)) {
            System.out.println("Eslo");
        } else {
            System.out.println("Esno");
        }

        System.out.println("");
        if (tierra.esMayor(jupiter)) {
            System.out.println("Eslo");
        } else {
            System.out.println("Esno");
        }

        System.out.println("");
        if (luna.esMayor(europa)) {
            System.out.println("Eslo");
        } else {
            System.out.println("Esno");
        }



    }
}
