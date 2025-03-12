package patterns.behavioral.observer;

import java.util.HashMap;

public class FlashNews extends Subject {

    private String message;
    private final Object MUTEX = new Object();

    public FlashNews() {
        this.observers = new HashMap<>();
    }

    @Override
    public void register(Observer obj) {
        synchronized (MUTEX) {
            if (!observers.containsKey(obj.observerName())) {
                observers.put(obj.observerName(), obj);
            }
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj.observerName());
        }
    }

    @Override
    protected void notifyObservers() {
        synchronized (MUTEX) {
            for (String obsName : observers.keySet()) {
                observers.get(obsName).update(this.message);
            }
        }
    }

    @Override
    public void post(String message) {
        this.message = message;
        notifyObservers();
    }
}
