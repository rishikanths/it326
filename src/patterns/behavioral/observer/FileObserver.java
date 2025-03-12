package patterns.behavioral.observer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileObserver implements Observer {

    private static final Logger logger = Logger.getLogger(FileObserver.class.getSimpleName());
    private File msgLogs = null;
    private BufferedWriter msgLogsWriter = null;
    private String name = "";
    private File folderName = null;

    public FileObserver(String name) {
        this.name = name;
        folderName = new File("logs");
        msgLogs = new File("logs/msg-"+this.name+".log");
        boolean fileExits = false;
        try {
            if (msgLogs.exists()){
                fileExits = true;
            }else{
                    if(folderName.mkdirs());                           
                        if(msgLogs.createNewFile())
                                fileExits = true;
            }
            if (fileExits) 
                msgLogsWriter = new BufferedWriter(new FileWriter(msgLogs,true));
        } catch (IOException e) {
            msgLogs = null;
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
    }

    @Override
    public void update(String message) {
        try {
            msgLogsWriter.write(message+"\n");
            msgLogsWriter.flush();
        } catch (IOException e) {
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
    }
    @Override
    public String observerName() {
        return this.name;
    }
}
