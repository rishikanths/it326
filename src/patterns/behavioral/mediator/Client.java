package patterns.behavioral.mediator;

public class Client {
    public static void main(String args[]){
		
		AbstractMediator ohare = new OHareTower();
		
		Aeroplane jet1 = new ISUJet(ohare, "ISU326","IT326");
		Aeroplane jet2 = new ISUJet(ohare, "ISU226","IT226");
		Aeroplane jet3 = new ISUJet(ohare, "IT383","IT383");
		
		ohare.addPlane(jet1);
		ohare.addPlane(jet2);
		ohare.addPlane(jet3);
		
		jet1.send("I saw NE Patriots new 747");	
	}

}
