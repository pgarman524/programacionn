package ProyectoFiguras;

import ProyectoFiguras.Clases.Circulo;
import ProyectoFiguras.Clases.Cuadrado;
import ProyectoFiguras.Clases.Rectangulo;
import ProyectoFiguras.Clases.Triangulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<iFIguras2D> figuras = new ArrayList<iFIguras2D>();


        Circulo cir1 = new Circulo(22,33);
        Cuadrado cua1 = new Cuadrado(4);
        Rectangulo rec1 = new Rectangulo(12,20);
        Triangulo tri1 = new Triangulo(5,6);

        System.out.println("");

        cir1.imprimir();
        cua1.imprimir();
        rec1.imprimir();
        tri1.imprimir();

        System.out.println("");

        cir1.escalar(2);
        cua1.escalar(2);
        rec1.escalar(2);
        tri1.escalar(2);

        System.out.println("");

        cir1.imprimir();
        cua1.imprimir();
        rec1.imprimir();
        tri1.imprimir();


        System.out.println("");


        cir1.escalar(0.1);
        cua1.escalar(0.1);
        rec1.escalar(0.1);
        tri1.escalar(0.1);


        System.out.println("");


        cir1.imprimir();
        cua1.imprimir();
        rec1.imprimir();
        tri1.imprimir();


    }
}
