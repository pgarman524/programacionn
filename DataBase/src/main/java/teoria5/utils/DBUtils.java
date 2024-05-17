package teoria5.utils;

public class DBUtils {
    public  static final String DB_NAME = "bdapp";
    public static final String USER = "root";
    public static final String PASS = "";

    //Querys de la aplicación
    public static  String QUERY_LOGIN = "select * from usuarios where id = ? and pass = ?";
    public static String QUERY_CHECK_IN_ACCESOS = "select * from accesos where id = ?";
    public static String QUERY_INSERTAR_USER_IN_ACCESOS = "insert into  accesos values(?, ?)";
    public static String QUERY_UPDATE_NACCESOS = "update accesos set n_accesos = n_accesos + 1";


}
