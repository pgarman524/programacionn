package teoria3;

import java.sql.*;

public class teoria3 {
    public static void main(String[] args) {

        // 1. Crear base de datos con nombre --> bdInstituto
        // 2. Crear 2 Tablas --> Tabla estudiantes y Tabla asignaturas
        // 3. Tabla Estudiantes y Tabla Asignaturas:
            // (PK) id, correo: Varchar, nombre: varchar, nota_media: double
            // (PK) id, codigo: varchar, nombre: varchar, n_alumnos: int


        // Parte del app en java
        // 4. Crear conexión con la base de datos
        // 5. Visualizar todos los estudiantes del instituto
        // 6. Visualizar todos los estudiantes con una nota media menor que 9
        // 7. Visualizar todos los estudiantes con una nota media menor a 5
        // 8. Insertar un estudiante
        // 9. Eliminar al estudiante insertado en el paso 7
        // 10. Visualizar todas las asignaturas del instituto
        // 11. Insertar una nueva asignatura Religión
        // 12. Añadir alumno nuevo a la asignatura anterior


        String url = "jdbc:mysql://localhost:3306/bdInstituto?user=root&password=";


        try {
            //Creamos la conexión  con driverManager
            Connection connection = DriverManager.getConnection(url);

            //Paso 2 es crear  un objeto Statement
            Statement stmt = connection.createStatement();

            //Paso 3
            ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes");


            while (rs.next()) {

                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String correo = rs.getString("correo");
                String edad = rs.getString("nota_media");

                System.out.println("------------------------");
                System.out.println("id: " + id);
                System.out.println("nombre: " + nombre);
                System.out.println("correo: " + correo);
                System.out.println("edad: " + edad);
                System.out.println("");
            }
            Statement st2 = connection.createStatement();
            ResultSet rst = st2.executeQuery("SELECT * FROM estudiantes where nota_media < 9");


            while (rst.next()) {

                String id = rst.getString("id");
                String nombre = rst.getString("nombre");
                String correo = rst.getString("correo");
                String edad = rst.getString("nota_media");


                System.out.println("id: " + id);
                System.out.println("nombre: " + nombre);
                System.out.println("correo: " + correo);
                System.out.println("edad: " + edad);
                System.out.println("");
            }

            Statement st3 = connection.createStatement();
            ResultSet rst3 = st3.executeQuery("SELECT * FROM estudiantes where nota_media < 5");


            while (rst3.next()) {

                String id = rst3.getString("id");
                String nombre = rst3.getString("nombre");
                String correo = rst3.getString("correo");
                String edad = rst3.getString("nota_media");


                System.out.println("id: " + id);
                System.out.println("nombre: " + nombre);
                System.out.println("correo: " + correo);
                System.out.println("edad: " + edad);
                System.out.println("");
            }

            Statement stEliminador = connection.createStatement();
            stEliminador.executeUpdate("DELETE FROM `estudiantes` WHERE id = '5'");

            Statement stRegistro = connection.createStatement();
            stRegistro.executeUpdate("INSERT INTO estudiantes VALUES ('5','ignacio@ignacio.com','ignacio', 5.5)");

            Statement stEliminador2 = connection.createStatement();
            stEliminador2.executeUpdate("DELETE FROM `estudiantes` WHERE id = '5'");


            Statement st4 = connection.createStatement();
            ResultSet rs4 = st4.executeQuery("SELECT * FROM asignaturas");


            while (rs4.next()) {

                String id = rs4.getString("id");
                String codigo = rs4.getString("codigo");
                String nombre = rs4.getString("nombre");
                String n_alumnos = rs4.getString("n_alumnos");

                System.out.println("------------------------");
                System.out.println("id: " + id);
                System.out.println("nombre: " + codigo);
                System.out.println("correo: " + nombre);
                System.out.println("edad: " + n_alumnos);
                System.out.println("");
            }


            Statement stRegistros = connection.createStatement();
            stRegistros.executeUpdate("INSERT INTO asignaturas VALUES ('3','0003','Religión', 0)");

            Statement stRegistros2 = connection.createStatement();
            stRegistros2.executeUpdate("UPDATE asignaturas SET n_alumnos = '2' WHERE nombre = 'Religión'");


        }catch(SQLException e){
            e.printStackTrace();
        }



    }
}
