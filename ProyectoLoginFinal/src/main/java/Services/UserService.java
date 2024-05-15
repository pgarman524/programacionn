package Services;

import Model.db.ConectarDB;
import Ui.Panels.PanelLogin;
import Utils.CredentialsDB;

import java.sql.*;

public class UserService {
    private ConectarDB conexionDB;

    public UserService() {
        //Crear objeto ConectarBD
        //Realizar conexión
        conexionDB = new ConectarDB(CredentialsDB.USER,CredentialsDB.PASS,CredentialsDB.DB_NAME);
        ConectarDB c = new ConectarDB();
    }

    public boolean checkUserExists(user User) {
        String url = "jdbc:mysql://localhost:3306/bdapp?user=root&password=";

        try{

            Connection connection = DriverManager.getConnection(url);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT correo FROM usuarios");

            Statement st2 = connection.createStatement();
            ResultSet rst = st2.executeQuery("SELECT pass FROM usuarios");

            while (rs.next()  && rst.next()){
            if (rs.equals(conexionDB.obtenerConexion())){

            }



            }






        }catch (SQLException e){
            e.printStackTrace();
        }


        return false;
    }




}
