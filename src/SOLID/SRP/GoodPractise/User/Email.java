package SOLID.SRP.GoodPractise.User;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Email {

    private static final Logger logger = Logger.getLogger(Email.class.getName());

    public static boolean email(User user, String toEmail, String message, String title) {
        try {
            // get email from the user object
            // Logic to send email.
            logger.log(Level.INFO,"Sent the email");
        } catch (Exception se) {
            logger.log(Level.SEVERE,se.getMessage(),se);
            return false;
        }
        return true;
    }

}
