import proyectoUE.Clases.Pais;
import repaso04.clases.Articulo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TeoriaArrList {
    public static void main(String[] args) {

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

        //Cuantos Pablos hay en la lista?
        //NO hay ningún elemento como tal creado por java, pero podemos usar esto:
        int contador = 0;
        for (int i=0; i<arr2.size(); i++){
            //Si el elemento en la posición i es Pablo, se incrementa el contador
            if (arr2.get(i).equals("Antonio")){
                contador++;
            }
        }
        System.out.println("Hay "+ contador+" Antonio(s)");


        //------------------------------------------------------------


        // Listas de objetos
        // ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Pais> articulos = new ArrayList<Pais>();
        ArrayList<Articulo> pokemons = new ArrayList<Articulo>();

        Articulo chancla = new Articulo("Chancla", 12,350,"G");
        Articulo leche = new Articulo("Leche",0.95, 570, "S");
        Articulo carne = new Articulo("Carne", 3.25,125,"G");





    }


}
