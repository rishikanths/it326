package patterns.structural.Bridge;

public class Client {
	
	public static void main(String args[]) {
		
		Engine v4 = new V4Engine();		
		Engine v6 = new V6Engine();		
		
        Car	myCar = new Coupe(v4);
        System.out.println(myCar.toString());		
		
        myCar = new Coupe(v6);
        System.out.println(myCar.toString());		
		
	} 
} 

