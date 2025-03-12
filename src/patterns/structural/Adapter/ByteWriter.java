package patterns.structural.Adapter;

import java.io.FileOutputStream;

public class ByteWriter {
	public void write(byte[] bytes) {
		try(FileOutputStream fos = new FileOutputStream("adapter.txt")){
		    fos.write(bytes);
        }catch(Exception e){
            e.printStackTrace();
        }
	}
}
