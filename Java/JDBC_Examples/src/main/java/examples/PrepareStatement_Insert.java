package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatement_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter Empid");
		int empId = sc.nextInt();		
		System.out.println("Please Enter EmpName");
		sc.nextLine();
		String empName = sc.nextLine();
		System.out.println("Please Enter Salary");
		int salary = sc.nextInt();
		System.out.println("Please Enter Bonus");
		int bonus = sc.nextInt();
		System.out.println("Please Enter DeptId");
		int deptId = sc.nextInt();
		System.out.println("Please Enter ManagerID");
		int managerID = sc.nextInt();
		sc.close();
		  try {
			DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:batman", "shravan", "shravan");
			String query = "insert into emp_tab values(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, empId);
			ps.setString(2, empName);
			ps.setInt(3, salary);
			ps.setInt(4, bonus);
			ps.setInt(5, deptId);
			ps.setInt(6, managerID);
			int result = ps.executeUpdate();
			System.out.println(result);
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
