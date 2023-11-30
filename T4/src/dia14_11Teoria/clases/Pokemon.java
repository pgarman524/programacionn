package dia14_11Teoria.clases;

import java.util.Scanner;

public class Pokemon {
//Variable global
    static  String pikachu = "pikachu";

    public static void main(String[] args) {
        System.out.println("Introduce un pokemon: ");
        Scanner scan= new Scanner(System.in);

        String pokemonDeUsuario = scan.next();

        boolean pokemonEsValido = false;
        pokemonEsValido = esValido(pokemonDeUsuario);

        if (pokemonEsValido){
            System.out.println("Pika");
        }else {
            System.out.println("no pika-pi");
        }
    }


    /**
     * Método que comprueba si el pokemon es pikachu o no
     * @param pokemon
     * @return
     */
    public static boolean esValido(String pokemon) {

        if(pokemon.equalsIgnoreCase(pikachu)){
            return true;
        }else {
            return false;
        }

    }

    public static void setRaichu(String nombreRaichu){
        pikachu = nombreRaichu;


    }
}
