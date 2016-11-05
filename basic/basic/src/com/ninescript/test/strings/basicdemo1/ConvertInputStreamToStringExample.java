package com.ninescript.test.strings.basicdemo1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ConvertInputStreamToStringExample {

	public static void main(String args[]) throws IOException {

		// get InputStream of a file
		InputStream is = new FileInputStream("c:/data.txt");
		String strContent;

		

		// Create BufferedReader object
		BufferedReader bReader = new BufferedReader(new InputStreamReader(is));
		StringBuffer sbfFileContents = new StringBuffer();
		String line = null;

		// read file line by line
		while ((line = bReader.readLine()) != null) {
			sbfFileContents.append(line);
		}

		// finally convert StringBuffer object to String!
		strContent = sbfFileContents.toString();

		

		strContent = new Scanner(is).useDelimiter("\\A").next();
	}
}
