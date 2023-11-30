import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        /**
         * Crea  un programa que cree un array con 100 números reales aleatorios
         * entre 0.0 y 1.0, utilizando Math.random(), luego le pida al usuario
         * un valor real R. Por último, mostrará cuántos valores del array son igual
         * o superiores a R
         */

        double[] arrDoub = new double[100];

        for (int i = 0; i <= arrDoub.length-1; i++){

            arrDoub[i] = Math.random();

        } for (int i = 0; i <= arrDoub.length-1; i++){

            System.out.print(arrDoub[i]+", ");
        }

        //Leer por teclado un num real.
        double numReal = 0.0;
        System.out.println("Dime un numero real: ");
        Scanner scan = new Scanner(System.in);

        numReal = scan.nextDouble();

        //Declaramos una variable que va a servir para Contar cuántos números
        //del array son mayores a numReal
        int cantidad = 0;
        for (int i = 0; i <= arrDoub.length-1; i++){
            if (arrDoub[i]>= numReal){
                cantidad ++;
            }


        }
        System.out.println("El número de elementos mayores que "+numReal+" es "+cantidad);


    }
}
