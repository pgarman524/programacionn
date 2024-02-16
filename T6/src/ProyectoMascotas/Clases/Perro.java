

package ProyectoMascotas.Clases;

import java.time.LocalDate;

public class Perro extends Mascotas {
    private String raza;
    private boolean pulgas;


    public Perro(String nombre, int edad, boolean estado, LocalDate fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public void muestra() {
        //Para llamar a los métodos de la clase padre usas super
        super.muestra();
        System.out.println("Soy un perro de raza: " + this.raza);
        if (this.pulgas){
            System.out.println("Tengo pulgas.");
        } else {
            System.out.println("No tengo pulgas");
        }

    }

    public boolean habla() {
        return false;

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
}
