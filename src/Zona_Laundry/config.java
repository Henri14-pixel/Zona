package zona_laundry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Henri
 */
public class config {
    private static  Connection mysqlconfig;
    public static  Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/db_zonalaundry"; //Url Database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    mysqlconfig=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
        return mysqlconfig;
    }
}
