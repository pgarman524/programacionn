package ProyectoComida.Classes.impl;

import ProyectoComida.Classes.api.Comida;

public class Salchicha implements Comida {


    @Override
    public int addNutricion() {
        System.out.println("Salchipapa");
        return 10;
    }
}
