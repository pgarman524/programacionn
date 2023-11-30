public class arrayEjercicioClase02 {
    public static void main(String[] args) {

        /**
         Declarar un array de char de tamaño 1000.
         Llenar TODAS  las posiciones con la letra "F"
         */

        char [] efes = new char[1000]; //array tamaño 1000

        for (int i = 0; i<= efes.length-1; i++){
            efes[i]  = 'F'; //LLenamos cada posición con una f
        }
    }
}
