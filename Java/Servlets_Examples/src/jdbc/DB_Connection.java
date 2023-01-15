package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import servletsExamples.Employee;

public class DB_Connection {
	
	public int insertEmployee(Employee emp) {
		int result=0;
		 try {
				DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:batman", "shravan", "shravan");
				String query = "insert into emp_tab values(?,?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setLong(1, emp.getId());
				ps.setString(2, emp.getName());
				ps.setDouble(3, emp.getSalary());
				ps.setDouble(4, emp.getBonus());
				ps.setInt(5, emp.getDeptId());
				ps.setLong(6, emp.getManagerId());
				result = ps.executeUpdate();
				System.out.println(result);
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return result;
		 
		
	}

}
