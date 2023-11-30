package dia27_1Teoria.clases;

import java.awt.geom.Area;

public class Circulo {

    //Atributos de círculos:
    /*
    Radio
    Diametro
    Área


    Constructor personalizado al que se le pasa el radio únicamente
    El constructor calcula el área y el diametro.
     */

    //Método diferentes para calcular el área y el diametro.


    //Método para mostrar la información del círculo. Soy círculo con area "tal" y diametro "cual"

    double pi = Math.PI;
    double radio;
    double diametro;
    double area;

    public Circulo(double radio) {
        this.radio = radio;
        calcularArea();
        calcularDiametro();
    }

    public void calcularArea() {
        this.area = this.pi * (this.radio * this.radio);
    }

    public void calcularDiametro() {
        this.diametro = this.radio * 2;


    }

    public void mostrarInfo (){
        System.out.println("Soy un círculo con radio "+this.radio+ " ,area "+this.area+" y diametro "+this.diametro);
    }

    public void compararCirculo (Circulo c){
        if (this.radio > c.radio){
            System.out.println("El circulo con radio "+this.radio+" es el mayor.");
        }else {
            System.out.println("El círculo con radio "+c.radio+" es el mayor.");
        }

        /**
         * Mçetodo que calcule la distancia entre dos puntos.
         * El método devuelve un double (que es la distancia)
         * El método recibe por parámetros otro punto
         */
    }
}
