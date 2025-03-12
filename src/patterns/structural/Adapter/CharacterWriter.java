package patterns.structural.Adapter;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
/** "Old Implementation before String" */
public class CharacterWriter {
	private DataOutputStream dos = null;

    public void write(char chars[], int from, int length) {
		try(FileOutputStream fos = new FileOutputStream("adapter.txt")){
            dos = new DataOutputStream(fos);
            for(int i = from;i<length;i++){
                dos.write((int)chars[i]);
            }
            dos.flush();
            dos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
	}
}
