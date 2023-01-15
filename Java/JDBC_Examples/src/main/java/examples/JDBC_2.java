package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
			DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
			//Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:batman", "shravan", "shravan");
			Connection conn = DriverManager.getConnection(DBInfo.DB_URL.toString(), DBInfo.DB_USERNAME.toString(), DBInfo.DB_PASSWORD.toString());
			String query = "select * from emp_tab";
			Statement st = conn.createStatement();
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
