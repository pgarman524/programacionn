/**package otraCLase;
import java.util.Scanner;
import java.util.Scanner;

public class encriptadorPass {

    /**
     * Escribir un método que reciba por parámetro un string y devuelva la misma contraseña ya encriptada, haciedno uso del cifrado cesar
     *
     *
     * Es decir -> Num letra ASCII +  3 de cada chara
     *
     * pass = "pass123
     * pass retornada = "sdvv456"
     *
     *
     * Consejor:
     * - Crea una variable auxiliar para amacenar la nueva password.
     * - Recorrer el string y tratar cada uno de los ccarácteres individualmente
     * - Sumar 3 a cada carácter -> obtenemos un nuevo carácter.
     * - Concatenar dicho carácter nuevo a la variable auxiliar.
     *
     * Formato del método:
     * public static String
     */

   /** public static String codeCesar  (String passwd) {
        Scanner scan = new Scanner(System.in);
        String passDado;

        passDado= scan.next();

        for (int i=0; i <= passwd.length()-1; i++){
            //Cojo cada uno de los carácters
            char letraACifrar = passwd.charAt(i);

            //Obtengo el valor numérico del caracter.
            int valorNumerico = Character.getNumericValue(i);

            //Sumo 3 a ese valor
            valorNumerico = valorNumerico + 3;

            //Paso de numero a caracter
            char letraCifrada = (char) valorNumerico;

            //Concateno  el caracter a la passCifrada
            passCifrada = pasCifrada + letraCifrada;
        }
    }
}

*/