import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadoraMierder {
    public static void main(String[] args) {

        double num1= 0.0;
        double num2= 0.0;
        char op;
        double resultado = 0.0;
        Scanner scan = new Scanner(System.in);
try{
        System.out.print("Introduzca el primer num: ");
        num1 = scan.nextDouble();

        System.out.print("Introduzca el segundo num: ");
        num2 = scan.nextDouble();

        System.out.print("Introduzca el operador");
        op = scan.next().charAt(0); //Solo elge el carácter que esté en la posición 0

        switch (op){
            case '+': {

                resultado = num1 + num2;
                break;
            }
            case '-': {

                resultado = num1 - num2;
                break;
            }
            case '*': {
                resultado = num1 * num2;
                break;
            }
            case '/': {
                resultado  = dividir(num1, num2);
                break;
            }
            case '%': {
                resultado = num1 % num2;
                break;
            }
            default: {

                System.out.println("No se ha introducido un operador correcto.");
                break;
            }
        }
    System.out.println("El resultado es: "+resultado);
    }catch (InputMismatchException e){
    System.out.println("Introduzca un número por favor...");
    }catch (ArithmeticException e){
    System.out.println("Eror, lo siento");
    }



    }

    public static double dividir(double num1,double num2) throws ArithmeticException{
    double resultadoAux = 0.0;


    if (num2 == 0.0){
        throw new ArithmeticException();
    }


    resultadoAux = num1 / num2;

    return resultadoAux;

    }

}
