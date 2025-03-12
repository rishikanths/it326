package patterns.structural.Adapter;

public class Client {
    public static void main(String[] args) {		
		String fileName = "newText.txt";
		String write = "IT326";
		StringWriter adapter = new Adapter(fileName);
		adapter.write(write);	
	}
}
