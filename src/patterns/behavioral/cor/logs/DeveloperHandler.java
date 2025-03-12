package patterns.behavioral.cor.logs;

import java.util.logging.Level;

public class DeveloperHandler extends LogHandler {

    @Override
    public boolean log(Level level, Exception e) {
        if (level == Level.SEVERE)
            System.out.println("Emailing the developer");
        
        return checkNext(level,e);
    }
}
