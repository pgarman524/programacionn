import java.util.Scanner;

public class ActividadClase3 {
    public static void main(String[] args) {

        /*
        Todos hacemos el programa pero el compañero lo tiene que probar
        Yo veo un ordenador -> O
        Yo veo un ratón -> R
        Yo veo un rotulador -> R

         */

        /*
        Hacer un programa donde el programador sea el que ve algo
        Ese algo -> lo declara como char cosa = '(letra inicial)'
        EL programa dice:
        ->Veo veo
        ->Qué ves?
        ->Una cosita que empieza por la letra ...

        Un compañero nuestro debe inntroducir esa letra
        si acierta ... Bien has Ganado
        si no acierta ... Mal, inténtalo de nuevo
        Scanner scan = new Scanner(System.in);
        char letra = scan.next().charAt(0);
         */
        Scanner scan = new Scanner(System.in);
        char adivinar = scan.next().charAt(0);


        while (adivinar != 'P' || adivinar != 'p'){
            System.out.println("No NO No, esa no es");
            adivinar = scan.next().charAt(0);
        } if (adivinar == 'P' || adivinar  == 'p'){
            System.out.println("¡¡BIEEEN!!");
        }

    }
}
