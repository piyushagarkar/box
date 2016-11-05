/**
 * 
 */
package com.ninescript.javaDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author User 37
 *
 */
public class AggregateFunctionUseIntable {
	
	public static void main(String[] args) {
		
		try{

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","root");

		Statement st = con.createStatement();

	

		ResultSet rs =	st.executeQuery("select sum(employee_salary)from employee");
		
		while(rs.next())
		System.out.println("Sum is : "+rs.getInt(1));
		
		
	}catch(Exception e){
		System.out.println(e);
	}
}
	
}
