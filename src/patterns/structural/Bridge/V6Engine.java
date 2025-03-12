package patterns.structural.Bridge;

public class V6Engine implements Engine{ 

	@Override 
	public void build() { 
		System.out.println("making V6 engine");
	}
	
	@Override 
	public String toString() { 
		return "V6 Engine 400 HP with 8-Gears";
	}
}

