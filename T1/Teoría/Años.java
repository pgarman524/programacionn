import java.util.Scanner;

public class Años {
    public static void main(String[] args) {
                  /*Nombre:  Pablo
        Apellidos: García Mangana
        Actividad: Mostrador de Generaciones
                 */
        Scanner scan = new Scanner(System.in);
        int edad = scan.nextInt();

        if  (edad > 2020){ //Para esta parte solo necesitamos añadir que la edad ha de ser mayor que 2020 ya que no hay otras generaciones registradas
            System.out.println("Esa generación no me la sé");
        }
        if ((edad >= 1997)==(edad<2009)){ //He intentado colocar if(x);if(x);... pero acaban mostrándose todos los resultados. Por ello he añadido ==(que fue algo que se puso de ejemplo en clase, así que dijo: voy a probar). Con esto hago que si es mayor de 1994 y menor de 2009 no salte el mensaje ya que los dos datos son iguales.
            System.out.println("Eres de la generación Zoomer");
        }
        if  ((edad >= 2010)==(edad <2020)){
            System.out.println("Eres de la generación Alfa");
        }
        if  ((edad >= 1981)==(edad <1996)){
            System.out.println("Eres de la generación Milenial");
        }
        if  ((edad >= 1965)==(edad <1980)){
            System.out.println("Eres de la generación X");
        }
        if  ((edad >= 1946)==(edad <1964)){
            System.out.println("Eres de la generación Boomer");
        }
        if  ((edad >= 1928)==(edad <1945)){
            System.out.println("Eres de la generación Grandiosa");
        }
        if  (edad <= 1927){ //Con esta solo hace falta una porque más antiguo que esto es casi probable que no sepas usar un pc o que estés muerto. Así qué más te da saber la generación.
            System.out.println("Eres todo un afortunado de seguir con vida");
        }

    }
}
