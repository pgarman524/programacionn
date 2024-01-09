package repaso01;

import java.util.Random;

public class Punto {

    //Atributos  de clase
    private int x;
    private int y;

    //Constructor de clase
    public Punto (int x, int y){
        this.x = x;
        this.y = y;
    }


    //Metodos de clase
    public static Punto creaPuntoAleatorio(){


        int aleatorioX = new Random().nextInt(-100, 100);
        int aleatorioY = new Random().nextInt(-100, 100);

        return new Punto(aleatorioX, aleatorioY);
    }


    public void imprime (){

        System.out.println("("+this.x+","+this.y+")");
    }

    public void setXY (int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public void desplaza (int dx, int dy){
    this.x = this.x + dx;
    this.y = this.y + dy;
    }



    public int distancia (Punto p){

        int part1 = (int) Math.pow(p.x -this.x, 2);
        int part2 = (int) Math.pow(p.y -this.y, 2);

        int raiz = (int) Math.sqrt(part1 + part2);

        return raiz;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



}
