package dia20_11Teoria.clases;

public class Coche {

    //Atributos de clase

    public int nRuedas;
    public int nPuertas;
    public int nluces;
    public String motor;
    public String nBastidor;
    public String tipoCarroceria;
    public String propietario;


    //Métodos de clase
    public  void desplazar(boolean esMarchaAtras){
        if (esMarchaAtras ==false){
            System.out.println("Camino hacia delante");
        }else {
            System.out.println("camino hacia atrás");
        }
    }

    public  void frenar() {
        System.out.println("Frenando el coche");
    }

    public void acelerar(){
        System.out.println("Acelerando");
    }

    public void arrancar(){
        System.out.println("Arrancando");
    }

    public void imprimirDatosVehiculo(){
        System.out.println(
                "\n- Propietario: "+this.propietario
                + "\n- Bastidor: "+this.nBastidor
        );

    }
}
