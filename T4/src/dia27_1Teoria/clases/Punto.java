package dia27_1Teoria.clases;

public class Punto {
    //atributos de clase
    public int coorX;
    public int coorY;

    public String nombre;

    //métodos de clase

    //constructores
    //Los constructores son públicos (el 99% de las veces) ->  Ese 0.1% es cuando se aplica el patrón singleton
    public Punto(int coorx, int coory) {
        this.coorX = coorx;
        this.coorY = coory;

    }


    //métodos

    public double distanciaPuntos(Punto c) {
        /*double coordenada = Math.sqrt(Math.pow(this.coorX - c.coorX, 2)) + Math.sqrt(Math.pow(this.coorY - c.coorY, 2));
        System.out.println(coordenada);
        return coordenada;
*/
        double distancia = 0.0;

        double resta1 = c.coorX - this.coorX;
        double resta2 = c.coorY - this.coorY;
        double cuadrado1 = Math.pow(resta1,2.0);
        double cuadrado2 = Math.pow(resta2,2.0);
        distancia = Math.sqrt(cuadrado1 + cuadrado2);
        System.out.println(distancia);
        return distancia;

    }


}
