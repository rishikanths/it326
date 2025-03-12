package patterns.behavioral.observer;

public interface Observer {
	
	public void update(String message);
	public String observerName();
}
