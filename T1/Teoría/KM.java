import java.util.Scanner;
          /*Nombre:  Pablo
        Apellidos: García Mangana
        Actividad: conversor KM a MI
                 */

public class KM {
    public static void main (String[] args) {

        System.out.printf("Introduzca los km al conversor en millas: "); //pedimos los km

        Scanner scan = new Scanner(System.in);
        double km = scan.nextDouble();  //creamos "km" que será el número introducido a la máquina

        double mi = km / 1.6;   //Para conseguir el valor en millas desde un km hay que dividir y NO multiplicar

        System.out.printf("En millas serían: " + mi);  //mostramos el resultado de la operación



    }
}
