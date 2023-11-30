package Funciones02;

public class ClaseFueraPaquete {

    /**
     * Métodoque comprueba la validez  de un DNI
     *
     * @param dni
     * @return true -> DNI  válido / false -> DNI  inválido.
     */
    public static boolean checkDNI(String dni) {
        return false;
    }

    /**
     * Método que comprueba le dni
     *
     * @param dni
     * @return
     */
    protected static boolean comprobarLength(String dni) {

        char letraDNI = dni.charAt(dni.length() - 1);
        if (comprobarLength(dni) && comprobarSiEsLetra(letraDNI)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Métodoque comprueba que la última posición es una letra.
     *
     * @param letraDNI caracter del dni
     * @return
     */
    protected static boolean comprobarSiEsLetra(char letraDNI) {
//Hemos puesto los números ASCI correspondiente a los charas
        if (letraDNI >= 65 && letraDNI <= 90 || letraDNI >= 97 && letraDNI <= 122) {
            return true;
        } else {
            return false;
        }

        /*
        Método que compruebe que todos los carácteres del DNI son válidos.
        El DNI tiene 8 números y una letra
         */
    }

    private static boolean checkCaracteres(String dni) {
        boolean dniEsValido = true;
        for (int i = 0; i <= dni.length() - 2; i++) {

            try {

                //intentar parsear a entero el carácter.
                char letraEnI = dni.charAt(i); //Obtenemos el carácter en esa posición
                String letraEnPosicionI = Character.toString(letraEnI); //Convertir ese carácter a String
                Integer.parseInt(letraEnPosicionI); //Intentamos convertir el String a int

            } catch (NumberFormatException e) {
                System.out.println("El DNI no es válido");
                dniEsValido = false;
                break;
            }

        }
        return dniEsValido;
    }
}
