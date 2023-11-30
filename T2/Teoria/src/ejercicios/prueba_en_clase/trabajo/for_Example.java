package ejercicios.prueba_en_clase.trabajo;

public class for_Example {
    public static void main(String[] args) {
        /*
        Escribir un programa que muestre los 2000 numeros enteros positivos
        El 0 no  es positivo
         */

        //for (variable de control; condicion; incrementador)
        for ( int i = 1; i <= 2000; i ++){
            System.out.println("Número" + i);

            //i solo existe dentro del bucle for
        }
         for (int i = -1; i >= -2000; i --){
        System.out.println("Numero" + i);
    }
    }
}
