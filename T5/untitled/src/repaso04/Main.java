package repaso04;

//import proyectoUE.Clases.Pais;

import repaso04.clases.Articulo;
import repaso04.clases.IVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Articulo sudadera = new Articulo("Sudadera", 100, 50, "G");

        System.out.println(sudadera.getPVPDescuento(20));

        sudadera.vender(5);

        System.out.println(sudadera.getCuantosQuedan());


        // Listas de objetos
        // ArrayList<String> nombres = new ArrayList<String>();
        // ArrayList<Pais> pais = new ArrayList<Pais>();
        ArrayList<Articulo> articulos = new ArrayList<Articulo>();

        Articulo chancla = new Articulo("Chancla", 12, 350, "G");
        Articulo leche = new Articulo("Leche", 0.95, 570, "S");
        Articulo carne = new Articulo("Carne", 3.25, 125, "G");
        Articulo raqueta = new Articulo("Raqueta de tenis", 150, 200, "G");
        Articulo pelota = new Articulo("Pelota de rugby", 50, 0, "G");
        Articulo pan = new Articulo("Pan", 1, 115, "SR");

        articulos.add(chancla);
        articulos.add(leche);
        articulos.add(carne);
        articulos.add(raqueta);
        articulos.add(pelota);
        articulos.add(pan);

        //Un pequeño programa que muestre por pantalla:
        //- los articulos cuyos stock (cuantosquedan) sea <= 0
        //- los  articulos cuyo stock esté apunto de acabarse (stock <= 10)

        //Recorremos el arrlist y ponemos dentro las condiciones que se nos indican

        int quedan;
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getCuantosQuedan() <= 0) {
                System.out.println("Los articulos que no quedan son: " + articulos.get(i).getNombre());

            }

            if (articulos.get(i).getCuantosQuedan() >= 10) {
                System.out.println("Aun quedan estos: " + articulos.get(i).getNombre());
            }

        }


        //Pequeño menú para hacer diferentes operaciones con articulos.
        //Menú articulo:
        /*
        1. Cntar cuántos artículos hay en stock
        2. Contar cuántos artículos hay de tipo SR
        3. Contar cuántos artículos hay con un precio menor que 100€
        4. Decir cuál es el artículo con mayor precio
        5. Decir cuál es el artículo con menor precio
         */

        String stock;
        int contadorPrecio = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("""
                        Menú Artículo:
                        1. Contar cuántos artículos hay en stock
                        2. Contar cuántos artículos hay de tipo SR
                        3. Contar cuántos artículos hay con un precio menor que 100€
                        4. Decir cuál es el artículo con mayor precio
                        5. Decir cuál es el artículo con menor precio
                """);
        System.out.println("Indique la opción deseada: ");
        int opc;
        try {
            opc = scan.nextInt();
            switch (opc) {
                case 1:

                    System.out.println("Introduzca el artículo: ");
                    try {
                        stock = scan.next();
                        for (int i = 0; i < articulos.size(); i++) {
                            if (stock.equalsIgnoreCase(articulos.get(i).getNombre())) {
                                System.out.println("Quedan un total de: " + articulos.get(i).getCuantosQuedan());
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No me seas cafre. Pon un artículo que exista...");
                    }
                    break;
                case 2:
                    int size = 0;
                    for (int i = 0; i < articulos.size(); i++) {
                        if (articulos.get(i).getTipo().equalsIgnoreCase("SR")) {
                            size++;

                        }
                    }
                    System.out.println("Hay un total de " + size + " articulos que cumplen el IVA SR");
                    break;
                case 3:

                    for (int i = 0; i < articulos.size(); i++) {
                        if (articulos.get(i).getPrecio() < 100) {
                            contadorPrecio++;

                        }

                    }
                    System.out.println(contadorPrecio + " es el total de articulos con valor menor a 100.");
                    break;
                case 4:

                    for (int i = 0; i < articulos.size(); i++) {
                        for (int j = 0; i < articulos.size()-1; i++){
                        if (articulos.get(i).getPrecio() >= articulos.get(j).getPrecio()) {


                        }}
                        System.out.println(articulos.get(i).getNombre());
                    }




                    break;
                case 5:

                    break;

                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();  // Imprime la traza de la excepción
            System.out.println("Error en la opción...");
        }


        //---------------------------
/**
 //Declaramos un arraylist
 //ArrayList nombreDelArrList  = new ArrayList();
 ArrayList arr = new ArrayList<>();

 //Rellenamos con datos el arraylist
 //Ahora mismo está así []
 //Si usamos el método add() -> añadiremos un elemento al final de la lista.

 arr.add("Diego");
 arr.add("Pepe");
 // arr.add(2,"Pablo");
 arr.add("Carmen");
 arr.add("Luis");

 //En este punto el array list estaría así -> ["Diego", "Pepe", "Carmen", "Luis"]
 for (int i = 0; i <= arr.size()-1; i++){
 System.out.println("Elemento: "+arr.get(i));
 }

 //El tamaño actual es de 4
 System.out.println("Tamaño de arr: "+ arr.size());

 //Posición de:
 System.out.println(arr.get(3));

 //Añado otro nuevo elemento
 arr.add("Jose");

 //Declaramos mejor el tipo de datos que queremos añadir al arrlist
 ArrayList<String> arr2 = new ArrayList<String>();
 arr2.add("Diego");
 arr2.add("Alfonso");
 arr2.add("Ana");
 arr2.add("Lucia");
 arr2.add("Alfredo");
 arr2.add("Francisco");
 arr2.add("Adolfo");
 arr2.add("Benito");

 //En los array list podemos insertar los elementos donde queramos,
 // el elemento que había en el 4 ahora será el 5. Por lo que esto no sustituye el anterior
 System.out.println(arr2.get(4)+" "+arr2.get(5));
 arr2.add(4,"Marcos");
 System.out.println(arr2.get(4)+" "+arr2.get(5));

 //Con este cambia el contenido completamente.
 //No lo desplaza sino que lo sustituye
 arr2.set(4, "Antonio");
 System.out.println(arr2.get(4));


 //para acceder un elemento del arr list se usa le método .get
 System.out.println(arr2.get(0));
 //para llegar al último elemento usamos lo que vemos abajo
 System.out.println(arr2.get(arr2.size()-1));

 //Para recorrer un arrlist se puede recorrer con un for normal igual que un array
 //En vez de usar .length (array) usamos --> .size()

 for (int i=0; i< arr2.size(); i++) {
 System.out.println("Elemento en los array: " + arr2.get(i));
 }


 //Para buscar un elemento en un arrlist, se utiliza el método .indexOf(elemento)
 //Devuelve un int -> posición en la que se encuentra el elemento
 //Devuelve -1 si no encuentra el elemento
 arr2.indexOf("Adolfo");
 int posicionNombre = arr2.indexOf("Antonio");

 if (posicionNombre != -1){
 System.out.println("El elemento se encuentra en la posición: "+ posicionNombre);
 System.out.println("El elemento es: "+ arr2.get(posicionNombre));
 } else {
 System.out.println("El elemento no se encuentra en la lista.");
 }
 **/
    }


}
