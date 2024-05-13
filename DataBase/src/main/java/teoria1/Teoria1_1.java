package teoria1;

import java.sql.*;

public class Teoria1_1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/alumnos?user=root&password=";
        try {
            Connection connection = DriverManager.getConnection(url);

            Statement stmt = connection.createStatement();

            // Lanzar query
            ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes");

            // Leer resultado
            while (rs.next()){
                String nombre = rs.getString("nombre");
                System.out.println(nombre);
            }

            // Cerrar conexión
            connection.close();
        } catch (SQLException e) {

        }


    }
}
