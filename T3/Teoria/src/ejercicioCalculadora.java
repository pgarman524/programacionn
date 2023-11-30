
        /*
        Una calculadora con excepciones en *
         */
        import java.text.ParseException;
        import java.util.InputMismatchException;
        import java.util.Scanner;

        public class ejercicioCalculadora {
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

                            resultado = suma(num1,num2);
                            break;
                        }
                        case '-': {

                            resultado = resta(num1,num2);
                            break;
                        }
                        case '*': {
                            resultado = multiplicar(num1,num2);
                            break;
                        }
                        case '/': {
                            resultado  = dividir(num1, num2);
                            break;
                        }
                        case '%': {
                            resultado = porcentaje(num1,num2);
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
                    System.out.println("Error, lo siento");
                }



            }

            public static double dividir(double num1,double num2) throws ArithmeticException {
                double resultadoAux = 0.0;

                if (num2 == 0.0){
                    throw new ArithmeticException();
                }


                resultadoAux = num1 / num2;

                return resultadoAux;

            }

            public static double  multiplicar(double num1, double num2){
                double resultadoX = 0.0;

                if (num2 == 0.0){
                    throw new ArithmeticException();

                }
                resultadoX = num1 * num2;
                return resultadoX;
            }

            public static double resta (double num1,double num2){
                double resultadoO = 0.0;

                if (num1 == 0.0){
                    throw new ArithmeticException();

                }
                resultadoO = num1 - num2;
                return resultadoO;
            }

            public static double suma (double num1,double num2){
                double resultadoS = 0.0;

                if (num1 == 0.0){
                    throw new ArithmeticException();

                }
                resultadoS = num1 + num2;
                return resultadoS;
            }

            public static double porcentaje (double num1,double num2){
                double resultadoF = 0.0;

                if (num1 == 0.0){
                    throw new ArithmeticException();

                }
                resultadoF = num1 + num2;
                return resultadoF;
            }
        }
