package ProyectoComida.Classes.impl;

import ProyectoComida.Classes.api.Regañasion;

public class ShutDownPc implements Regañasion {

    @Override
    public int reduceEnergia() {
        return -145;
    }
}
