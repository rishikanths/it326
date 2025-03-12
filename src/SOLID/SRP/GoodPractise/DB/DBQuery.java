package SOLID.SRP.GoodPractise.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBQuery {

    private Connection conn = null;
    private Statement stmt = null;
    private static final Logger logger = Logger.getLogger(DBQuery.class.getName());
    public DBQuery() {
        try {
            conn = DBConnection.getConnection();
        } catch (Exception se) {
            logger.log(Level.SEVERE,se.getMessage(),se);
        }
    }

    public Object dbQuery(String query) {
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException se) {
            logger.log(Level.SEVERE,se.getMessage(),se);
        }
        return ObjectCreator.query2Object(rs);
    }
}
