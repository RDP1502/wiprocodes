package com.wipro.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputFile = "C:\\Users\\rdpaw\\OneDrive\\Pictures\\Screenshots\\Demo.png";
		String outputFile = "C:\\Users\\rdpaw\\OneDrive\\Pictures\\Screenshots\\Demo1.png";
		try {
		FileInputStream fi = new FileInputStream(inputFile);
		FileOutputStream fo = new FileOutputStream(outputFile);

		byte[] buffer = new byte[1025];
		int byteRead = 0;
		
			while((byteRead = fi.read(buffer))!=-1) {
				fo.write(buffer,0,byteRead);
		}
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
