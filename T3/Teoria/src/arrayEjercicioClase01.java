public class arrayEjercicioClase01 {

    //Declarar un array de String de tamaño "el n" de alumnos de esta clase
    //Inicializar dicho String con los nombres de cada uno.


    String[] alumnos = new String[19];

    {
        System.out.println();
        alumnos[0] = "Ángel";
        alumnos[1] = "Ángel";
        alumnos[2] = "Ángel";
        alumnos[3] = "Ángel";
        alumnos[4] = "Ángel";
        alumnos[5] = "Ángel";
        alumnos[6] = "Ángel";
        alumnos[7] = "Ángel";
        alumnos[8] = "Ángel";
        alumnos[9] = "Ángel";
        alumnos[10] = "Ángel";
        alumnos[11] = "Ángel";
        alumnos[12] = "Ángel";
        alumnos[13] = "Ángel";
        alumnos[14] = "Ángel";
        alumnos[15] = "Ángel";
        alumnos[16] = "Ángel";
        alumnos[17] = "Ángel";
        alumnos[18] = "Ángel";


        //Declarar un array de enteros  de tamñao 6

        int[] intArr = {4, 7, 2, 15, 12, 10};

        System.out.println("El tamaño es " + intArr);

        //Para recorrer el array, conocemos su longitud con intArr.length
        //Entonces, iriamos desde 0... hasta length - 1 (que es el último índice del array)
        for (int i = 0; i <= intArr.length - 1; i++)
        {
            System.out.println("El elemento " + intArr[i]);

        }
        /**
        Declarar un array de char de tamaño 1000.
         Llenar TODAS  las posiciones con la letra "F"


         */

    }
}


