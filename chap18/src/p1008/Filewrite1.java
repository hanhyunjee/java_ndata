package p1008;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.channels.WritableByteChannel;

public class Filewrite1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "깐발놈또집어질러펴놨어".toCharArray();
		for(int i=0; i<data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}
}
