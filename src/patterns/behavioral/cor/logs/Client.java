package patterns.behavioral.cor.logs;

import java.util.logging.Level;

public class Client {
    
    public static void main(String args[]) {

        LogHandler fh = new FileHandler();
        LogHandler dbh = new DatabaseHandler();
        LogHandler dh = new DeveloperHandler();
        
        LogHandler handler = LogHandler.logChain(fh, dbh,dh);

        handler.log(Level.INFO, new SecurityException("Failed auto balancer"));
    }

}
