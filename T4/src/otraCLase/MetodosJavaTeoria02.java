package otraCLase;

public class MetodosJavaTeoria02 {

    /**
     * No vamos a hacer ningún main
     * Esta teoría son metodos para usar en Teoria01
     */
    /**
     * Métodos para sumar dos variables
     * @param a - Sumando 1
     * @param b - Sumando 2
     * @return resultado de la suma (int)
     */
    public static int sumar (int a, int b){

        return a+b;
    }

    /**
     * Método para realizar resta
     * @param a  - Número 1
     * @param b  - Número 2
     * @return resultado de la resta
     */

    private static int restar (int a, int b){

        return  a-b;
    }

    /**
     * Solo imprime por pantalla un mensaje.
     */
    protected static void imprimirOperaciones(){
        System.out.println("Esta clase puede sumar y restar.");
    }
}
