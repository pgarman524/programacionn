package ProyectoAstros.Clases;

public class Satelite extends Astro {
    private double distanciaPlaneta;
    private double orbitaPlanetaria;

    public Satelite(double radioEcuatorial, double rotacion, long masa, double temperaturaMedia, String nombre, double distanciaPlaneta, double orbitaPlanetaria) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, nombre);

        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    @Override
    public void muestra(){
        System.out.println("Nombre del satélite: "+this.nombre);
        System.out.println("Con un radio de: "+ this.radioEcuatorial);
        System.out.println("Y una temperatura de: "+this.temperaturaMedia);
        System.out.println("Distancia del planeta: "+this.distanciaPlaneta);
        System.out.println("La órbita planetaria es de: "+ this.orbitaPlanetaria);


    }
}