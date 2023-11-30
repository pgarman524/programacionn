package dia15_11Teoria.clasesDNI;

import dia15_11Teoria.clasesDNI.clases.VerificadorDNI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String dniUsuario = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el dni: ");
        dniUsuario = scan.next();

        boolean comprobarLetra = VerificadorDNI.comprobarLetra(dniUsuario);
        boolean comprobarLongitud = VerificadorDNI.comprobarLongitud(dniUsuario);
        boolean comprobarLetraCorrecta = VerificadorDNI.comprobarLetraCorrecta(dniUsuario);
        boolean comprobarParteNumerica = VerificadorDNI.comprobarParteNumerica(dniUsuario);

        if(comprobarLetra && comprobarLongitud && comprobarParteNumerica && comprobarLetraCorrecta){
            System.out.println("Su DNI es correcto, sosio.");

        }else{
            System.out.println("Su DNI es incorrecto.");
        }






    }
}
