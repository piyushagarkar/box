/**
 * 
 */
package com.ninescript.javaDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author piyush
 *
 */
public class InsertValuesInDataBase {

	public static void main(String[] args) {
	
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","root");
			
			Statement st = con.createStatement();

			st.executeUpdate("insert into employee values (3,'Anupriya',8000,'pune')");

			
			con.close();
  
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}
