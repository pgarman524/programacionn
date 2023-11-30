import java.util.Scanner;

public class Teoria_02 {
    public static void main(String[] args) {


    /*
    Clase -->  String --> Es una cadena de carácteres. Ej: "Hola mundo"
    No se pueden sumar los carácteres con números  decimales. Pero sí:
    "Hola"+"mundo" ---> Holamundo
    "Hola"+2 ----> Hola2

    ***********************************
    String cadena ="Hola";
    String letra = "a";
    String resultado;

    resultado = cadena + letra;
    ***
    Resultado: holaa
    ************************************




     */
Scanner scan = new Scanner(System.in);

//Declaramos una cadena de caracteres que se llame "mensajePresentacion"
        //Pedir el nombre a  tu usuario
    String mensajePresentacion = "";

    String nombre = "";
    nombre = scan.next();

    mensajePresentacion = "Hola mi nombre es: "+nombre+".";

    //Pedimos la edad
    int edad = 0;
        System.out.println("Introduce tu edad:");
        edad  = scan.nextInt();

        mensajePresentacion = mensajePresentacion+" y tengo unos "+edad+" años.";
        System.out.println(mensajePresentacion);

        //Continuamos con la localización
        String localizacion = "";
        System.out.println("¿De dónde eres?");
    localizacion = scan.next();

    mensajePresentacion = mensajePresentacion+" y soy de "+localizacion+".";

    }
}
/*
***********************************************************
Comparación de cadenas String
== --> Es para números por lo que necesitamos otra cosa ----> equals()
*
* equals() -> es un método de la clase (String)
* String cadena1 = "Hola";
* String cadena2 = "Adios";
*
* boolean comparacion = cadena1.equals(cadena2); -------> False

* Este ejemplo sería como a == b;
*
* boolean comp2 = cadena1.equals("hola"); ---------> False porque java distingue mayus de minus
*
*
*
* !cadena1.equals(cadena2); ----->  al usa "!" al inicio es lo mismo que usar "!="
 */
