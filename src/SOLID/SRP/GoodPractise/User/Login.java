package SOLID.SRP.GoodPractise.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {

    private static final Logger logger = Logger.getLogger(Login.class.getName());

    public boolean login(User user) {
        try {
            // Logic to verify the user credentials.
            logger.log(Level.INFO,"Login in Successful");
        } catch (Exception se) {
            logger.log(Level.SEVERE,se.getMessage(),se);
            return false;
        }
        return true;
    }

    
}
