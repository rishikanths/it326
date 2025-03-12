package patterns.creational.FactoryMethod.persistance;

public class FactoryMethod {

	public enum PersistanceType{
		
		CSV("csv"), SQL("oracle");
		public String name;
		PersistanceType(String s) {
			this.name  = s;
		}
	}
	
	public static Persistance getPersistanceType(PersistanceType c) {
		
		if(c.equals(PersistanceType.CSV)) 
			return new CSV();
		else if(c.equals(PersistanceType.SQL)) 
			return new Database();
		
		return null;
	}
}
