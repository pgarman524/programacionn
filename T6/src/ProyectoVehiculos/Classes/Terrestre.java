package ProyectoVehiculos.Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Terrestre extends Vehiculo {
    protected int ruedas;


// ----------------------------------------------------------
//                      CONSTRUCTOR
// ----------------------------------------------------------

    public Terrestre(String matricula, String modelo, int ruedas) {
        super(matricula, modelo);
        this.ruedas = ruedas;
    }

// ----------------------------------------------------------
//                          MÉTODOS
// ----------------------------------------------------------

@Override
public void setMatricula(String matricula) {
    Pattern pattern = Pattern.compile("\\d{4}\\d{3}[A-Z]]");
    Matcher matcher = pattern.matcher(matricula);

    if (matcher.find()) {
        this.matricula = matricula;

    } else {

    }
}

    @Override
    public void imprimir() {
        System.out.println("Matrícula: " + matricula +
                "\nModelo: " + modelo +
                "\nRuedas: " + ruedas);

    }

// ----------------------------------------------------------
//                      GETTER & SETTERS
// ----------------------------------------------------------


    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }


}
