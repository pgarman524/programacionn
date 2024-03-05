package Classes;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contacto> agenda = new ArrayList<Contacto>();

    public boolean anadirContacto(Contacto c) {

        for (int i = 0; i < agenda.size(); i++) {
            if (c.getNombre().equals(agenda.get(i).getNombre())) {
                System.out.println("Nombre ya registrado, no puede añadir contacto.");
                return false;
            } else {
                System.out.println("Persona añadida a la agenda.");
                agenda.add(c);
                return true;
            }

        }
        return false;
    }

    public boolean eliminarContacto(String nombre) {
        for (int i = 0; i < agenda.size(); i++) {
            if (nombre.equals(agenda.get(i).getNombre())) {

                agenda.remove(i);
                System.out.println("Contacto eliminado correctamente.");
                return true;
            } else {
                System.out.println("Contacto no encontrado.");
                return false;
            }

        }
        return false;
    }

    public void existeContacto(String nombre) {
        for (int i = 0; i < agenda.size(); i++) {
            if (nombre.equals(agenda.get(i).getNombre())) {
                System.out.println("El nombre del contacto es: " + agenda.get(i).getNombre() +
                        "\nEl teléfono es: " + agenda.get(i).getTelefono());
            }
        }
    }

    public void listarContactos(){
        for (int i = 0; i < agenda.size(); i++){
            System.out.println("El nombre del contacto es: " + agenda.get(i).getNombre() +
                    "\nEl teléfono es: " + agenda.get(i).getTelefono());
            System.out.println("");
        }
    }


}
