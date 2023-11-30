import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
                  /*Nombre:  Pablo
        Apellidos: García Mangana
        Actividad: Cuál de los tres números es el mayor?
                 */
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();

        Scanner scan3 = new Scanner(System.in);
        int num3 = scan3.nextInt();
    //para que estas condicones sean las acertadas tenemos que usar & ya que | me ha dado fallos. ¿Por qué? Porque | significa que una de las condiciens ha de ser true para ser cierta, minetras que & las dos han de serlo.
        if ((num1 > num2)&(num1 > num3)){
            System.out.println("El número mayor es: "+num1);
        } else if ((num2 > num1)&(num2 > num3)) {
            System.out.println("El número mayor es: "+num2);
        }
        else if ((num3 > num1)&(num3 > num2)) {
            System.out.println("El número mayor es: "+num3);
        }
    }


    }


