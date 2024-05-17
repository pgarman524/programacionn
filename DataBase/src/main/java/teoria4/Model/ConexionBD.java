package teoria4.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {


    private String user;
    private String password;
    // ESTA ES LA URL DE CONEXIÓN a la bd
    private String url;
    private String BD;

    // IMPORTANTE
    // ESTE ATRIBUTO ES EL QUE VA A CONTENER LA CONEXIÓN A LA BASE DE DATOS
    private Connection connection;

    public ConexionBD(String user, String password, String BD) {
        // SE DEBERiAN COMPROBAR LAS CREDENCIALES DE CONEXIÓN
        this.BD = BD;
        this.user = user;
        this.password = password;
        this.url = "jdbc:mysql://localhost:3306/"+this.BD+"?user="+this.user+"&password="+this.password;
    }

    public void conectarBD() {
        try {
            this.connection = DriverManager.getConnection(this.url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void desconectarBD() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //GETTER
    public Connection obtenerConexion() {
        return this.connection;
    }
}

