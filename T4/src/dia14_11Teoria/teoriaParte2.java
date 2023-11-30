package dia14_11Teoria;

public class teoriaParte2 {
    public static void main(String[] args) {

        String dniaAprobar1 = "12345678A"; //Uno que tiene que dar true
        String dniaAprobar2 = "123X5678A"; //Uno que tiene que dar false

        boolean validez1 = Teoria.comprobarParteNumerica(dniaAprobar1);
        boolean validez2 = Teoria.comprobarParteNumerica(dniaAprobar2);
        if (validez1) {
            System.out.println("El dni " + dniaAprobar1 + " es correcto.");
        } else {
            System.out.println("El dni " + dniaAprobar1 + " es incorrecto.");
        }

        if (validez2){
            System.out.println("El dni " + dniaAprobar2 + " es correcto.");
        } else {
            System.out.println("El dni " + dniaAprobar2 + " es incorrecto.");
        }
    }
}
