import java.util.Scanner;

public class palindromoEjercicio {
    //Crear un programa que al introducir un palíndromo este lo detecte y diga si lo es o no lo es

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        String cadena;
        cadena = scan.next();
        String caden2 = "";
        //Con esta fórmula hace que el string se lea del revés
        for (int i = cadena.length()-1;  i>= 0; i--){
        //Transformas caden2 en la  palabra del revés usando cadena.charAt(i)
        caden2 = caden2 + cadena.charAt(i);
        }
        if (cadena.equals(caden2)){
            System.out.println("palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }

    }}
