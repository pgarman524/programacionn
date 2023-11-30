;

public class toríaArraysStrings {

    public static void main(String[] args) {

        /**
         * Recordatorio de métodos conocidos hasta ahora.
         */

        // Dado el array de enteros iArr ¿Cómo podemos conocer su tamaño/longitud?
        int[] iArr = {2,6,2,99,100,34,10,320,45,26,96,22,11,33,44};
        System.out.println("La longitud de iArr es: ");

        // ¿Cómo podemos acceder a una posición/index concreta de un array?
        int[] iArr2 = {2,6,2,99,100,34,10,320,45,26,96,22,11,33,44,6,12,54,34,87,101,66,3,12,1,2,3,4,9,5,87};
        System.out.println("El elemento en la posición 0 es ");
        System.out.println("El elemento en la posición 4 es ");
        System.out.println("(Difícil) El elemento en la última posición es ");


        // Dados dos String normales y corrientes. ¿Cómo podemos saber si esas dos cadenas son iguales?
        String cadena1 = "supercalifragilistoespiaIdoso";
        String cadena2 = "supercalifragilistoespialdoso";

        if(cadena1.equals(cadena2)){
            System.out.println("Ambas cadenas son iguales");
        } else {
            System.out.println("Las cadenas son diferentes");
        }

        String cadena3 = "supercalifragilistoespialidoso";
        String cadena4 = "SupErCAlifrAgilistOEspialidOsO";

        if(cadena3.equalsIgnoreCase(cadena4)) {
            System.out.println("Ambas cadenas son iguales");
        } else {
            System.out.println("Las cadenas son diferentes");
        }


        /**
         * Hoy vamos a ver algunas características de los String
         */

        // Declarar un array de char de tamaño 10.

        // Un String no es otra cosa que un array de char

        // Tenemos métodos de String, que son iguales a los que tenemos en array
        String pruebaSt = "Hola Mundo";

        char[] arrCh = {'H','o','l','a',' ','M','u','n','d','o'};
        int[] arrInt = new int[11];
        boolean[] arrBool = {true, false, true, true, true};


        System.out.println("La longitud de arrCh es: "+arrCh.length);
        System.out.println("La longitud de arrInt es: "+arrInt.length);
        System.out.println("La longitud de arrBool es: "+arrBool.length);
        System.out.println("La longitud de pruebaSt es: "+pruebaSt.length());

        // longitud de un array -> .length
        // longitud de un String -> .length()


        // ¿Alguien puede decirme cómo se vería en forma de array la cadena "perro"?
        /*
                     0  1  2  3  4      string perro.length
        "perro" ->  [p][e][r][r][o]

         */

        // ¿Cuál es el carácter que está situado en el index/posición número 3?
            //la R

        // En un array normal, para acceder a una posición concreta, teníamos que hacerlo de la siguiente forma:
        // nombreArray[index/posición];

        // Con los String, para acceder a una posición concreta, se hace de manera parecida
        // nombreString.charAt(index/posición);
        //charArray[3];
        //perro.charAt(3); //estamos accediendo al carácter en la posición 3
        String abece = "abcdefghijklmnñopqrstuvwxyz";


        // Vamos a hacer un ejercicio donde recorramos el String abece y mostremos cada uno de los carácteres
       //tenemos la longitud del String con abece.length()
        //tenemos la posibilidad de acceder a cada uno de los carácteres abece.charAt(index)


        for (int i = 0; i <= abece.length()-1; i++){
            System.out.println(abece.charAt(i));
        }
        //cadena inversa
        for (int i = abece.length()-1; i>= 0; i--){
            System.out.println(abece.charAt(i));
        }
        String cade1 = "Hola";
        String cade2 = "hola";
        String cade3 = cade1 + cade2;   //Holahola

        if (cade1.equals(cade2)){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }
        cade3 = cade3+cade1;    //HolaholaHola




    }

}