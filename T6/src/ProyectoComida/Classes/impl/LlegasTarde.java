package ProyectoComida.Classes.impl;

import ProyectoComida.Classes.api.Regañasion;

public class LlegasTarde implements Regañasion {

    @Override
    public int reduceEnergia() {
        return -15;

    }
}
