package ProyectoPokemon;

import ProyectoPokemon.Clases.Ataque;
import ProyectoPokemon.Clases.Pokemon;
import ProyectoPokemon.Clases.Tipo;

public class Main {

    public static void main(String[] args) {
        Tipo electrico = new Tipo("Electrico");
        Ataque rayo = new Ataque("Rayo",electrico,15);

        Pokemon pikachu = new Pokemon("Pikachu", 100, electrico);

        pikachu.ataques = new Ataque[4];
        pikachu.ataques[0] = rayo;

    }
}
