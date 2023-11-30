import java.util.Scanner;

public class iterativas02 {
    public static void main(String[] args) {

        int num;
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("Por favor, introduzca un número negativo: ");
            num = scan.nextInt();

            System.out.println("");


        }while  (num > 0);
        System.out.println("Es negativo.");}

}
