package patterns.behavioral.cor.logs;

import java.util.logging.Level;

public abstract class LogHandler { 

    protected LogHandler next;

    public static LogHandler logChain(LogHandler start,LogHandler... handlers){
        LogHandler first = start;
        for(LogHandler h:handlers){
            first.next = h;
            first = h;
        }
        return start;
    }

    public abstract boolean log(Level level, Exception e);
    
    protected boolean checkNext(Level level, Exception e){
        if(next == null)
            return true;

        return next.log( level,  e);
    }
} 
    
