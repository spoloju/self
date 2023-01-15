package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_SqlInjectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter Empid");
		String empid = obj.nextLine();
		obj.close();
		  try {
			DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:batman", "shravan", "shravan");
			String query = "select * from emp_tab where empid=";
			Statement st = conn.createStatement();
			query = query.concat(empid);
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3)+ " " 
			+ rs.getInt(4)+ " " + rs.getInt(5)+ " " + rs.getInt(6));
			}
			rs.close();					
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
