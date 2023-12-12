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

        Tipo planta = new Tipo("Planta");

        Tipo fantasma = new Tipo("Fantasma");

        Tipo siniestro = new Tipo("Siniestro");

        Tipo agua = new Tipo("Agua");

        Tipo roca = new Tipo("Roca");

        Tipo hada = new Tipo("Hada");




        //*******************************************
        //***********Ataques de pokemon**************
        //*******************************************
        //PIKACHU
        Ataque impactrueno = new Ataque("Impactrueno", electrico,40);
        Ataque ataqueRapido = new Ataque("Ataque Rápido", normal, 40);
        Ataque trueno = new Ataque("Trueno", electrico, 80);
        Ataque atizar = new Ataque("Atizar", normal, 110);

        //SUNFLORA
        Ataque hojaAfilada = new Ataque("Hoja Afilada", planta, 55);
        Ataque recurrente = new Ataque("Recurrente", planta, 10);
        Ataque danzaPetalo = new Ataque("Danza Pétalo", planta, 70);
        Ataque rayoSolar = new Ataque("Rayo Solar", planta, 110);

        //HAUNTER
        Ataque puñoSombra = new Ataque("Puño Sombra", fantasma, 60);
        Ataque golpeBajo = new Ataque("Golpe Bajo", siniestro, 70);
        Ataque vendetta = new Ataque("Vendetta", siniestro,50);
        Ataque bolaSombra = new Ataque("Bola Sombra", fantasma, 80);

        //VAPOREON
        Ataque pistolaAgua = new Ataque("Pistola Agua", agua, 40);
        Ataque acuaAro = new Ataque("Acua Aro", agua, 0);
        Ataque ultimaBaza = new Ataque("Ultima Baza", normal, 140);

        //TOGEPI
        Ataque poderPasado = new Ataque("Poder Pasado", roca, 60);


        //WAILORD
        Ataque ataquePesado = new Ataque("Ataque Pesado", normal, 150);
        Ataque desenrrollar = new Ataque("Desenrrollar", roca, 30);
        Ataque hidropulso = new Ataque("Hidropulso", agua, 60);

        //*******************************************
        //***********Constructor Pokemon*************
        //*******************************************

        Pokemon pikachu = new Pokemon("Pikachu", 250, electrico);
        Pokemon sunflora = new Pokemon("Sunflora", 250, planta);
        Pokemon haunter = new Pokemon("Haunter",250, fantasma);
        Pokemon vaporeon = new Pokemon("Vaporeon", 250, agua);
        Pokemon togepi = new Pokemon("Togepi", 250, hada);
        Pokemon wailord = new Pokemon("Wailord", 350, agua);

        //*******************************************
        //*************Ataques equipados*************
        //*******************************************



        pikachu.ataques = new Ataque[4];
        pikachu.ataques[0] = impactrueno;
        pikachu.ataques[1] = ataqueRapido;
        pikachu.ataques[2] = trueno;
        pikachu.ataques[3] = atizar;


        sunflora.ataques = new Ataque[4];
        sunflora.ataques[0] = hojaAfilada;
        sunflora.ataques[1] = recurrente;
        sunflora.ataques[2] = danzaPetalo;
        sunflora.ataques[3] = rayoSolar;


        haunter.ataques = new Ataque[4];
        haunter.ataques[0] = puñoSombra;
        haunter.ataques[1] = golpeBajo;
        haunter.ataques[2] = vendetta;
        haunter.ataques[3] = bolaSombra;


        vaporeon.ataques = new Ataque[4];
        vaporeon.ataques[0] = ataqueRapido;
        vaporeon.ataques[1] = pistolaAgua;
        vaporeon.ataques[2] = acuaAro;
        vaporeon.ataques[3] = ultimaBaza;


        togepi.ataques = new Ataque[4];
        togepi.ataques[0] = ultimaBaza;
        togepi.ataques[1] = poderPasado;


        wailord.ataques = new Ataque[4];
        wailord.ataques[0] = ataquePesado;
        wailord.ataques[1] = desenrrollar;
        wailord.ataques[2] = hidropulso;
        wailord.ataques[3] = pistolaAgua;


        /**
         *  1. Crear un menú para elegir los pokemons
         *  2. Pokemon 1A lucha contra 1B
         *  3. Si pokemon muere, sale siguiente pokemon
         *  4. Cuando gane el entrenador se acaba el programa.
         */
    }
}
