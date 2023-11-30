import java.util.Scanner;

public class actividad01 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int suma = 0;
        int n;
        System.out.println("Introduzca un número para calcular la sumatoria de los números: ");
        n = scan.nextInt();

    //Utilizamos el bucle for porque sabemos el número de vueltas que vamos a dar. Siendo n las vueltas
        for (int num = 0; num < n; num++){
            suma = suma + num;
            //  suma = 0 + 0
            //  suma = 0 + 1
            //  suma = 1 + 2
            //  suma = 3 + 3
            //  suma = 6 + 4
            //  suma = 10 + 5
            //  ... ... ... ...

            System.out.println(suma);
        }

        }


    }

