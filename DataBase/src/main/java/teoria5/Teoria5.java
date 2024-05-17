package teoria5;

import teoria5.model.ConectarDBT5;
import teoria5.utils.DBUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Teoria5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("User: ");
        String user = scan.nextLine();

        System.out.println("Pass: ");
        String pass = scan.nextLine();

        //Realizar la conexión
        ConectarDBT5 cn = new ConectarDBT5(DBUtils.USER, DBUtils.PASS, DBUtils.DB_NAME);
        //Estableces la Url
        cn.realizarConexion();

        // Crear un objeto Statement
        try {
            // Crear un objeto PreparedStatement con la query

            PreparedStatement pst = cn.obtenerConexion().prepareStatement(DBUtils.QUERY_LOGIN);

            // Meter los parámetros
            //(el número del parámetro, el parámetro en sí)
            pst.setString(1, user);
            pst.setString(2, pass);

            // EJecutar la query
            ResultSet rs = pst.executeQuery();

            // Leer los resultados
            if (rs.next()) {
                System.out.println("Bienvenido");
            } else {
                System.out.println("No estás registrado");
            }

            // Cerrar la  conexión
            cn.realizarDesconexion();

        } catch (SQLException e) {

        }


    }

}
