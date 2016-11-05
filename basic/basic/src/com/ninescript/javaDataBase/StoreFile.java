/**
 * 
 */
package com.ninescript.javaDataBase;

import java.io.*;
import java.sql.*;
/**
 * @author User 37
 *
 */
public class StoreFile {

	public static void main(String[] args) {

		try{

			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","root");  

			PreparedStatement ps=con.prepareStatement("insert into filetable values(?,?)");  

			File f=new File("d:\\myfile.txt");  
			FileReader fr=new FileReader(f);  

			ps.setInt(1,101);  
			ps.setCharacterStream(2,fr,(int)f.length());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  

			con.close();  

		}catch (Exception e) {e.printStackTrace();}  
	}

}
