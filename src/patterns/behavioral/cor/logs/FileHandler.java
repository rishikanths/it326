package patterns.behavioral.cor.logs;

import java.util.logging.Level;

public class FileHandler extends LogHandler {

    @Override
    public boolean log(Level level, Exception e) {
        if (level == Level.INFO)
            System.out.println("Logged the exception");
        
        return checkNext(level,e);
    }
    
    
}
