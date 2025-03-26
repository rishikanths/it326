package patterns.behavioral.command;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ReceiverTV {
    private final static Logger logger = 
            Logger.getLogger(ReceiverTV.class.getName());
    
    public void on(){
		logger.log(Level.INFO,"Send on signal");
	}

	public void off(){
        logger.log(Level.INFO,"Send off signal");
	}

}
