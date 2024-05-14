package teoria4;

import teoria4.Model.ConexionBD;

import java.sql.SQLException;
import java.sql.Statement;

public class Teoria4 {
    public static void main(String[] args) {


        ConexionBD conexionBD = new ConexionBD("root", "", "bdempleados");

        conexionBD.conectarBD();

        try

        {
            Statement stmt = conexionBD.obtenerConexion().createStatement();

            int nFIlasAfectadas = stmt.executeUpdate("delete from empleados where id = 'emp4'");
            if (nFIlasAfectadas > 0){
                System.out.println("Fila eliminada correctamente");
            }else {
                System.out.println("no se ha eliminado registro");
            }


        } catch(
                SQLException e)

        {
            throw new RuntimeException(e);
        }
    }






}
