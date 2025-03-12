package SOLID.OCP.GoodPractise.persist;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Database extends Persistance {
    
    private static final Logger logger = Logger.getLogger(Database.class.getName());

    public Database(){
        logger.log(Level.INFO,"Acquired database object");
    }
    @Override
    public boolean connect() {
        try{
            logger.log(Level.INFO,"Acquired connection to the database");        
        }catch(Exception e){
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
        return true;
    }

    @Override
    public boolean close() {
        try{
            logger.log(Level.INFO,"Closed connection to the database");       
        }catch(Exception e){
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
        return true;
    }

    @Override
    public boolean save(Object obj) {
        try{
            logger.log(Level.INFO,"Saved the object to the database");        
        }catch(Exception e){
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
        return true;
    }

    @Override
    public boolean delete(Object obj) {
        try{
            logger.log(Level.INFO,"Deleted the object to the database");        
        }catch(Exception e){
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
        return true;
    }

    @Override
    public boolean update(Object obj) {
        try{
            logger.log(Level.INFO,"Updated the object to the database");
        }catch(Exception e){
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
        return true;
    }
}
