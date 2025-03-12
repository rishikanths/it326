package patterns.creational.ObjectPool.Object;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Resource that is expensive to create everytime someone wants to have
 * access to this object
 */
public class Resource {

    private static final AtomicInteger counter = new AtomicInteger(0);
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    private final int id;

    public Resource() {
        id = counter.incrementAndGet();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Resource id=%d", id);
    }

}
