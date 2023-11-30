package dia20_11Teoria.proyectoPersona.utiles;

public class LocalidadValidator {

    //atributos de clase
    public String[] provinciasValidas = {"Cadiz", "Huelva", "Sevilla", "Malaga", "Granada", "Jaen", "Almeria", "Cordoba"};
    public String[] cpValidos = {"11", "21", "41", "29", "18", "23", "04", "14"};


    /**
     * Método para comprobar la validez de un cp y de una provincia
     *
     * @param provincia
     * @param cp
     * @return true si es correcto, false si es incorrecto
     */
    public boolean checkProvincia(String provincia, String cp) {
        //Primero comprobamos que la provincia existe
        boolean provinciaExiste = false;
        int posicionProvincia = 0;
        for (int i = 0; i <= provinciasValidas.length; i++) {

            if (provincia.equalsIgnoreCase(provinciasValidas[i])) {
                provinciaExiste = true;
                posicionProvincia = i;
                break;

            }
        }
        if (provinciaExiste) {
            //provinciaExiste = true
            String dosPrimerosNumerosCP = cp.substring(0, 2); //Recoge parte del string desde el 0 al 2

            if (dosPrimerosNumerosCP.equalsIgnoreCase(cpValidos[posicionProvincia])) {
                System.out.println("La provincia es correcta");
                return true;
            }
        }
        System.out.println("La provincia no existe.");
        return false;
    }
}
