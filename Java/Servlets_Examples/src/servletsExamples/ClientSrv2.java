package servletsExamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ClientSrv2 extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession sobj = req.getSession();
		
		PrintWriter pw = resp.getWriter();
		//String fname = req.getParameter("Fname");
		//String lname = req.getParameter("Lname");
		String role = req.getParameter("role");
		String salary = req.getParameter("salary");
		pw.println("First name received from browser ==> " + sobj.getAttribute("fname"));
		pw.println("Last name received from browser ==> " +  sobj.getAttribute("lname"));
		pw.println("Role Received from browser ==> " + role);
		pw.println("Salary Received from browser ==> " + salary);
		sobj.invalidate();
	}
	


}
