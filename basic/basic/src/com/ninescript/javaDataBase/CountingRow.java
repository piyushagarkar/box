/**
 * 
 */
package com.ninescript.javaDataBase;

import java.sql.*;

/**
 * @author Piyush
 *
 */

public class CountingRow {

	public static void main(String[] args) {

		try{

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","root");
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM employee");

			System.out.println("Rows Count ");
			while(rs.next())
				System.out.println(rs.getInt(1));

			System.out.println("-----------------------------------------------------");

			ResultSet rs1 = st.executeQuery(" SELECT employee_name, COUNT(*) FROM employee GROUP BY employee_name");

			System.out.println("Group Of Employee----------!!!\n");
			while(rs1.next())
				System.out.println(rs1.getString(1));


			System.out.println("=====================================================");

			ResultSet rs2 = st.executeQuery("SELECT address, COUNT(*) FROM employee GROUP BY address;");

			System.out.println("Group Of Employee Adress.........!!!!");
			while(rs2.next())
				System.out.println(rs2.getString(1));
				System.out.println("##################################################");
				




		}catch(Exception e){
			System.out.println(e);
		}

	}
}
