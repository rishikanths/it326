package patterns.structural.Adapter;
import java.io.File;
import java.io.FileWriter;

public class StringWriter {
    private File file = null;

	public StringWriter(String name){
		file = new File(name);
	}
	public void write(String s){
		try(FileWriter fileWriter = new FileWriter(file)){
		    fileWriter.write(s);
    		fileWriter.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
	}
}
