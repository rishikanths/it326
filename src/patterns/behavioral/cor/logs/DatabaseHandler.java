package patterns.behavioral.cor.logs;

import java.util.logging.Level;

public class DatabaseHandler extends LogHandler {

    @Override
    public boolean log(Level level, Exception e) {
        if (level == Level.WARNING || level == Level.SEVERE)
            System.out.println("Logged the exception to the database");
        
        return checkNext(level,e);
    }
}
