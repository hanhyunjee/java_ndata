package p1008;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Filewrite2 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "깐발놈또집어질러펴놨어".toCharArray();
		writer.write(data,1,2);
		writer.flush();
		writer.close();
	}
	
}
