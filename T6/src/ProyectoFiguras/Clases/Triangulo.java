package ProyectoFiguras.Clases;

import ProyectoFiguras.iFIguras2D;

public class Triangulo implements iFIguras2D {
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        this.perimetro = base * altura;
        return perimetro;

    }

    @Override
    public double area() {
        this.area = base * altura;
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
        System.out.println(" - Base: " + base + "\n - Altura: " + altura + "\n - Área: " + area + "\n - Perimetro: " + perimetro + "\n - Escala: ");

    }
}
