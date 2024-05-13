package teoria1;

import java.sql.*;

public class Teoria1 {
    public static void main(String[] args) throws SQLException {
        try {
            // Primero creamos la url para conectarse a localhost
            String url = "jdbc:mysql://localhost:3306/BD?user=root&password=";
            //Creamos la conexión  con driverManager
            Connection connection = DriverManager.getConnection(url);

            //Paso 2 es crear  un objeto Statement
            Statement stmt = connection.createStatement();

            //Paso 3
            //Este execute es el que usamos mejor
            stmt.executeQuery("SELECT * FROM alumnos");
            //Este execute solo devuelve un boolean
            // stmt.execute("");

            // Esto es un puntero que va a moverse por el "array" de la base de datos o por las filas
            ResultSet rs = null;
            //Te devuelve el nombre del alumno de la columna nombre
            rs.getString("nombre");
            //También se puede usar este para coger el index de la columna:
            //rs.getString("1");

            //Con esto pasamos al siguiente registro
            rs.next();

            //Para hacer un bucle que vaya moviéndose por las columnas
            while (rs.next()){
                System.out.println(rs.getString("nombre"));
            }





        }catch (Exception e){

        };

    }

}
