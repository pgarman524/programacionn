package ProyectoVehiculos.Classes;

public class Vehiculo {
    protected String matricula;

    protected String modelo;

// ----------------------------------------------------------
//                      CONSTRUCTOR
// ----------------------------------------------------------

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }



// ----------------------------------------------------------
//                      GETTER & SETTERS
// ----------------------------------------------------------

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void imprimir(){

    };
}
