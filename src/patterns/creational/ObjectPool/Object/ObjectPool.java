package patterns.creational.ObjectPool.Object;

import java.util.HashSet;
import java.util.Set;

/**
 * Abstract of a Pool. This allows us to create a pool for 
 * any type of Object.
 */
public abstract class ObjectPool<T> {

    private final Set<T> available = new HashSet<>();
    private final Set<T> inUse = new HashSet<>();
  
    protected abstract T create();
  
    public synchronized T checkOut() {
      if (available.isEmpty()) {
        T obj = create();
        available.add(obj);
      }
      var instance = available.iterator().next();
      available.remove(instance);
      inUse.add(instance);
      return instance;
    }
  
    public synchronized void checkIn(T instance) {
      inUse.remove(instance);
      available.add(instance);
    }
  
    @Override
    public synchronized String toString() {
      return String.format("Pool available=%d inUse=%d", available.size(), inUse.size());
    }
  }