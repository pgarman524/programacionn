package dia21_11Teoria;

public class Articulo {
    /**
     * Atributos de clase:
     * -id
     * -nombre
     * -cantidad
     * -descripcion
     * -precioBase
     * -precioIVA
     * -tipoArticulo  -> (4%,10% o 21%)
     * <p>
     * ---------
     * - public venderArticulo()
     * - public calcularPrecio() -> precioBase + tipoArticulo
     * - public imprimirArticulo()
     * -  public anadirStock(cantidad:int)
     * - public hayStock():boolean
     */

    int id;
    int articulo;
    public int stock;
    String nombre;
    int cantidad;
    String descripcion;
    double precioBase;
    double precioIVA;
    String tipoArticulo;


    public void venderArticulo() {
        if (hayStock()) {
            this.stock = this.stock - 1;
            System.out.println("Se ha vendido un " + this.nombre);
        } else {
            System.out.println("No hay stock disponible.");
        }

    }

    public void calcularPrecio() {
        if (this.tipoArticulo.equals("SR")) {
            this.precioIVA = this.precioBase * 1.04;
        } else if (this.tipoArticulo.equals("R")) {
            this.precioIVA = this.precioBase * 1.10;
        } else {
            this.precioIVA = this.precioBase * 1.21;
        }

    }

    public void imprimirArticulo() {
        System.out.println("La cantidad de " + nombre + " es de " + cantidad);

    }

    public void anadirStock(int cantidad) {

        this.stock = this.stock + 1;
        System.out.println("Se han añadido " + cantidad + " items a " + this.nombre);
    }

    public boolean hayStock() {
        if (this.stock > 0) {
            System.out.println("Hay " + this.stock + " productos");
            return true;
        } else {
            System.out.println("No hay productos de " + this.nombre);
            return false;
        }
    }

    public void imprimirDatosProducto() {

        System.out.println("ID: " + this.id +
                "\n\t-Nombre: " + this.nombre +
                "\n\t-Descripcion: " + this.descripcion +
                "\n\t-Cantidad: " + this.stock +
                "\n\t-Precio Iva: " + this.precioBase +
                "\n\t-Precio con IVA: " + this.precioIVA);

    }

    /**
     * Crear constructor personalizado al que se le pase:
     * id
     * nombre
     * tipo
     * precioBase
     * <p>
     * y además, que en base a esos parámetros, que calcule el precio con IVA
     */

  //Método constructor.
   /* public Articulo(int id, String nombre, String tipo, double precioBase) {
        this.id = id;
        this.nombre = nombre;
        this.tipoArticulo = tipo;
        this.precioBase = precioBase;

       calcularPrecio();

    }
*/
}
