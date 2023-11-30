package dia27_1Teoria.clases;

public class Cuadrado {
    int coordX;
    int coordY;

    int lado;

    public double area;

    public Cuadrado(int coordX, int coordY, int lado) {
        this.coordX = coordX;
        this.coordY = coordY;

        if (lado > 0) {
            this.lado = lado;
        } else {
            this.lado = 0;
        }
        this.area = this.lado * this.lado;
    }

    /*
    Método que compare dos cuadrados y nos diga cuál es el mayor
     */

    public void compararCuadrados(Cuadrado c) {

        if (this.lado > c.lado) {
            System.out.println("El cuadrado con lado " + this.lado + " es el mayor.");
        } else {
            System.out.println("El cuadrado con lado " + c.lado + " es el mayor.");
        }


    }

}
