/**
 * 
 */
package com.ninescript.javaDataBase;



import java.sql.*;

/**
 * @author User 37
 *
 */
public class UpdateTable {
	
	public static void main(String[] args) {
		try{
			
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","root");
												
		Statement st = con.createStatement();
		
		st.executeUpdate("UPDATE employee SET employee_name='anamika' where  employee_name='anupriya'");
				
		
		
		
		
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
