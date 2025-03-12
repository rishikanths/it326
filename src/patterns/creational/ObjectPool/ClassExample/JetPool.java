package patterns.creational.ObjectPool.ClassExample;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JetPool {
    private ArrayBlockingQueue<PrivateJet> pool = null;
    private static JetPool jetpool = null;

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    private JetPool()
    {
        pool = new ArrayBlockingQueue<>(10);
        for(int i = 0; i < 10; i++)
        {
            pool.add(new PrivateJet("ISU"+i));
        }
        logger.log(Level.INFO,"Pool of Jets created");
    }
    public static JetPool initiatePool(){
        if(jetpool ==null){
            jetpool = new JetPool();
        }
        return jetpool;
        
    }
    public PrivateJet rent()
    {
        try {
            logger.log(Level.INFO,"A Jet has been allocated");
            return pool.take();
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
        return null;
    }
    public void done(PrivateJet jet)
    {
        pool.add(jet);
        logger.log(Level.INFO,"A Jet has been returned");
    }
}
