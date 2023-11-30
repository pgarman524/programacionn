package dia20_11Teoria.proyectoPersona;

import dia20_11Teoria.proyectoPersona.clase.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona alvaro = new Persona("Álvaro", 24, "34568791G", "García Nunez");
//Atributos de clase
        alvaro.colorPelo = "Castaño";



        if (alvaro.comprobarEdad()) {
            System.out.println(alvaro.nombre + " es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad");
        }


//Métodos de clase


        alvaro.colorPelo("Rubio");

    }


}
