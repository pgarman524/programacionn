package teoria5.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarDBT5 {
    private String user, pass, dbName, url;
    private Connection connection;

    public ConectarDBT5(String user, String pass, String dbName) {
        this.user = user;
        this.pass = pass;
        this.dbName = dbName;

        this.url = "jdbc:mysql://localhost:3306/" + this.dbName + "?user=" + this.user + "&password=" + this.pass;

    }

    /**
     * Método que realiza la conexión a la base de datos. Almacena dicha conexión en el atributo connection
     */
    public void realizarConexion() {
        try {
            if (this.connection == null) {
                this.connection = DriverManager.getConnection(this.url);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void realizarDesconexion() {
        try {
            if (this.connection != null) {
                this.connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Connection obtenerConexion() {
        return connection;
    }
}
