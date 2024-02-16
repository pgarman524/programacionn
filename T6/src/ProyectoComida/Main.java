package ProyectoComida;

import ProyectoComida.Classes.api.Comida;
import ProyectoComida.Classes.impl.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Energia al principio del día
        int energia = 100;

        Scanner scan = new Scanner(System.in);
        System.out.println("""
                1. Programación
                2. Bases de datos
                3. Sistemas Informáticos
                4. Entorno de desarrollo
                5. Lenguajes
                                
                6. Hueso
                7. Lentejas
                8. Salchicha
                                
                9. Llegas tarde
                10. Parte
                11. ShutDownPc
                                
                0. Salir
                """);

        System.out.println("Indique el módulo: ");
        int opc = 1;

        while (opc != 0) {
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    energia = energia - 20;
                    break;
                case 2:
                    energia = energia - 50;
                    break;
                case 3:
                    energia = energia - 60;
                    break;
                case 4:
                    energia = energia - 45;
                    break;
                case 5:
                    energia = energia - 25;
                    break;
                case 6:
                    Comida huesoDePollo = new Hueso();
                    energia += energia + huesoDePollo.addNutricion();
                    break;
                case 7:
                    Lentejas platoLentejas = new Lentejas(true);
                    energia += energia + platoLentejas.addNutricion();
                    break;
                case 8:
                    Salchicha salchiPapa = new Salchicha();
                    energia += salchiPapa.addNutricion();
                    break;
                case 9:
                    LlegasTarde claseA = new LlegasTarde();
                    energia -= claseA.reduceEnergia();
                    break;
                case 10:
                    Parte parteACasa = new Parte();
                    energia += parteACasa.reduceEnergia();
                    break;
                case 11:
                    ShutDownPc atentoALaJugada  = new ShutDownPc();
                    energia -= atentoALaJugada.reduceEnergia();
                    break;
                case 0:
                    break;


            }
            System.out.println("Energia: " + energia);
            if (energia <= 0) {
                System.out.println("Tus Hp llegaron a 0, vas corriendo al centro pokemon más cercano");
            } else {
                System.out.println("Ahora sigues estando a tope de energy");
            }

        }


    }
}
