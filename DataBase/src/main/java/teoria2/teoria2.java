package teoria2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class teoria2 {
    public static void main(String[] args) {

        // Primero creamos la url para conectarse a localhost
        String url = "jdbc:mysql://localhost:3306/bdempleados?user=root&password=";


        try {
            //Creamos la conexión  con driverManager
            Connection connection = DriverManager.getConnection(url);

            //Paso 2 es crear  un objeto Statement
            Statement stmt = connection.createStatement();

            //Paso 3
            //Este execute es el que usamos mejor
            //Este execute solo devuelve un boolean
            // stmt.execute("");
            // Esto es un puntero que va a moverse por el "array" de la base de datos o por las filas
            ResultSet rs = stmt.executeQuery("SELECT * FROM empleados");

            while (rs.next()) {

                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String correo = rs.getString("correo");
                String edad = rs.getString("edad");
                String isAdmin = rs.getString("isAdmin");

                System.out.println("id: " + id);
                System.out.println("nombre: " + nombre);
                System.out.println("correo: " + correo);
                System.out.println("edad: " + edad);
                System.out.println("IsAdmin: " + isAdmin);
                System.out.println("");
            }

            //cada vez que necesites una query debes crear un statement nuevo
            Statement st2 = connection.createStatement();

            //Prueba
            ResultSet rs2 = st2.executeQuery("SELECT * FROM empleados WHERE edad < 30");
            while (rs2.next()) {

                String id = rs2.getString("id");
                String nombre = rs2.getString("nombre");
                String correo = rs2.getString("correo");
                String edad = rs2.getString("edad");
                String isAdmin = rs2.getString("isAdmin");

                System.out.println("id: " + id);
                System.out.println("nombre: " + nombre);
                System.out.println("correo: " + correo);
                System.out.println("edad: " + edad);
                System.out.println("IsAdmin: " + isAdmin);
                System.out.println("");
            }

            //Consulta para obtener los registros de los empleados con nombre Diego
            Statement stDiego = connection.createStatement();
            ResultSet rsDiego = stDiego.executeQuery("SELECT * FROM empleados WHERE nombre = 'Diego'");
            while (rsDiego.next()) {

                String id = rsDiego.getString("id");
                String nombre = rsDiego.getString("nombre");
                String correo = rsDiego.getString("correo");
                String edad = rsDiego.getString("edad");
                String isAdmin = rsDiego.getString("isAdmin");

                System.out.println("id: " + id);
                System.out.println("nombre: " + nombre);
                System.out.println("correo: " + correo);
                System.out.println("edad: " + edad);
                System.out.println("IsAdmin: " + isAdmin);
                System.out.println("");
            }


            //Visualizar Empleados mayores de 30
            //Visualizar Empleados mayores de 30 y que sean admin
            //Insertar un Registro
                // - emp8, Patricia, patricia@patricia.com, 24, true
            Statement stEmpleados = connection.createStatement();
            ResultSet rsEmpleados = stEmpleados.executeQuery("SELECT * FROM empleados WHERE edad > 30");
            while (rsEmpleados.next()) {

                String id = rsEmpleados.getString("id");
                String nombre = rsEmpleados.getString("nombre");
                String correo = rsEmpleados.getString("correo");
                String edad = rsEmpleados.getString("edad");
                String isAdmin = rsEmpleados.getString("isAdmin");

                System.out.println("id: " + id);
                System.out.println("nombre: " + nombre);
                System.out.println("correo: " + correo);
                System.out.println("edad: " + edad);
                System.out.println("IsAdmin: " + isAdmin);
                System.out.println("");
            }


            Statement stEmpleados2 = connection.createStatement();
            ResultSet rsEmpleados2 = stEmpleados2.executeQuery("SELECT * FROM empleados WHERE edad > 30 and isAdmin = 1");
            while (rsEmpleados2.next()) {

                String id = rsEmpleados2.getString("id");
                String nombre = rsEmpleados2.getString("nombre");
                String correo = rsEmpleados2.getString("correo");
                String edad = rsEmpleados2.getString("edad");
                String isAdmin = rsEmpleados2.getString("isAdmin");

                System.out.println("id: " + id);
                System.out.println("nombre: " + nombre);
                System.out.println("correo: " + correo);
                System.out.println("edad: " + edad);
                System.out.println("IsAdmin: " + isAdmin);
                System.out.println("");
            }

            //Para añadir a alguien en la data Base -->
            Statement stRegistro = connection.createStatement();
            stRegistro.executeUpdate("INSERT INTO empleados VALUES ('emp8','Patricia','patricia@patrcia.com', 24, 1)");
            ResultSet rsRegistro = stRegistro.executeQuery("SELECT * from empleados where nombre = 'Patricia'");
            while (rsRegistro.next()) {

                String id = rsRegistro.getString("id");
                String nombre = rsRegistro.getString("nombre");
                String correo = rsRegistro.getString("correo");
                String edad = rsRegistro.getString("edad");
                String isAdmin = rsRegistro.getString("isAdmin");

                System.out.println("id: " + id);
                System.out.println("nombre: " + nombre);
                System.out.println("correo: " + correo);
                System.out.println("edad: " + edad);
                System.out.println("IsAdmin: " + isAdmin);
                System.out.println("");
            }


            //Cerramos la conexión
            connection.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
        ;

    }
}
