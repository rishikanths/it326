package patterns.structural.Bridge;

public class Coupe extends Car { 

	public Coupe(Engine carEngine) {
		super(carEngine);
	}
	
	@Override 
	public void build() { 
		System.out.println("Get Coupe with the assigned engine");
	}
    
    @Override 
	public String toString() { 
	    return "Coupe with "+ myEngine.toString();
	}
}

