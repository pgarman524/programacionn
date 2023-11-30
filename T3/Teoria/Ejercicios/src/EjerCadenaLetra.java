import java.util.Scanner;

public class EjerCadenaLetra {
    public static void main(String[] args) {
        /**
         * Vamos a hacer un programa, que dado un String... cuente cuántas vocales
         * de cada tipo tiene.
         *
         * Ejem:
         * String cadena = "Hola Mundo"
         *
         * ... Se ejecuta el programa
         *
         * Tiene 1 a
         * Tiene 0 e
         * Tiene 0 i
         * Tiene 2 o
         * Tiene 1 u
         *
         * Palabra a hacer --> Murciélago
         */
        Scanner scan =new Scanner(System.in);

        System.out.println("Introduce una palabra: ");

        String mur = scan.next();
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;

        int contU = 0;

        for(int i = 0; i <= mur.length()-1; i++){
            if (mur.charAt(i) == 'a' ||mur.charAt(i) == 'A'){
                contA ++;
            }else if (mur.charAt(i) == 'e'||mur.charAt(i) == 'E'){
                contE ++;
            } else if (mur.charAt(i) == 'i'||mur.charAt(i) == 'I'){
            contI ++;
        }else if (mur.charAt(i) == 'o'||mur.charAt(i) == 'O'){
            contO ++;
            }else if (mur.charAt(i) == 'u'||mur.charAt(i) == 'U'){
                contU ++;
            }

            }


        System.out.println("Tenemos "+contA+" a, "+contE+" e, "+contI+" i, "+contO+ " o, "+contU+ " u.");
    }


    }

