package dia17_11Teoria.clases;

public class Pokemon {

    public String nombre, tipo;

    public double vida, fuerza;

    //Método constructor

    public Pokemon(String nombreNuevo,  String tipoNuevo,  double vidaNueva, double fuerzaNueva){
    this.nombre = nombreNuevo;
    this.tipo = tipoNuevo;
    this.vida =  vidaNueva;
    this.fuerza = fuerzaNueva;

    }

    public void recibirAtaque(Pokemon pokemonAtacante) {
        this.vida = this.vida - pokemonAtacante.fuerza * pokedex.checkEfectividad(pokemonAtacante.tipo, this.tipo);


    }
}
