package com.ninescript.piyush;

import java.io.*;
import java.sql.Ref;

public class ReadData {

	public static void main(String[] args) {

		try{

			RandomAccessFile raf = new RandomAccessFile("myfile.txt", "r");
			byte b[]= new byte[1000];
			raf.readFully(b,0,1000);

		}

		
		catch(FileNotFoundException e){
			System.err.println("File Not Found");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		catch(IOException e){
			System.err.println("IO Error");
			System.err.println( e.toString());
			e.printStackTrace();

		}



	}
}
