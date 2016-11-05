package com.ninescript.test.Exception.demo1;

import java.io.*;



public class ExampleUsingTryWithResourceStatement {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("d:\\myfile.txt"))){
			
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		}
			catch(IOException ie){
				System.out.println("Exception");
			}
	}
}
