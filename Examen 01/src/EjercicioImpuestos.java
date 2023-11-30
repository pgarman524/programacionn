/*
Nombre: Pablo
Apellidos: García Mangana
Ejercicio número 4
*/

import java.util.Scanner;

public class EjercicioImpuestos {
    public static void main(String[] args) {
        //Aquí empieza el main

        //declaramos el valor del salario y creamos un scanner para introducir las horas
        int hora;
        int salario = 20;

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce las horas semanales:  ");
        hora = scan.nextInt();

        //declaramos el salario * las horas trabajadas
        double salarioNetoSemanal = (hora * salario);
        int horaExtraSemanal;
        double salarioExtra;



        //No sabía que necesitaba saber de matemáticas para programar JAJAsalu2 :b
        if (salarioNetoSemanal<500){
        //aquí faltan cosas, pero no sé resolverlas en papel. Menos en máquina.
        }



        //Aquí estarían las fórmulas resueltas para saber el dinero que consigues con horas extra

       else if ( hora > 35){
            horaExtraSemanal = hora - 35;
            salarioExtra = horaExtraSemanal * (salario*0.15);
            double salarioTotal1 = salarioExtra  + salarioNetoSemanal;
            System.out.println("Su salario final es de: "+salarioTotal1);

        }

       else { //si no llegamos a 35 horas semanales
            System.out.println("Su salario es de: "+salarioNetoSemanal);
        }
    }
}
