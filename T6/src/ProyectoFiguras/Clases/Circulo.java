package ProyectoFiguras.Clases;

import ProyectoFiguras.iFIguras2D;

public class Circulo implements iFIguras2D {
    private double radio;
    private double diametro;
    private double area;
    private double perimetro;

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    @Override
    public double perimetro() {
        this.perimetro = 3.14 * diametro;
        return perimetro;
    }

    @Override
    public double area() {
        this.area = 3.14 * Math.pow(radio, 2);

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
        System.out.println(" - Base: " + radio + "\n - Altura: " + diametro + "\n - Área: " + area + "\n - Perimetro: " + perimetro + "\n - Escala: ");

    }
}
