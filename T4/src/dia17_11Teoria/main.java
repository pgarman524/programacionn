package dia17_11Teoria;

import dia17_11Teoria.clases.pokedex;

public class main {
    /**
     * +main
     * declarar dos pokemons con nombre y dos vidas para cada unoy dos tipos para cada uno
     * pok1=charmander;
     * pok2=squirtle;
     *
     * vidapok1=50;
     * vidapok2=100;
     *
     * fuerzapok1=10;
     * fuerzapok2=15;
     *
     * tipoPok1 = fuego;
     * tipoPok2 = agua;
     */
    public static void main(String[] args) {
    String pok1 = "charmander";
    String pok2 = "squirtle";

    double vidaPok1 = 50;
    double vidaPok2 = 100;

    double fuerzaPok1 = 10;
    double fuerzaPok2 = 10;

    String tipoPok1 = "fuego";
    String tipoPok2 = "agua";

    if (pokedex.checkPokemon(pok1) && pokedex.checkPokemon(pok2)){



        double multiplicador = pokedex.checkEfectividad(tipoPok1,tipoPok2);

        vidaPok2 = vidaPok2 - fuerzaPok1 * multiplicador;

        System.out.println(pok2+" tiene ahora "+ vidaPok2);





    }





    }
}
