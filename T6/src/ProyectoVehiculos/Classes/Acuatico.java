package ProyectoVehiculos.Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Acuatico extends Vehiculo{
protected String eslora;
// ----------------------------------------------------------
//                      CONSTRUCTOR
// ----------------------------------------------------------

    public Acuatico(String matricula, String modelo, String eslora) {
        super(matricula, modelo);
        this.eslora = eslora;
    }

// ----------------------------------------------------------
//                          MÉTODOS
// ----------------------------------------------------------
@Override
public void setMatricula(String matricula) {
    Pattern pattern = Pattern.compile("^[a-zA-Z]{3,10}$");
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
                "\nEslora: " + eslora);

    }


// ----------------------------------------------------------
//                      GETTER & SETTERS
// ----------------------------------------------------------


    public String getEslora() {
        return eslora;
    }

    public void setEslora(String eslora) {
        this.eslora = eslora;
    }


}
