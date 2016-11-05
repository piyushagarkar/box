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

public class RetrieveFile {  
	public static void main(String[] args) {  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","root");  

			PreparedStatement ps=con.prepareStatement("select * from filetable");  
			ResultSet rs=ps.executeQuery();  
			rs.next();

			Clob c=rs.getClob(2);  
			Reader r=c.getCharacterStream();              

			FileWriter fw=new FileWriter("d:\\retrivefile.txt");  

			int i;  
			while((i=r.read())!=-1)  
				fw.write((char)i);  

			fw.close();  
			con.close();  

			System.out.println("success");  
		}catch (Exception e) {e.printStackTrace();  }  
	}  
}  