package Classes;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contacto> agenda = new ArrayList<Contacto>(200);

    // --------------------------------------------------------------------------
    //                              MÉTODOS
    // --------------------------------------------------------------------------

    public boolean anadirContacto(Contacto c) {
        for (int i = 0; i < agenda.size(); i++) {
            if (c.getNombre().equalsIgnoreCase(agenda.get(i).getNombre())) {
                System.out.println("Nombre ya registrado, no se puede añadir el contacto.");
                return false;
            } else {

            }
        }
        //Coloco fuera del for para que no de error o tenga que colocar muchos retunr false
        //Como se lee de arriba a abajo si el nombre existe no se registra y si no existe pasa abajo y se registra
        System.out.println("Persona añadida a la agenda.");
        agenda.add(c);
        return true;
    }

    public boolean eliminarContacto(String nombre) {
        for (int i = 0; i < agenda.size(); i++) {
            if (nombre.equalsIgnoreCase(agenda.get(i).getNombre())) {
                agenda.remove(i);
                System.err.println("Contacto eliminado correctamente.");
                System.out.println("");
                return true;
            }
        }
        System.out.println("Contacto no encontrado.");
        return false;
    }

    public void existeContacto(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < agenda.size(); i++) {
            if (nombre.equalsIgnoreCase(agenda.get(i).getNombre())) {
                System.out.println("Nombre: " + agenda.get(i).getNombre() +
                        "\nTeléfono: " + agenda.get(i).getTelefono());
                System.out.println("");
                encontrado = true;
                //Detenemos la búsqueda una vez que se encuentre un contacto
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún contacto con ese nombre");
        }
    }

    public void listarContactos() {
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println("Nombre: " + agenda.get(i).getNombre() +
                    "\nTelefono: " + agenda.get(i).getTelefono());
            System.out.println("");
        }
    }

    public void buscaContactos(String nombre) {
        for (int i = 0; i < agenda.size(); i++) {
            if (nombre.equals(agenda.get(i).getNombre())) {
                //Usamos i + 1 pàra obtener el índice del contacto ya que empezamos a contar desde 0
                System.out.println("Contacto se encuentra en la posición: " + (i + 1));
                System.out.println("");
            }
        }
    }


    // --------------------------------------------------------------------------
    //                              GETTER AND SETTERS
    // --------------------------------------------------------------------------


    public ArrayList<Contacto> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Contacto> agenda) {
        this.agenda = agenda;
    }


    // --------------------------------------------------------------------------
    //                              MAIN DE PRUEBAS
    // --------------------------------------------------------------------------

    public static void main(String[] args) {
        Agenda agenda = new Agenda();


        Contacto contacto1 = new Contacto("Juan", "123 45 67 89");
        Contacto contacto2 = new Contacto("María", "987654321");
        Contacto contacto3 = new Contacto("Pepe", "555555555");


        agenda.anadirContacto(contacto1);
        agenda.anadirContacto(contacto2);
        agenda.anadirContacto(contacto3);


        agenda.listarContactos();

        agenda.buscaContactos("Pepe");

        agenda.existeContacto("Pepe");

        agenda.eliminarContacto("Pepe");
        agenda.listarContactos();
    }
}


