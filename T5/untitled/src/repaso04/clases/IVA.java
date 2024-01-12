package repaso04.clases;

public class IVA {

    private static final double IVANORMAL = 1.21;

    private static final double IVAREDUCIDO = 1.10;
    private static final double IVASUPERREDUCIDO = 1.04;


    /**
     * Método que devuelve un tipo de IVA según el tipo de artículo que se le pase por parámetros.
     */
    //Aplicación a pequeña escala del  patrón fáctory
    public static double getIva(String tipoProducto) {
        if (tipoProducto.equals("G")) {
            return IVA.IVANORMAL;
        } else if (tipoProducto.equals("R")) {
            return IVA.IVAREDUCIDO;
        } else if (tipoProducto.equals("SR")) {
            return IVA.IVASUPERREDUCIDO;
        } else {
            return 1;
        }

    }
}
