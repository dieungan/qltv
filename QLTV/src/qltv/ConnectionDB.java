
package qltv;
import java.sql.*;
/**
 *
 * @author Ngan Sam
 */
public class ConnectionDB {
	public Connection getConnection() {
        Connection cn = null;
        String url = "jdbc:mysql://localhost:3306/quanlithuvien?autoReconnect=true&useSSL=false"; //xxx: ten database
        String userName = "root";
        String password = "ngan.nt165434";
        try {

            cn = DriverManager.getConnection(url, userName, password);
            System.out.println("success !!!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cn;
    }
    public static void main(String[] args) throws SQLException {
        ConnectionDB cn = new ConnectionDB();
        cn.getConnection();
    }

}
