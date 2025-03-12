package SOLID.SRP.BadPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * This example violates SRP principles as this class has three responsibilities
 * 1. Connecting to the datbase
 * 2. Querying the database
 * 3. Converintg the ResultSet to a Java Object
 */
public class DBExample {
      private final String DB_URL = "jdbc:oracle:thin:@10.110.10.90:1521:oracle";
      private final String username = "IT32601";
      private final String password = "ask63";
      private Connection connection = null;
      private Statement stmt = null;

      private static final Logger logger = Logger.getLogger(DBExample.class.getName());

      public DBExample() {
            try{
                  connection = DriverManager.getConnection(DB_URL, username, password);
                  System.out.println("Connected & Closing");
                  connection.close();
            }catch(SQLException se){
                  logger.log(Level.SEVERE,se.getMessage(),se);
            }
            catch(Exception se){
                  logger.log(Level.SEVERE,se.getMessage(),se);
            }
      }

      public Object dbQuery(String query) {
            try{
                  stmt = connection.createStatement();
                  ResultSet rs = stmt.executeQuery(query);
                  while(rs.next()){
                        // Logic to creata an Java Object based on the values
                  }
                  return null;
            }
            catch(SQLException se){
                  logger.log(Level.SEVERE,se.getMessage(),se);
            }
            return null;
      }
}