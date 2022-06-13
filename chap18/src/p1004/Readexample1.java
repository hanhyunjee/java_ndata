package p1004;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Readexample1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readData;
		while(true) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.print((char)readData);
		}
		reader.close();
	}
}
