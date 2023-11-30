package dia20_11Teoria;

import dia20_11Teoria.clases.Coche;

public class main {
    public static void main(String[] args) {

    //Encendemos la aplicación
        //creación de objeto suvAlvaro
        Coche  suvAlvaro = new Coche();
        //Le damos valores a  los atributos de suvAlvaro
        suvAlvaro.nRuedas = 4;
        suvAlvaro.nPuertas = 5;
        suvAlvaro.nluces = 4;
        suvAlvaro.motor = "diesel";
        suvAlvaro.nBastidor = "AV12345eW";
        suvAlvaro.propietario = "Álvaro";


        //Creación de objeto mercededAngel
        Coche mercededAngel =new Coche();

        //le damos valores a los atributos de mercededAngel
        mercededAngel.nRuedas = 6;
        mercededAngel.nPuertas = 5;
        mercededAngel.nluces = 4;
        mercededAngel.motor = "gasolina";
        mercededAngel.nBastidor = "ER238950k";
        mercededAngel.propietario = "Ángel";

        //Llamamos al método imprimirDatosVehiculo() DE SUVALVARO y MERCEDEDANGEL
        suvAlvaro.imprimirDatosVehiculo();
        mercededAngel.imprimirDatosVehiculo();
    }
}
