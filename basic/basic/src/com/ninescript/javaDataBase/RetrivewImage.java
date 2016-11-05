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
public class RetrivewImage {

	public static void main(String[] args) {
		
		try{
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager .getConnection("jdbc:mysql://localhost:3306/piyush","root","root");
			
			
			
			
			PreparedStatement ps1 = con.prepareStatement("select *  from imagetable");
			ResultSet rs=ps1.executeQuery();  
			if(rs.next()){
			              
			Blob b=rs.getBlob(2);
			byte barr[]=b.getBytes(1,(int)b.length());
			              
			FileOutputStream fout=new FileOutputStream("D:\\JAVA_07\\Piyush_Workspace\\Kanch111.jpg");  
			fout.write(barr);  
			              
			fout.close();  
			} 
			System.out.println("Image Retrived");  
			              
			con.close();  
			
			
			
		}catch(Exception e){
			
		}
	}
}
