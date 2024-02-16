package ProyectoFiguras.Clases;

import ProyectoFiguras.iFIguras2D;

public class Rectangulo implements iFIguras2D {
    private double alto;
    private double ancho;
    private double area;
    private double perimetro;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double perimetro() {
        this.perimetro = alto + 2 * ancho;
        return perimetro;
    }

    @Override
    public double area() {
        this.area = alto * ancho;
        return area;
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0) {
            this.area = area * escala;
        } else {
            System.out.println("Introduzca un número mayor a 0");
        }
    }

    @Override
    public void imprimir() {
        System.out.println(" - Alto: " + alto + "\n - Ancho: " + ancho + "\n - Área: " + area + "\n - Perimetro: " + perimetro + "\n - Escala: ");
    }
}
