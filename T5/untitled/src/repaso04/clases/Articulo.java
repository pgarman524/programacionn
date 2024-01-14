package repaso04.clases;

public class Articulo {
    private String nombre;
    private double precio;
    private int cuantosQuedan;

    private String tipo;


    //Constructor
    public Articulo(String nombre, double precio, int cuantosQuedan, String tipo) {
        this.nombre = nombre;
        if (precio >= 0) {
            this.precio = precio;
        }

        if (cuantosQuedan >= 0) {
            this.cuantosQuedan = cuantosQuedan;
        }

        if (tipo.equals("G") || tipo.equals("R") || tipo.equals("SR")) {
            this.tipo = tipo;
        }
    }

    //Métodos de clase
    public void imprimirInfo() {
        System.out.printf("El nombre del producto es %s , con un precio de %f y hay un stock de %d", this.nombre, this.precio, this.cuantosQuedan);
    }

    public double getPVP() {
        return this.getPrecio() * IVA.getIva(this.tipo);
    }

    public double getPVPDescuento(double descuento) {
        return this.getPVP() - getPVP() * (descuento / 100);

    }

    public boolean vender(int cant) {
        if (cant >= 0) {
            if (this.getCuantosQuedan() >= cant) {
                this.cuantosQuedan -= cant;
                return true;
            } else {
                System.out.println("No hay suficiente Stock");
                return false;
            }


        } else {
            System.err.println("Cantidad erronea");
            return false;
        }
    }

    public boolean almacenar(int cant) {
        if (cant >= 0) {
            this.cuantosQuedan += cant;
            return true;
        } else {
            System.out.println("Error.");
            return false;
        }

    }


    //Getter and Setter
    public String getTipo() {

        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan >= 0) {
            this.cuantosQuedan = cuantosQuedan;
        }
    }


}