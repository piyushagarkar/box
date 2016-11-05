/**
 * 
 */
package com.ninescript.javaDataBase;

import java.sql.*;

/**
 * @author User 37
 *
 */
public class PatternMatching {

	public static void main(String[] args) {

			try{
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","root");
				Statement st = con.createStatement();
				
				ResultSet rs1 = st.executeQuery(" SELECT * FROM employee WHERE employee_name LIKE 'a%'");
				while(rs1.next())
					System.out.println(" "+rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4));

			}catch(Exception e ){
				
					System.out.println(e);
			}
		
	}
}
