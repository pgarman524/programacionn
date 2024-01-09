package proyectoUE;

import proyectoUE.Clases.Pais;

public class Main {

    public static void main(String[] args) {

        Pais etiopia = new Pais("Etiopia", 2,20000, true);
        Pais filipinas = new Pais("Filipinas", 17, 2000000, false);
        Pais mojacar = new Pais("Mojacar", 1, 6000,true);

        System.out.println(mojacar.getNombre());
        //Llama al método static
        mojacar.imprimeNumPais();
            //set para añadir un nuevo nombre
        mojacar.setNombre("Jaen");
            //get para mostrar el nombre
        System.out.println(etiopia.getNombre());

        System.out.println(mojacar.getNombre());
    }


}
