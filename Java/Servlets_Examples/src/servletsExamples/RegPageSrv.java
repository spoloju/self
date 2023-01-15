package servletsExamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.DB_Connection;

public class RegPageSrv extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("This is response from doget method");
		pw.println("Username received == > " + name);
		pw.println("Password received ==> " + pwd);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		
		PrintWriter pw = resp.getWriter();			
		
		Employee emp = new Employee();
		emp.setId(Long.parseLong(req.getParameter("Employee ID")));
		emp.setName(req.getParameter("Employee Name"));
		emp.setSalary(Double.parseDouble(req.getParameter("Employee Salary")));
		emp.setBonus(Double.parseDouble(req.getParameter("Employee Bonus")));
		emp.setDeptId(Integer.parseInt(req.getParameter("Employee Department ID")));
		emp.setManagerId(Long.parseLong(req.getParameter("Employee Manager ID")));
		DB_Connection dc = new DB_Connection();
		int result = dc.insertEmployee(emp);
		resp.setContentType("text/html");
		
		if(result==1) {
			pw.println("Added data to DB is successful");		
		}else {
			pw.println("Houston we have a problem!");
		}
		
	
	}
}
