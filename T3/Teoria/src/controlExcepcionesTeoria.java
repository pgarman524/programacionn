import java.util.InputMismatchException;
import java.util.Scanner;

public class controlExcepcionesTeoria {
    public static void main(String[] args) {
        /*
        Las excepciones son códigos creados por si alguna vez ocurre un error que haga lo que le hayas colocado en este


        Exception ---> la más  genérica
        IndexOutOfBoundsException ---> Es la excepción que aparece cuando en un array hay más números de los que esta puede almacenar
        ArithmeticException ---> Cuando intentas dividir por 0 por ejem, es la típica de la calculadora.
        IllegalArgumentException ---> Cuando colocas un valor que no es el adecuado en una variable
        InputMismatchException ---> """""
        NullPointerException ---> Cuando intentas crear algo que aún no existe



***********************
   try {
           //hacer algo

       } catch ("alguna de las excepciones mostradas anteriormente" e){
       e.printStackTrace();
       sout("algo malo ha pasado");
       }
         */
        /* try{

            int a=2;
            int b= 0;
            int division = a/b;


    } catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }

        System.out.println("Estoy aquí");

    }*/


        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2= 0;

        do {
            try{

                System.out.println("Introduzca el primer num: ");
                num1 = scan.nextInt();
                System.out.println("Introduzca el divisor:  ");
                num2 = scan.nextInt();

                System.out.println("La  división es: "+ (num1/num2));

            }catch (ArithmeticException e ){
                System.out.println("¡No se puede, payasx!");
            } catch(InputMismatchException e){
                System.out.println("¡No se puede, tuercebotas!");
                scan.nextLine();//Sirve para saltar de línea
            }finally {
                //Siempre se ejecuta al final.
               // scan.close(); //borra la memoria ram que esté usando el scan
                num1=0;
                num2=0;
            }



        } while (true);
    }
}
