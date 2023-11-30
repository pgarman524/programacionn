package dia17_11Teoria.clases;

import java.util.Scanner;

public class pokedex {
    /**
     * private pokemones: String[]
     * public checkPokemon recibe -> (pokemon:String) devuelve -> boolean
     * publiccheckEfectividad(tipo A: string, tipo B: string) : double
     * SI es efectivo -> devuelve 1.5;
     * SI es normal -> devuelve 1;
     * SI es pocoefectivo -> devuelve 0.5;
     */


    private static String[] pokemones = {"bulbasur", "charmander", "squirtle"};

    //Métodos de clase

    //Método checkPokemon

    //Método checkEfectividad


    //Método para checkear si el pokemon introducido existe en el array
    public static boolean checkPokemon(String pokemon) {
        boolean pokemonExiste = false;
        for (int i = 0; i < pokemones.length; i++) {

            if (pokemon.equals(pokemones[i])) {
                pokemonExiste = true;
            }
        }
        return pokemonExiste;
    }

    public static double checkEfectividad(String tipoAtk, String tipoDef) {
        double resultado = 0.0;
        if (tipoAtk.equals("fuego")) {
            if (tipoDef.equals("planta")) {
                return 1.5;

            } else if (tipoDef.equals("agua")) {
                return 0.5;
            } else {
                return 0.5;
            }

        } else if (tipoAtk.equals("agua")) {
            if (tipoDef.equals("fuego")) {
                return 1.5;

            } else if (tipoDef.equals("planta")) {
                return 0.5;
            } else {
                return 1;
            }
        } else if (tipoAtk.equals("agua")) {
            if (tipoDef == "fuego") {
                return 1.5;

            } else if (tipoDef.equals("planta")) {
                return 0.5;
            } else {
                return 1;
            }


        }
        return resultado;
    }
}