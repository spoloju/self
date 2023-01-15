package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class JDBC_Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern  = "dd-MM-yyyy";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter DepartmentID");
		int deptId = sc.nextInt();
		System.out.println("Please Enter Date" + pattern);
		sc.nextLine();
		String dateInStringFormat = sc.nextLine();
		sc.close();
		// Covert date value from String --> Java.util.dateformat 
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		java.util.Date dateInUtilFormat=null;
		try {
			dateInUtilFormat= sdf.parse(dateInStringFormat);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Convert dateValue from java.util.date Format --> java.sql.date Format
		
		java.sql.Date dateInSqlFormat = new java.sql.Date(dateInUtilFormat.getTime());
		System.out.println(dateInSqlFormat);
		
		try {
			DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:batman", "shravan", "shravan");
			String query = "update department set establisheddate=? where departmentid=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setDate(1, dateInSqlFormat);
			ps.setInt(2, deptId);
			int rs = ps.executeUpdate();
			System.out.println(rs);
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
