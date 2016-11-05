/**
 * 
 */
package com.ninescript.javaDataBase;

import java.sql.*;

/**
 * @author Piyush
 *
 */
public class WhereClause {

	public static void main(String[] args) {
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","root");
			
			Statement st = con.createStatement();
		ResultSet rs =	st.executeQuery("SELECT * from employee WHERE address='pune'");
			while(rs.next())
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"  "+ rs.getInt(3) +" "+rs.getString(4));

		}catch(Exception e){
			System.out.println(e);
		}
	}
}
