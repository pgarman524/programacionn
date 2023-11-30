import java.util.Scanner;
/*
    alt + shift + .  -> aumentar el tamaño

    alt + shift + ,  -> reducir el tamaño
 */
public class IVA {
    public static void main (String[] args) {
          /*Nombre:  Pablo
        Apellidos: García Mangana
        Actividad: IVA (0.21)
                 */

        Scanner scan = new Scanner(System.in); //insertamos el número del precio sin IVA
        double precio =scan.nextDouble();

        double iva = (precio*0.21); //Para saber cuánto es el IVA de un producto multiplicamos (en este caso un IVA del 21%) el precio por el IVA
        double Final = iva+precio; //Para saber el precio completo con IVA hay que sumar el precio original introducido más el IVA hallado de antes

        System.out.printf("El precio del artículo con Iva es: "+ Final); //finalmente nos da el precio de un producto con su IVA



    }
}
