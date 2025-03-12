package SOLID.SRP.BadPractise;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;
/**
 * This example violates SRP principles as this class has two responsibilities not related to User
 * 1. Authentication
 * 2. Sending Email
 */
public class User {

    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private String userName = "";
    private String password = "";

    private final static Logger logger = Logger.getLogger(User.class.getName());

    public User(String fName, String lName, String email, String userName, String password) {
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    private Properties getEmailProperties() {
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "XXX");
        prop.put("mail.smtp.port", "XXX");
        prop.put("mail.smtp.auth", "XXX");
        prop.put("mail.smtp.socketFactory.port", "XXX");
        prop.put("mail.smtp.socketFactory.class", "XXXXX");

        return prop;
    }

    public void sendEmail(String toEmail, String subject, String body){
        try {
            Session session = Session.getDefaultInstance(getEmailProperties(), null);

            MimeMessage message = new MimeMessage(session); 
            message.setFrom(new InternetAddress(this.email)); 
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail)); 
            message.setSubject(subject); 
            message.setText(body); 
            Transport.send(message);
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public void login(String username, String password) {
        try {
            // Logic to authenticate the username and password to DB and verify the details.
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
    }
}
