import java.util.Scanner;

public class loginMejorado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arrNombre = new String[5];
        String[] arrPass = new String[5];

//ARRAY UNIdimensionallllllll********************

        arrNombre[0] = "juanitox";
        arrPass[0] = "juanitox23";

        arrNombre[1] = "Robertin";
        arrPass[1] = "Robx23";

        arrNombre[2] = "Pablete";
        arrPass[2] = "Pablesx23#";

        arrNombre[3] = "Brunxouuu";
        arrPass[3] = "123Sº2sc#";

        arrNombre[4] = "123Sº2sc#";
        arrPass[4] = "Brunxouuu";

        arrNombre[5] = "Elxulomaki";
        arrPass[5] = "Resdp";

            int eleccion = 0;
            String pedirUser;
            String pedirPass;

            do {


        System.out.println("Elige lo que quieres hacer: ");
        System.out.println("1. Login");
        System.out.println("2. Registro");
        System.out.println("3. Baja");
        System.out.println("0. Salir");
                eleccion = scan.nextInt();
        switch (eleccion) {

            case 1:
                do {
                    System.out.println("Hola, introduzca su usuario: ");
                    pedirUser = scan.next();
                    System.out.println("Hola, introduzca su pass: ");
                    pedirPass = scan.next();
                    if (arrPass[0] == arrPass[1]){

                        System.out.println("Acceso denegado");
                    }
                }while (!pedirUser.equals(arrPass[0])|| !pedirPass.equals(arrPass[0]));


                break;


        }

            }while (eleccion!=0);


    }
}
