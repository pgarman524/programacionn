package ProyectoPokemon;

import ProyectoPokemon.Clases.Ataque;
import ProyectoPokemon.Clases.Pokemon;
import ProyectoPokemon.Clases.Tipo;
import ProyectoPokemon.Utils.Pokedex;

public class Main {
    /**
     * -> Crear 6 pokemon
     *      -Crear todos los ataques
     *      -Crear todos los tipos
     * -> Eleccion Pokemons
     * -> Combate
     */
    public static void main(String[] args) {
        //*******************************************
        //***********Tipos de pokemon****************
        //*******************************************
        Tipo electrico = new Tipo("Electrico");

        Tipo normal = new Tipo("Normal");


        //*******************************************
        //***********Ataques de pokemon**************
        //*******************************************
        //PIKACHU
        Ataque impactrueno = new Ataque("Impactrueno", electrico,40);
        Ataque ataqueRapido = new Ataque("Ataque rápido", normal, 40);
        Ataque trueno = new Ataque("Trueno", electrico, 80);
        Ataque atizar = new Ataque("Atizar", normal, 110);


        Pokemon pikachu = new Pokemon("Pikachu", 100, electrico);


        pikachu.ataques = new Ataque[4];
        pikachu.ataques[0] = impactrueno;
        pikachu.ataques[1] = ataqueRapido;
        pikachu.ataques[2] = trueno;
        pikachu.ataques[3] = atizar;

    }
}
