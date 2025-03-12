package patterns.behavioral.observer;

import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.Timespan;

public class ConsoleObserver implements Observer {

    private static final Logger logger = Logger.getLogger(ConsoleObserver.class.getSimpleName());
    private String name = "";

    public ConsoleObserver(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        if (message.isEmpty()) {
            logger.log(Level.WARNING, "Empty Message");
        } else {
            logger.log(Level.INFO, message);
        }
    }

    @Override
    public String observerName() {
        return this.name;
    }
}
