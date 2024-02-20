package ProyectoEmpresa;

import ProyectoEmpresa.Classes.Articulo;
import ProyectoEmpresa.Classes.Proveedor;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Proveedor p1 = new Proveedor("Juan", "34236881A", "Nacho Nachos", "Calle Falsa 123", 45);

        //UUID.randomUUID().toString()
        Articulo vaper = new Articulo("1", "vaper para ciegos", p1, 5, 100);
        Articulo vaper2 = new Articulo("1", "vaper para sordos", p1, 5, 100);
        Articulo vaper3 = new Articulo("1", "vaper para cojos", p1, 5, 50);


        System.out.println(vaper.equals(vaper2));

        System.out.println(p1.equals(p1));

        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        articulos.add(vaper);
        articulos.add(vaper2);
        articulos.add(vaper3);
        System.out.println(articulos.get(0));

        // estamos añadiendo un vaper que ya existe.
        // queremos añadir vaper 2

        System.out.println(articulos.get(0));
        for (int i = 0; i <= articulos.size(); i++) {
            if (vaper2.equals(articulos.get(i))) {
                articulos.get(i).setStock(vaper2.getStock());
                break;
            }

        }
        System.out.println(articulos.get(0));


        if (articulos.contains(vaper3)) {
// Cómo añadir stock a un artículo
            articulos.get(articulos.indexOf(vaper3)).setStock(vaper3.getStock());
        }
        System.out.println(articulos.get(articulos.indexOf(vaper3)));
        System.out.println(articulos.get(0));


        // Crear 5 artículos más
        // Los vais a añadir al arrayList
        // Vais a mostrar la lista de artículos
        // ¿La lista está ordenada?
        // Ordena la lista... (plot twits: Se puede hacer con una sola línea)
        //Muestra la lista de nuevo

        Articulo vaper4 = new Articulo("2", "vaper para perros", p1, 15, 350);
        Articulo vaper5 = new Articulo("3", "vaper para gatos", p1, 12, 145);
        Articulo vaper6 = new Articulo("4", "vaper para niños", p1, 3, 450);
        Articulo vaper7 = new Articulo("5", "vaper para peces", p1, 8, 125);
        Articulo vaper8 = new Articulo("6", "vaper para twitteros", p1, 34, 120);


        articulos.add(vaper4);
        articulos.add(vaper5);
        articulos.add(vaper6);
        articulos.add(vaper7);
        articulos.add(vaper8);

        //Como tenemos el método toString. Con esto podemos mostrar el array con sus datos
        System.out.println(articulos.toString());
        System.out.println("");

        //Ordenamos por precio el array
        articulos.sort(Comparator.comparing(Articulo::getPrecioConIva));

        System.out.println(articulos.toString());

        //Collections.sort(articulos);

    }
}
