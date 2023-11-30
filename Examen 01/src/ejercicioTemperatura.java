import java.util.Scanner;

/*
    Nombre: Pablo
    Apellidos: García Mangana
    Ejercicio número 4
 */
public class ejercicioTemperatura {
    public static void main(String[] args) {

        //comienza el main

    //llamamos al scanner para poder introducir números más adelante
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, introduzca la  temperatura:");

        int temperatura =scan.nextInt(); //declaramos la temperatura con int al ser números enteros junto al scanner


        //Comenzamos la estructura if. Hemos añadido if else para que no nos muestren todos los resultados
        if (temperatura <= 10){
            System.out.println("El clima es Frío.");
        } else if ((temperatura >= 10) && (temperatura  < 20)){
            System.out.println("El clima es Templado.");
        } else if ((temperatura > 20)  &&  (temperatura < 30)){
            System.out.println("El clima es Caluroso.");
        }else if (temperatura > 30){
            System.out.println("El clima es Tropical.");
        }

        //acaban los if
    }
    //acaba el main
}
