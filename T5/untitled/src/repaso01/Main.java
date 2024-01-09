package repaso01;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(3,4);
        Punto p2 = new Punto(6,2);
        p1.imprime();
        p1.setXY(4,5);
        p1.imprime();
        p1.desplaza(1,1);
        p1.imprime();

        System.out.println("La distancia es "+p1.distancia(p2));

        Punto p3 = Punto.creaPuntoAleatorio();
        p3.imprime();

    }
    }