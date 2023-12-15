package ProyectoPokemon.Clases;

import static ProyectoPokemon.Utils.Pokedex.checkEfectividad;

public class Pokemon {
    /*
    nombre: String
    lore: String
    tipo: Tipo
    vida: double
    ataques: Ataque[]
     */

    public String nombre;
    public String lore;
    public Tipo tipo;

    public double vida;
    public Ataque[] ataques;


    public Pokemon(String nombre, double vida, Tipo tipo){
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
    }

    public void recibirAtk (Ataque a){
//* checkEfectividad(tipo, tipo, Pokemon.this)

        this.vida = this.vida - a.danio * checkEfectividad(a.tipo, this.tipo, Pokemon.this);
    }

    public void curarVida (Ataque a){
        this.vida = this.vida + a.danio;

    }

}