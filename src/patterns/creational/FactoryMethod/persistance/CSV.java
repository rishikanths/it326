package patterns.creational.FactoryMethod.persistance;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSV extends Persistance {

    private File file= null;
    private FileInputStream input= null;
    private static final Logger logger = Logger.getLogger(CSV.class.getName());
    
    public CSV(){
        this.path = "path to CSV";
    }
    @Override
    public boolean connect() {
        try{
            file = new File(path);
            input = new FileInputStream(file);
            logger.log(Level.INFO,"Acquired connection to the CSV file");
        }catch(Exception e){
            logger.log(Level.SEVERE,e.getMessage(),e);
            return false;
        }
        return true;
    }

    @Override
    public boolean close() {
        try{
            input.close();
            logger.log(Level.INFO,"Closed connection to the CSV file");
        }catch(Exception e){
            logger.log(Level.SEVERE,e.getMessage(),e);
            return false;
        }
        return true;
    }

    @Override
    public boolean save(Object obj) {
        try{
            logger.log(Level.INFO,"Saved the object to the CSV file");
        }catch(Exception e){
            logger.log(Level.SEVERE,e.getMessage(),e);
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(Object obj) {
        try{
            logger.log(Level.INFO,"Deleted the object to the CSV file");
        }catch(Exception e){
            logger.log(Level.SEVERE,e.getMessage(),e);
            return false;
        }
        return true;
    }

    @Override
    public boolean update(Object obj) {
        try{
            logger.log(Level.INFO,"Updated the object to the CSV file");
        }catch(Exception e){
            logger.log(Level.SEVERE,e.getMessage(),e);
            return false;
        }
        return true;
    }
    
}
