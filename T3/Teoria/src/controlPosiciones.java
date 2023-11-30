import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class controlPosiciones {
    public static void main(String[] args) {
        /*
        Contruye un programa que pida al usuario una cadena de texto.
        Acto seguido, solicita la posición de un carácter de la cadena de texto
        y lo imprime por pantalla. Controla las posibles excepciones producidas
        al acceder a posiciones inválidas de la cadena.
         */

        InputStreamReader flujo = new InputStreamReader(System.in); //Sirve para leer mejor los strings
        BufferedReader br = new BufferedReader(flujo); //Es como scanner scan, pero en los array tammbién cuentan los espacios en blanco y las frases completas


        Scanner scan = new Scanner(System.in);
        String cadena;
        int posc;

        try{


            System.out.println("Introduce el nombre");
            cadena = scan.nextLine();  //También lee los espacios de los array como carácter

            System.out.println("Introduce la posición del String: ");
            posc = scan.nextInt();

            System.out.println(cadena.charAt(posc)); //cadena.carAt("variable") --> para encontrar el char de la cadena



        }catch(IndexOutOfBoundsException e){

            System.out.println("Nope, crack");
        }catch (InputMismatchException e){
            System.out.println("NO NO NO");
        }catch(Exception e){
            System.out.println("Algo ha salido mal :C");
        }
    }




    }

