/**
 * 
 */
package com.ninescript.javaDataBase;

import java.sql.*;
import java.io.*;

/**
 * @author User 37
 *
 */
public class InsertImage {

	public static void main(String[] args) {
		

		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager .getConnection("jdbc:mysql://localhost:3306/piyush","root","root");
			
			PreparedStatement ps=con.prepareStatement("insert into imagetable values(?,?)");  
			ps.setString(1,"abc");
			
			FileInputStream fin = new FileInputStream("D:\\Kanch111.jpg");
			ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
			          
			con.close();  
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
