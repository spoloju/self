package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
			DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:batman", "shravan", "shravan");
			String query = "select * from emp_tab";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt("empid") + " " + rs.getString("empname") + " " + rs.getInt("Salary")+ " " 
			+ rs.getInt("bonus")+ " " + rs.getInt("Deptid")+ " " + rs.getInt("Managerid"));
			}
			rs.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("Success");
	}

}
