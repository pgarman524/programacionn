package ProyectoPokemon;

import ProyectoPokemon.Clases.Ataque;
import ProyectoPokemon.Clases.Pokemon;
import ProyectoPokemon.Clases.Tipo;
import ProyectoPokemon.Utils.Pokedex;

import java.util.Scanner;

public class Main {
    /**
     * -> Crear 6 pokemon
     * -Crear todos los ataques
     * -Crear todos los tipos
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
        Ataque impactrueno = new Ataque("Impactrueno", electrico, 40);
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
        Ataque vendetta = new Ataque("Vendetta", siniestro, 50);
        Ataque bolaSombra = new Ataque("Bola Sombra", fantasma, 80);

        //VAPOREON
        Ataque pistolaAgua = new Ataque("Pistola Agua", agua, 40);
        Ataque acuaAro = new Ataque("Acua Aro", agua, 40);
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
        Pokemon haunter = new Pokemon("Haunter", 250, fantasma);
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
         *      -Crear array de entrenadaores
         *      -Rellenar esos arrays con los pokemons
         *  2. Pokemon 1A lucha contra 1B
         *  3. Si pokemon muere, sale siguiente pokemon
         *  4. Cuando gane el entrenador se acaba el programa.
         */

        Scanner scan = new Scanner(System.in);
        int elegirPokemon1;
        int elegirPokemon2;

        Pokemon entrenador1[] = new Pokemon[4];
        Pokemon entrenador2[] = new Pokemon[4];

        int pokemonTotales1 = 0;
        int pokemonTotales2 = 0;

        System.out.println("Ahora en la liga pokemon, nuestros entrenadores escogerán hasta 3 de estos pokemons.");
        System.out.println("Los pokemons a elegir son: " +
                "\n 1. Pikachu" +
                "\n 2. Sunflora" +
                "\n 3. Haunter" +
                "\n 4. Vaporeon" +
                "\n 5. Togepi" +
                "\n 6. Wailord");

        System.out.println("Ash ketchump elige sus pokemones:  ");
        do {


            elegirPokemon1 = scan.nextInt();

            switch (elegirPokemon1) {
                case 1:
                    for (int i = 0; i < entrenador1.length - 1; i++) {
                        if (entrenador1[i] == null) {
                            entrenador1[i] = pikachu;
                            pokemonTotales1++;
                            break;
                        }

                    }
                    break;

                case 2:
                    for (int i = 0; i < entrenador1.length - 1; i++) {
                        if (entrenador1[i] == null) {
                            entrenador1[i] = sunflora;
                            pokemonTotales1++;
                            break;
                        }

                    }
                    break;
                case 3:
                    for (int i = 0; i < entrenador1.length - 1; i++) {
                        if (entrenador1[i] == null) {
                            entrenador1[i] = haunter;
                            pokemonTotales1++;
                            break;
                        }

                    }
                    break;
                case 4:
                    for (int i = 0; i < entrenador1.length - 1; i++) {
                        if (entrenador1[i] == null) {
                            entrenador1[i] = vaporeon;
                            pokemonTotales1++;
                            break;
                        }

                    }
                    break;
                case 5:
                    for (int i = 0; i < entrenador1.length - 1; i++) {
                        if (entrenador1[i] == null) {
                            entrenador1[i] = togepi;
                            pokemonTotales1++;
                            break;
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < entrenador1.length - 1; i++) {
                        if (entrenador1[i] == null) {
                            entrenador1[i] = wailord;
                            pokemonTotales1++;
                            break;
                        }
                    }
                    break;


            }
        } while (pokemonTotales1 < 3);

        System.out.println("Gary Oak elige sus pokemones:  ");
        do {


            elegirPokemon2 = scan.nextInt();

            switch (elegirPokemon2) {
                case 1:
                    for (int i = 0; i < entrenador2.length - 1; i++) {
                        if (entrenador2[i] == null) {
                            entrenador2[i] = pikachu;
                            pokemonTotales2++;
                            break;
                        }

                    }
                    break;

                case 2:
                    for (int i = 0; i < entrenador2.length - 1; i++) {
                        if (entrenador2[i] == null) {
                            entrenador2[i] = sunflora;
                            pokemonTotales2++;
                            break;
                        }

                    }
                    break;
                case 3:
                    for (int i = 0; i < entrenador2.length - 1; i++) {
                        if (entrenador2[i] == null) {
                            entrenador2[i] = haunter;
                            pokemonTotales2++;
                            break;
                        }

                    }
                    break;
                case 4:
                    for (int i = 0; i < entrenador2.length - 1; i++) {
                        if (entrenador2[i] == null) {
                            entrenador2[i] = vaporeon;
                            pokemonTotales2++;
                            break;
                        }

                    }
                    break;
                case 5:
                    for (int i = 0; i < entrenador2.length - 1; i++) {
                        if (entrenador2[i] == null) {
                            entrenador2[i] = togepi;
                            pokemonTotales2++;
                            break;
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < entrenador2.length - 1; i++) {
                        if (entrenador2[i] == null) {
                            entrenador2[i] = wailord;
                            pokemonTotales2++;
                            break;
                        }
                    }
                    break;


            }
        } while (pokemonTotales2 < 3);


        /**
         * Para el combate necesito:
         *      que los pokemon aparezcan en combate
         *      que cada entrenador pueda elegir el ataque que quiero que haga ese pokemon
         *      y que luego le toque al otro entrenador
         *      si un pokemon cae a 0 pasa al siguiente pokemon del entrenador
         *      cuando un entrenador se queda sin pokemons. El entrenador pierde
         *
         */

        //Aquí comienza la creación del combate Pokemon
        int elegirAtaqueAsh;
        int elegirAtaqueGary;


        do {
            System.out.println(entrenador1[0].nombre + " debe elegir qué usar: ");
            System.out.println("\n 1. " + entrenador1[0].ataques[0].nombre);
            System.out.println("\n 2. " + entrenador1[0].ataques[1].nombre);
            System.out.println("\n 3. " + entrenador1[0].ataques[2].nombre);
            System.out.println("\n 4. " + entrenador1[0].ataques[3].nombre);


            elegirAtaqueAsh = scan.nextInt();

            switch (elegirAtaqueAsh) {
                case 1:
                    entrenador2[0].recibirAtk(entrenador1[0].ataques[0]);
                    System.out.println("El pokemon de Gary, " + entrenador2[0].nombre + " tiene ahora " + entrenador2[0].vida);
                    break;
                case 2:
                    entrenador2[0].recibirAtk(entrenador1[0].ataques[1]);
                    System.out.println("El pokemon de Gary, " + entrenador2[0].nombre + " tiene ahora " + entrenador2[0].vida);
                    break;
                case 3:
                    entrenador2[0].recibirAtk(entrenador1[0].ataques[2]);
                    System.out.println("El pokemon de Gary, " + entrenador2[0].nombre + " tiene ahora " + entrenador2[0].vida);
                    break;
                case 4:
                    entrenador2[0].recibirAtk(entrenador1[0].ataques[3]);
                    System.out.println("El pokemon de Gary, " + entrenador2[0].nombre + " tiene ahora " + entrenador2[0].vida);
                    break;
            }


            //***********


            System.out.println(entrenador2[0].nombre + " debe elegir qué usar: ");
            System.out.println("\n 1. " + entrenador2[0].ataques[0].nombre);
            System.out.println("\n 2. " + entrenador2[0].ataques[1].nombre);
            System.out.println("\n 3. " + entrenador2[0].ataques[2].nombre);
            System.out.println("\n 4. " + entrenador2[0].ataques[3].nombre);


            elegirAtaqueGary = scan.nextInt();

            switch (elegirAtaqueAsh) {
                case 1:
                    entrenador1[0].recibirAtk(entrenador1[0].ataques[0]);
                    System.out.println("El pokemon de Gary, " + entrenador1[0].nombre + " tiene ahora " + entrenador1[0].vida);
                    break;
                case 2:
                    entrenador1[0].recibirAtk(entrenador1[0].ataques[1]);
                    System.out.println("El pokemon de Gary, " + entrenador1[0].nombre + " tiene ahora " + entrenador1[0].vida);
                    break;
                case 3:
                    entrenador1[0].recibirAtk(entrenador1[0].ataques[2]);
                    System.out.println("El pokemon de Gary, " + entrenador1[0].nombre + " tiene ahora " + entrenador1[0].vida);
                    break;
                case 4:
                    entrenador1[0].recibirAtk(entrenador1[0].ataques[3]);
                    System.out.println("El pokemon de Gary, " + entrenador1[0].nombre + " tiene ahora " + entrenador1[0].vida);
                    break;
            }


        } while (entrenador1[0].vida != 0 || entrenador2[0].vida != 0);
    }
}
