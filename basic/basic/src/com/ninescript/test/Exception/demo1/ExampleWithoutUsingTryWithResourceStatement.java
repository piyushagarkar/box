package com.ninescript.test.Exception.demo1;

import java.io.*;

public class ExampleWithoutUsingTryWithResourceStatement {

	public static void main(String[] args) {
		try {

			String str;

			BufferedReader br = new BufferedReader(new FileReader("d:\\myfile.txt"));
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

			
			br.close();

		} catch (IOException ie) {
			System.out.println("exception");
		}
	}

}
