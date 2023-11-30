import java.util.Scanner;
public class Calculadora {
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Hola  matemático, ¿me podrías dar el radio del círculo?");
		
		double radio = 0.0; 
		radio = scan.nextDouble();
		double longitud = 0.0; 
		longitud = 2*3.14*radio;
		
		System.out.println("El resultado es:");
		System.out.println(longitud);

	}	

}