package ProyectoMascotas.Clases;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Mascotas> mascotas;

    public Inventario() {
        mascotas = new ArrayList<>();
    }

    public void mostrarDatosAnimales() {
        //Recorremos el arr para poder mostrar los datos de todos los animales.
        for (int i = 0; i < mascotas.size(); i++) {
            mascotas.get(i).muestra();
        }

    }


    public void anadirMascota(Mascotas m) {
        mascotas.add(m);
    }

    public boolean eliminarMascota(String nombre) {
        boolean mascotaEliminada = false;

        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).nombre.equalsIgnoreCase(nombre)) {
                mascotas.remove(i);
                mascotaEliminada = true;
                break;
            }
        }
        return false;
    }

    //El método clear() vacía por completo un array
    public void vaciarInventario() {
        mascotas.clear();
    }


    public void mostrarDatosDeUnAnimal(String nombre) {
        //Declaramos un objeto de tipo mascota para almacenar la mascota a encontrar
        Mascotas mas = null;

        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                //Ahora mas es la mascota del array
                mas = mascotas.get(i);
                break;
            }

            //Esta forma también sería válida
            //mas sería null, cuando un objeto es null. No tiene nungún atributo, ni ningún método...
            //Entonces, si se intenta acceder a un método que no existe... Saltará una nullpointerexception
            /**
             try {
             mas.muestra();
             }catch (NullPointerException e){
             System.out.println("Mascota no encontrada");
             }
             **/

            if (mas == null) {
                System.out.println("Mascota no encontrada");
            } else {
                mas.muestra();
            }

        }
    }


    public void mostrarTipoYNombreAnimal() {
        // Recorreremos el arr
        for (int i = 0; i < mascotas.size(); i++) {
            //Creamos un objeto temporal de tipo mascota por comodidad. Ahora m es get(i)
            Mascotas m = mascotas.get(i);

            //Hay que preguntar si m es de tipo Perro o tipo Gato...
            //Creamos un String vació para luego guardar ahí el tipo
            String tipo = "";

            //instanceof pregunta de qué tipo es el objeto Mascota. Así que devolverá true o false dependiendo de la respuesta
            if (m instanceof Perro) {
                tipo = "Perro";
            } else if (m instanceof Gato) {
                tipo = "Gato";
            } else if (m instanceof Canario) {
                tipo = "Canario";
            } else if (m instanceof Loro) {
                tipo = "Loro";
            }else {
                tipo = "Mascota";
            }

            System.out.println(m.getNombre() + ": "+ tipo);
        }
    }


}
