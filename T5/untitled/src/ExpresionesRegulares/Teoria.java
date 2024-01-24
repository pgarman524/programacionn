package ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teoria {
    public static void main(String[] args) {
        //Para usar expresiones regulares en java se necesitan dos clases:
        //La clase Pattern --------- Pattern pattern = Pattern.compile("La expresión regular");
        //La clase Matcher ---------  Matcher matcher = pattern.matcher(expresión a evaluar);


        Pattern pattern = Pattern.compile("\\d{8}(\\s|-)?[a-zA-z]"); //Expresión regular para DNI
        String dni = "72719275F";
        Matcher matcher = pattern.matcher(dni);

        //Para ya comprobarlo completamente para que os diga true or false se usa e método --- .find()

        if (matcher.find()) {
            System.out.println("El DNI es válido");
        } else {
            System.out.println("El DNI no es válido");
        }


        //Hacer una expresión regular para comprobar una IP válida con este formato:
        //ej: 192.168.189.190


        Pattern pattern2 = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}\\.\\d{3}$");
        String ip = "192.168.189.190";
        Matcher matcher2 = pattern2.matcher(ip);

        if (matcher2.find()) {
            System.out.println("Es válido");
        } else {
            System.out.println("No lo es");
        }

        //Dos exp reg:
        //1º Un número de teléfono
        //950475192 -> válido
        //950 47 51 92 -> válido

        Pattern pattern3 = Pattern.compile("^\\d{3}\\s?(\\d{2}\\s?){2}\\d{2}$");
        Pattern pattern4 = Pattern.compile("^\\d{9}$");

        String num = "950 47 51 92";
        String num1 = "950475192";

        Matcher matcher3 = pattern3.matcher(num);

        Matcher matcher4 = pattern4.matcher(num1);

        if (matcher3.find() && matcher4.find()) {
            System.out.println("Es válido, lo es");
        } else {
            System.out.println("No lo es, no no");
        }

        //2º Dirección de correo electrónico
        // Cualquier carácter seguido de @ seguido de gmail o hotmail seguido de . seguido de com o es

        Pattern pattern5 = Pattern.compile(".+@(gmail|hotmail)\\.(com|es)$");
        String mail = "elreshulon696@gmail.com";
        Matcher matcher5 = pattern5.matcher(mail);

        if (matcher5.find()) {
            System.out.println("Es válido, lo es si si si");
        } else {
            System.out.println("No lo es, no no. NOOOO");
        }

        //expresión regular solo para la fecha -->
        //  ^((3[0-1])|([0-2][1-9])|([1-2]0))(-|\/)(0[0-9]|1[0-2])(-|\/)([0-1][0-9]{3}|20[0-2][0-4])$

    }
}
