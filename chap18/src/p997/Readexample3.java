package p997;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Readexample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:Temp/test.txt");
		int readByteNo;
		byte[]readBytes = new byte[8];
		readByteNo = is.read(readBytes, 3, 3);
		for (int i=0; i<readBytes.length; i++) {
			System.out.print((char)readBytes[i]);
		}
		is.close();
	}
}
