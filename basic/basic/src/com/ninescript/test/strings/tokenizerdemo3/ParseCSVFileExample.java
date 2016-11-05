package com.ninescript.test.strings.tokenizerdemo3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class ParseCSVFileExample {


	public static void main(String[] args) {
		try{

		String strFile ="D:/pp.txt";
			
			BufferedReader br= new BufferedReader (new FileReader(strFile));
			String strLine = "";
			StringTokenizer st =null;
			int LineNumber =0 , tokenNumber =0;
			
			while ((strLine=br.readLine())!=null){
				tokenNumber ++;
				System.out.println("Line # "+LineNumber  +", Token # "+ tokenNumber + " token : "+st.nextToken());
			}
			
			tokenNumber=0;
			
		}
		
		catch (Exception e){
								System.out.println("Exception While reading csv File "+e);
		}
	}
}
