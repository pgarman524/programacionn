import java.util.Scanner;
/*Nombre:  Pablo
      Apellidos: García Mangana
      Actividad: Mayor o menor de edad?
               */
public class Edad {
        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
            int edad = scan.nextInt();
//sencillito, utilizamos un mayor que "edad" para saber si en efecto eres mayor de edad o un menor que "edad" si por el contrario eres más pequeño
            if (edad>18){
                System.out.println("Eres mayor de edad");
            }
            if (edad<18){
                System.out.println("Eres menor de edad");
            }

        }
    }

