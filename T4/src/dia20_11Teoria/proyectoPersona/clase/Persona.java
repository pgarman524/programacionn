package dia20_11Teoria.proyectoPersona.clase;

public class Persona {

    public String nombre;
    public String dni;
    public String apellidos;
    public int edad;
    public double altura;
    public String colorPelo;
    public String colorPiel;

    /**
     *Añadir un atributo publico "estaTrabajando"
     *Atributo de tipo boolean inicializado pordefecto a false
     */

    public boolean estaTrabajando = false;
    //Constructor de clase


    /**
     * Definir un constructor de clase para Persona
     * Se le pasa el nombre, dni, apellidos y edad
     */

    public Persona(String nombre, int edad, String dni, String apellidos) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
        this.apellidos = apellidos;
    }

    /**
     * Método que comprueba si esta persona es mayor de edad
     * El método devuelve un boolean
     */
    public boolean comprobarEdad() {
      /**  if (this.edad > c.edad) {
            System.out.println(this.nombre + " es mayor que " + c.nombre);
            return true;
        } else {
            System.out.println(c.nombre + " es mayor que " + this.nombre);
            return false;
        }
*/
      if (this.edad >= 18){
          return true;

      }else {
          return false;
      }
    }

    /**
     * Método que comprueba si dos personas son iguales
     * El método devuelve un boolean
     */

    public boolean comprobarIdentidad(Persona c) {
        if (this.dni.equals(c.dni)) {
            System.out.println("Son la misma persona");
            return true;
        } else {
            System.out.println("Son personas distintas");
            return false;
        }
    }


    /**
     * Método que da alta y de baja a la persona en un trabajo
     * El método se llama CambiarEstadoTrabajo
     *
     * Si está trabajando -> se pone a que ya no está trabajando
     * Si no está trabajando -> Se pone a que sí está trabajando
     */

    public boolean cambiarEstadoTrabajo (){

        if (this.estaTrabajando){

            System.out.println("La persona de nombre "+this.nombre+" está trabajando.");
            return false;
        }else {
            System.out.println("La persona de nombre "+this.nombre+" no está trabajando" );
            return true;
        }

    }




    /**
     * Método para presentar una persona
     */
    public void presentarse() {

        System.out.println("Hola, me llamo " + this.nombre + " mi dni es " + this.dni);
    }

    public void cumplirAnios() {
        this.edad++;
        System.out.println("Tengo " + this.edad + " años.");
    }

    public void colorPelo(String nuevoColor) {
        System.out.println("Antes tenía mi pelo de color " + this.colorPelo + ". Pero mi nuevo color de pelo es " + nuevoColor);
        this.colorPelo = nuevoColor;
    }
}
