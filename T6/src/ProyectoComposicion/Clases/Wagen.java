package ProyectoComposicion.Clases;

public class Wagen {
    private String modelo;
    private String marca;
    private Volk propietario;

    public Wagen(String modelo, String marca, Volk propietario) {
        this.modelo = modelo;
        this.marca = marca;
        this.propietario = propietario;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Volk getPropietario() {
        return propietario;
    }

    public void setPropietario(Volk propietario) {
        this.propietario = propietario;
    }
}
