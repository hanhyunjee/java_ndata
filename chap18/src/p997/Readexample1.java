package p997;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Readexample1 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByte;
		while(true) {
			readByte = is.read();
			if(readByte == -1) break;
			System.out.print((char)readByte);			
		}
		is.close();
	}
}
