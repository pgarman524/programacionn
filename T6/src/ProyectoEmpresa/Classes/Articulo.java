package ProyectoEmpresa.Classes;

public class Articulo implements Comparable<Articulo> {
    private String id;
    private String nombre;
    private Proveedor proveedor;
    private double precioSinIva;
    private double precioConIva;
    private int stock;

// Constructor

    public Articulo(String id, String nombre, Proveedor proveedor, double precioSinIva, int stock) {
        this.id = id;
        setNombre(nombre);
        setProveedor(proveedor);
        setPrecioSinIva(precioSinIva);
        setPrecioConIva();
        setStock(stock);

    }

    //Métodos

    @Override
    public String toString() {
        String cadenaAMostrar = "";

        cadenaAMostrar += "Articulo con id: " + this.id + "\n";
        cadenaAMostrar += "Nombre: " + this.nombre + " precio: " + this.precioConIva + "€\n";
        cadenaAMostrar += "Stock: " + this.stock;

        return cadenaAMostrar;
    }

    @Override
    public boolean equals(Object art) {
        if (art instanceof Articulo) {
            Articulo articulo = (Articulo) art;

            if (this.id.equalsIgnoreCase(((Articulo) art).id)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }


// Getter and Setters

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) {
        if (precioSinIva >= 0) {
            this.precioSinIva = precioSinIva;
        }
    }

    public double getPrecioConIva() {
        return precioConIva;
    }

    public void setPrecioConIva() {
        this.precioConIva = this.precioSinIva * 1.21;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = this.stock + stock;
    }


    @Override
    public int compareTo(Articulo o) {
        //Devolver 0 si son iguales
        if (this.precioSinIva == o.precioSinIva) {
            return 0;
            //Devolver un num positivo si son mayores
        } else if (this.precioSinIva > o.precioSinIva) {
            return 1;
            //Devolver un num negativo si son menores
        } else {
            return -1;
        }
    }
}
