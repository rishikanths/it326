package patterns.behavioral.observer;

import java.util.Map;

public abstract class Subject {

    protected Map<String, Observer> observers = null;

	public abstract void register(Observer obj);
	public abstract void unregister(Observer obj);
	
	protected abstract void notifyObservers();
    public abstract void post(String message);
		
}
