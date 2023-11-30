package dia14_11Teoria;

public class validarDnis {
    public static void main(String[] args) {
        /**
         * Declarar un array de String de 10 posiciones
         * Meter en cada posición 1 dni diferente
         * Llamar al método checkPartenumerica y contar
         * cuantos dnis son válidos y cuántos inválidos
         */

        //Declarar array

        //Llenar array

        //Declarar contador para dnisValidos y dnisInvalidos

        //Recorrer el array

        //cada posición del array, llamar a DniValidator.comprobarParteNumerica.()

        //Si es true -> contador dnisValidos ++
        //Si false -> contador dnisInvalidos ++

        //Imprimir por pantalla los resultados


        String[] arrDni = new String[10];

        arrDni[0] = "44405893T";
        arrDni[1] = "Z2571290X";
        arrDni[2] = "44405893T";
        arrDni[3] = "03410785T";
        arrDni[4] = "A57239253";
        arrDni[5] = "44405893S";
        arrDni[6] = "86195914X";
        arrDni[7] = "X8282684Q";
        arrDni[8] = "97456086A";
        arrDni[9] = "X1034312W";

        int dnisValidos = 0;
        int dnisInvalidos = 0;


        for (int i = 0; i <= arrDni.length - 1; i++) {
            //creamos un boolean false para que cuando inice el for se transforme de nuevo a false
            boolean dniEsValido = false;
            //aquí la clase responde si es true o es false y por lo tanto si dniEsValido este se transforma en true por el =
            dniEsValido = Teoria.comprobarParteNumerica(arrDni[i]);
            if (dniEsValido) {
                dnisValidos++;
            } else {
                dnisInvalidos++;
            }

        }
        System.out.println("Los dni válidos son: "+dnisValidos);
        System.out.println("Los dni inválidos son: "+dnisInvalidos);


    }
}
