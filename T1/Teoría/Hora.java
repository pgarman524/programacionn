import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {
    /*Nombre:  Pablo
        Apellidos: García Mangana
        Actividad: Cuál de los tres números es el mayor?
                 */

        //Fácil, creamos Scanner de la hora, los min y los seg.
        System.out.println("Introduce la hora del día: ");
        Scanner scan = new Scanner(System.in);
        int hora = scan.nextInt();

        if ((hora > 24)==(hora>=0)){
            System.out.println("Esa hora no es correcta.");
            /* Esto no lo hemos dado aún pero he buscado en internet cómo terminar una acción.
             Así, si alguien introduce un dato mal; esta terminará.
             Quería hacer un bucle pero no lo hemos dado y tiene pinta ser complejo.
             Así que de momento, con esto valdrá.*/
            System. exit(0);
        }
        System.out.println("Introduce los minutos: ");
        Scanner scan2 = new Scanner(System.in);
        int min = scan2.nextInt();

        if ((min > 60)==(min>=0)){
            System.out.println("Esos min no son correctos.");
            System. exit(0);
        }

        System.out.println("Introduce los segundos: ");
        Scanner scan3 = new Scanner(System.in);
        int seg = scan3.nextInt();

        if ((seg > 60)==(seg>=0)){
            System.out.println("Esos seg no son correctos.");
            System. exit(0);
        }

        //Creamos un nuevo dato en el que se sume 1 seg a los segundos indicados.
        int seg2 = seg + 1;
        System.out.println("Gracias, aquí tiene la hora un segundo después: "+hora +"h" +  min +"m"+ seg2+"s");

    }
}