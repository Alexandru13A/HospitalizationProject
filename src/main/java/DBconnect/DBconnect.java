package DBconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {

    private static final String URL = "jdbc:mysql://localhost/hospital";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection conn;

    public static Connection connectToDatabase() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        return conn;
    }
}
