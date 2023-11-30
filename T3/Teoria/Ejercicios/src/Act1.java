import java.util.Scanner;

public class Act1 {

    /**
     * Act1. Pedir 10 valores reales, almacenarlos en un array,
     * y mostrar la suma de todos los valores
     *
     */
    public static void main(String[] args) {

        double sumatoria = 0.0;
        double[] arrDeDoubles = new double[10];

        Scanner scan = new Scanner(System.in);
    //Primer for para rellenar todas las posiciones del array
        for (int i = 0; i <= arrDeDoubles.length-1; i++){

            System.out.print("Introduzca un valor para el array: ");
            //Introduzco en cada posición del array lo que me indique el user

            arrDeDoubles[i] = scan.nextDouble();
        }
        //Segundo para sumar todos los elementos.

        for (int i = 0; i <= arrDeDoubles.length-1; i++){
                sumatoria = sumatoria + arrDeDoubles[i];



        }
        System.out.println("La  suma de todos los elementos es: "+sumatoria);

    }
}
