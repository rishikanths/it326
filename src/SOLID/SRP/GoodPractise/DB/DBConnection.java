package SOLID.SRP.GoodPractise.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    private final String DB_URL = "jdbc:oracle:thin:@10.110.10.90:1521:oracle";
    private final String USER = "IT32601";
    private final String PASS = "ask63";
    private static Connection conn = null;

    private static DBConnection connection = null;
    private static final Logger logger = Logger.getLogger(DBConnection.class.getName());
    private DBConnection() {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception se) {
            logger.log(Level.SEVERE,se.getMessage(),se);
        }
    }

    public static Connection getConnection(){
        return conn;
    }

    public static synchronized DBConnection getDBConnection() {
        if (connection == null)
            connection = new DBConnection();
        return connection;
    }

}
