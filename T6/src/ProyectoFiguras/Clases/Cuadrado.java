package ProyectoFiguras.Clases;

import ProyectoFiguras.iFIguras2D;

public class Cuadrado implements iFIguras2D {
    private double lado;
    private double area;
    private double perimetro;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {

        this.perimetro = this.lado * 4;
        return perimetro;
    }

    @Override
    public double area() {
        this.area = this.lado * lado;
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
        System.out.println(" - Lado: " + lado + "\n - Área: " + area + "\n - Perimetro: " + perimetro + "\n - Escala: ");
    }
}
