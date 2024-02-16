package ProyectoComida.Classes.impl;

import ProyectoComida.Classes.api.Comida;

public class Lentejas implements Comida {

    private boolean lasQuieres = true;
    public Lentejas(boolean lasQuieres){
        this.lasQuieres  = lasQuieres;
    }

    @Override
    public int addNutricion() {

        if (lasQuieres){
            System.out.println("La vida es una Lenteha o la tomas o la dehas");
            return 25;
        }else {
            System.out.println("Las dejas");
            return 0;
        }
    }
}
