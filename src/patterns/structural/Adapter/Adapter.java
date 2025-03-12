package patterns.structural.Adapter;

public class Adapter extends StringWriter {
    CharacterWriter charWriter = new CharacterWriter();
	ByteWriter byteWriter = new ByteWriter();

	public Adapter(String name){
		super(name);
	}
	public void write(String name){
		super.write(name);
		writeToCharacter(name);
		writeToByte(name);
	}	
	private void writeToCharacter(String s) {
		charWriter.write(s.toCharArray(),0,s.length());		
	}
	private void writeToByte(String s) {
		byteWriter.write(s.getBytes());		
	}
}
