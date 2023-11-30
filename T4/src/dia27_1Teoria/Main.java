package dia27_1Teoria;

import dia27_1Teoria.clases.Circulo;
import dia27_1Teoria.clases.Cuadrado;
import dia27_1Teoria.clases.Punto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        //Ahora vamos a crear dos objetos de tipo Punto

        Punto punto1 = new Punto(0,0);
        Punto punto2 = new Punto(5,0);

        punto1.nombre = "Punto en 24,45";
        punto2.nombre = "Punto en 5,6";


        Cuadrado point1 = new Cuadrado(0,0,5);

        //Area circulo

        Circulo circulo1 = new Circulo(0.0);
        Circulo  circulo2 = new Circulo(7.0);

        circulo1.mostrarInfo();
        circulo2.mostrarInfo();


        //Comparar cuadrados
        Cuadrado cuad1 = new Cuadrado(5,5,15);
        Cuadrado  cuad2 = new Cuadrado(6,6,12);
        cuad1.compararCuadrados(cuad2);

        //Comparar círculos
        Circulo circ1 = new Circulo(18);
        Circulo circ2 = new Circulo(15);
        circ1.compararCirculo(circ2);

        //Comparar puntos A
        double distanciaEntrePuntos = punto1.distanciaPuntos(punto2);


        //Comparar puntos B
        Punto punt1  = new Punto(25,26);
        Punto punt2 = new Punto(30,35);
        punt1.distanciaPuntos(punt2);





    }


}
