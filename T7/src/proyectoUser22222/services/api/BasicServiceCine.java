package proyectoUser22222.services.api;

import proyectoUser22222.model.Butaca;

public interface BasicServiceCine {

    public void mostrarButacas();

    public boolean comprarEntrada();

    public boolean devolverEntrada();

    public boolean checkComprador(String idUser);

    public void leerFicheroUsers();
    public void anadirFicheroButaca(Butaca b);
    public void modificarFicheroCine();


}
