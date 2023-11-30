package otraCLase;//Otros nombres: Funciones, Procedimientos,...
//Un Sistema está formado por distintas funciones
//Las funciones hacen que cada sección tengan una funcionalidad muy determinada.
//Ordenan el  código  para ser leido y mantenido de mejor forma.
//Divide et Impera. Java se centra en dividir en pequeñas secciones un grupo de códigos.

import java.util.Scanner;

import otraCLase.MetodosJavaTeoria02;

import Funciones02.ClaseFueraPaquete;

/*
public      /   hace a      /   String      /   num             /   parámetros de entrada           /
private     / ese método    /   int         /   sumar           /                                   /
protected   /   estático    /   boolean     / (variables)       /                                   /
default     /               /   ...         /    ...            /                                   /
------------------------------------------------------------------------------------------------------------------------
visibilidad ->  [static]    ->  tipo_que_retorna  -> identificador -> (Tipo de dato identificador) -> return [variable]



 */
public class MetodosJavaTeoria01 {
    public static void main(String[] args) {
    menu();
        Scanner scan  =new Scanner(System.in);

        String nombre = "";
        System.out.println(" Dime tu nombre: ");
        nombre= scan.next();

        imprimirNombre(nombre);


        //Vamos a poner clases de Teoria02 "sumar"

            //Método 01
        int resultado = MetodosJavaTeoria02.sumar(2,3);
        System.out.println(resultado);

            //Método 02
        System.out.println(MetodosJavaTeoria02.sumar(2,3));

        //Vamos a poner la clases de Teoria 02 "resta"




        boolean esValido = ClaseFueraPaquete.checkDNI("12345678A");
        if (esValido){
            System.out.println("El DNI es válido");
        }else {
            System.out.println("El DNI no es válido");
        }
    }

    public static void menu() {
        System.out.println("" +
                "\nIntroduzca una opción válida. " +
                "\n 1.Login." +
                "\n2. Registrar." +
                "\n3. Eliminar." +
                "\n0. Salir.");
    }

    /*
    Hacer un método que imprima por pantalla "hola" y el nombre del usuario.
     */


    /**
     * Método que imprime por pantall el nombre de usuario.¡
     * @param nombreUsuario (String )Nombre del usuarioa imprimir por pantalla
     */
    public static void imprimirNombre(String  nombreUsuario){
        System.out.println("Hola "+nombreUsuario);


    }






}
