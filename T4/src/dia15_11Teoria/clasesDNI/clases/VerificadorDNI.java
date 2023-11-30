package dia15_11Teoria.clasesDNI.clases;

public class VerificadorDNI {

    private static String dni = "";
    private static char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    /**
     * Método que comprueba que la última posición es una letra
     *
     * @param dni (String) dni a comprobar
     * @return true - es una letra false - no es una letra
     */
    public static boolean comprobarLetra(String dni) {
        char letraDNI = dni.charAt(dni.length() - 1);
        if ((letraDNI >= 65 && letraDNI <= 90) || (letraDNI >= 97 && letraDNI >= 122)) {
            return true;
        } else {
            return false;
        }

    }//FIN comprobar letra

    /**
     * Método que comprueba que la longitud de un dni dado es de 9
     *
     * @param dni (String)  dni a comprobar
     * @return true si longitud es de 9 / false si longitud no es de 9
     */
    public static boolean comprobarLongitud(String dni) {
        //Dice si es true o false si es igual o no igual a los datos dados
        return dni.length() == 9;
    }//FIN comprobar longitud


    /**
     * La letra asociada a un DNI se obtiene dividiendo el número del DNI entre 23 y el resto es codificado según ese resultado
     *
     * @param letraDNI (String) dnia a comprobar
     * @return true - es una letra false - no es una letra
     *
     */
    public static boolean comprobarLetraCorrecta(String dni) {
        //Obtener la letraDNI
        char letraDNI = dni.charAt(dni.length()-1);

        //Obtener la parte numérica
        String parteNumerica = dni.substring(0,8);
        int numero = Integer.parseInt(parteNumerica);

        int resto = numero % 23;

        if(letrasDNI[resto] == letraDNI) {
            return true;
        } else {
            return false;
        }





        }//FIN comprobar letra correcta


    /**
     * Comprueba que la parte numérica es efectivamente numérica y no contiene carácteres
     *
     * @param dni (String) dni a comprobar
     * @return true si la parte numérica es correcta
     */
    public static boolean comprobarParteNumerica(String dni) {
        String parteNumerica = ""; //String auxiliar para almacenar la parte numérica

        try {
            //Para obtener la parte numérica, hago un substring de la posición 0 a la 8
            parteNumerica = dni.substring(0, 8);
            System.out.println("La parte numérica es: " + parteNumerica);

            //Por último voy a comprobar que efectivamente es un número
            int numero = Integer.parseInt(parteNumerica);
            System.out.println("La parte numércia como número es: " + numero);

        } catch (Exception e) {
            //Si lanza una excepción significa que la parte numérica del dni es incorrecta.
            System.out.println("Error en los datos.");
            return false;
        }
        return true;


    }


}
