import java.util.ArrayList;

public class Teoria {
    public static void main(String[] args) {
        //Esto es una array que cambia el tamaño según lo que contenga
        ArrayList lista = new ArrayList<>();

        //Cómo añadir elementos en el array list
        lista.add(-25);
        lista.add(3.14);

        //Esto es para mostrar el tamaño del arraylist. Antes arr.length

        lista.size();
        System.out.println(lista.size());

        //Con esto obtenemos la posición indicada del array anteriormente usábamos: lista[0]
        lista.get(0);


        //Devuelve true si la lista contiene objetos en su interior
        lista.isEmpty();


    }

}
