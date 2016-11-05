package com.ninescript.test.Exception.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * @author Piyush
 *
 */

public class CustomExceptionExample {

	public static void main(String[] args) throws  MyException {

		try{
			processFile("file.txt");


		}catch(   MyException e){
			processErrorCodes(e);

		}				
	}

	private static void  processErrorCodes( MyException e ) throws  MyException{


		switch(e.getErrorCode()){

		case "BAD_FILE_TYPES":
			System.out.println("Bad File Types ,Notify User");
			throw e;

		case "FILES_NOT_FOUND_EXCEPTION":
			System.out.println("Files Not Found Exception");
			throw e;

		case "FILE_NOT_EXCEPTION":
			System.out.println("File Not Exception");
			break ;

		default :
			System.out.println("Unknown exception occued, lets log it for further debugging ."+e.getMessage());
			e.printStackTrace();


		}
	}


	private  static void processFile(String file ) throws  MyException{

		InputStream fis = null;
		try{
			fis = new FileInputStream(file);
		}catch(FileNotFoundException e ){

			throw new  MyException(e.getMessage(), "FILE_NOT_FOUND_EXCEPTION");
		} finally {

			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				throw new MyException(e.getMessage(), "FILE_CLOSE_EXCEPTION");
			}
		}
	}

}



