package SOLID.SRP.GoodPractise.DB;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectCreator {

    private static final Logger logger = Logger.getLogger(ObjectCreator.class.getName());
    
    public static Object query2Object(ResultSet result) {
        try {
        while (result.next()) {
            // Create an User Object using CreatorClass
        }
        } catch (Exception se) {
            logger.log(Level.SEVERE,se.getMessage(),se);
        }

        return null; //replace with object
    }
        
}
