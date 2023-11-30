package dia21_11Teoria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Simular una empresa, donde se compran y venden productos

        Articulo gorro = new Articulo();

        gorro.nombre = "Gorro lana";
        gorro.descripcion = "PGorro hecho en punto de lana.";
        gorro.precioBase = 7.0;
        gorro.id = 22;
        gorro.stock = 56;

        Articulo chaqueta = new Articulo();
        chaqueta.nombre = "Chaqueta";
        chaqueta.descripcion = "Chaqueta de boda.";
        chaqueta.precioBase = 69.99;
        chaqueta.id = 12;
        chaqueta.stock = 120;

        Articulo calcetines = new Articulo();
        calcetines.nombre = "Calcetines";
        calcetines.descripcion = "Calcetines largos de invierno.";
        calcetines.precioBase = 20.0;
        calcetines.id = 16;
        calcetines.stock = 151;

        gorro.tipoArticulo = "G";
        chaqueta.tipoArticulo = "G";
        calcetines.tipoArticulo = "G";


        gorro.calcularPrecio();
        chaqueta.calcularPrecio();
        calcetines.calcularPrecio();


        gorro.imprimirDatosProducto();
        chaqueta.imprimirDatosProducto();
        calcetines.imprimirDatosProducto();

        int opc = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Binvenido a gestion de stock");
            System.out.println("1. Añadir stock");
            System.out.println("2. Venta");
            System.out.println("3. Consultar stock");
            System.out.println("0. Salir");
            opc = scan.nextInt();

            if (opc < 0 || opc > 3) {
                System.out.println("Opcion incorrecta");
            } else if (opc == 0) {
                System.out.println("Saliendo ... ");
            }else {

                System.out.println("1. Añadir stock");
                System.out.println("2. Venta");
                System.out.println("3. Consultar stock");



                if (opc == 1){
                    //Añadir stock
                    System.out.println(" ");
                    System.out.println("1. Gorro Lana");
                    System.out.println("2. Chaqueta");
                    System.out.println("3. Calcetines");
                    int producto = 0;
                    producto = scan.nextInt();


                    System.out.println("Indique la cantidad: ");
                    int cantidad = scan.nextInt();

                    if (producto == 1){
                        gorro.anadirStock(cantidad);
                    }else if (producto == 2){
                        chaqueta.anadirStock(cantidad);
                    }else {
                        calcetines.anadirStock(cantidad);
                    }

                } else if (opc == 2) {
                    //Venta de producto
                    System.out.println(" ");
                    System.out.println("Venta. Indique el producto: ");
                    System.out.println("1. Gorro Lana");
                    System.out.println("2. Chaqueta");
                    System.out.println("3. Calcetines");
                    int producto = 0;
                    producto = scan.nextInt();

                    if (producto  == 1 ){
                        gorro.venderArticulo();
                    } else if (producto == 2) {
                        chaqueta.venderArticulo();
                    }else if (producto == 3 ){
                        calcetines.venderArticulo();
                    }else {
                        System.out.println("Opcion incorrecta");
                    }

                } else {
                    //Consultar stock
                    System.out.println(" ");
                    System.out.println("Consulta Stock. Indique el producto: ");
                    System.out.println("1. Gorro Lana");
                    System.out.println("2. Chaqueta");
                    System.out.println("3. Calcetines");
                    int producto = 0;
                    producto = scan.nextInt();

                    if (producto  == 1 ){
                        gorro.hayStock();
                    } else if (producto == 2) {
                        chaqueta.hayStock();
                    }else if (producto == 3 ){
                        calcetines.hayStock();
                    }else {
                        System.out.println("Opción incorrecta");
                    }
                }

            }

        } while (opc != 0);
    }
}
