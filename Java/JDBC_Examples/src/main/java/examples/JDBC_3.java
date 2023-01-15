package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
			DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:batman", "shravan", "shravan");
			String query = "update emp_tab set bonus=8000 where empid in (7894, 5987)";
			Statement st = conn.createStatement();
			int result = st.executeUpdate(query);
			System.out.println(result);
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
