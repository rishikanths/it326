package patterns.structural.Bridge;

public class V4Engine implements Engine{ 

	@Override 
	public void build() { 
		System.out.println("making V4 engine");
	}

    @Override 
	public String toString() { 
		return "V4 Engine EcoBoost 330 HP";
	}
}

