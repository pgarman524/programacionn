import java.util.Scanner;

public class ActividadClase2 {
    public static void main(String[] args) {
        /*
           2. Hacer un programa que pida un número (positivo) y muestre los valores pares
           desde 0 hasta ese número.
            Si el usuario no introduce el número correcto, el programa debe seguir pidiéndole
            que introduzca un número correcto.

            EJEMPLO
            ->Programa pide un número
            ->Usuario introduce -5
            ->Programa muestra -> Error, pruebe  de nuevo
            ->Usuario introduce -10
            ->Programa muestra -> Error, pruebe  de nuevo
            ->Usuario introduce 4
            ->Programa muestra -> 0,2,4
            FIN
         */

        Scanner scan = new Scanner(System.in);
        int num;

        /*
        while ((num < 0) ==(num != 0)){
            System.out.println("introduce un número positivo");
            num =scan.nextInt();
        } if ((num > 0) == (num != 0)){  for ()
          */

        do {
            System.out.println("Introduce un número positivo:  ");
            num =scan.nextInt();
        } while (num <  0); //Se queda dando vueltas mientras num es negativo

        //Como sabemos que vamos a mostrar desde 0 hasta num  -> usamos FOR

        for(int i = 0; i <= num; i ++){
            if (i%2 == 0){
                System.out.println("Número par: "+i);
            }
        }
    }
}


