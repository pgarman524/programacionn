package ProyectoPokemon.Utils;

import ProyectoPokemon.Clases.Tipo;

/**
 * Clase utils de pokedex
 * @author Pablo
 */
public class Pokedex {

    //Comparar con .equalsignorecase
    /**
     * Listado de los tipos aceptados en el juego
     */

    private String[] tiposAceptados = {"Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psíquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador"};


    //************************************
    //*******CONSTRUCTOR DE CLASE*********
    //************************************


    //************************************
    //********METODOS DE CLASE************
    //************************************

    /**
     *
     * @param tipoPokemon Nobre del tipo que se intenta comparar
     * @return true - si el tipo existe. false - si el tipo no existe
     */
    public static boolean checkTipoExiste(String tipoPokemon) {
        if (tipoPokemon.equalsIgnoreCase("Acero")){

        }
    //Comprueba si el tipo existe dentro del array de tipoAceptados
    return false;
    }

    /**
     *
     * @param tipoAtaque Tipo que realiza el ataque
     * @param tipoRecibeAtaque tipo al que el ataque es afectado
     * @return (double) modificador del danio del ataque (1.5 muy efectivo, 1 normal, 0,5 poco efectivo, 0 inmune)
     */
    public static double checkEfectividad(Tipo tipoAtaque, Tipo tipoRecibeAtaque){
        //Comprueba la efectividad del ataque entre dos tipos
        //Devuelve un modificador de danio (1.5,1.6, 0.5 o 0)
        return 0;

    }

}
