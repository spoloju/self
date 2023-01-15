package chaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginSrv extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String empid = req.getParameter("EnterEmpID");
		String emppwd = req.getParameter("EnterEmpPassword");
		PrintWriter pw = resp.getWriter();
		pw.println("User Emp id received ==> " + empid);
		pw.println("User pwd id received ==> " + emppwd);
		
		if(empid.toLowerCase().equals("abc123")) {
			//Do servlet chaining to welcomesrv using forward
			//RequestDispatcher rd = req.getRequestDispatcher("/welcomescreen");
			//rd.forward(req, resp);
			resp.sendRedirect("http://localhost:8080/Servlets_Examples/welcomescreen");
		}else {
			//Do servlet chaining to errorsrv using include 
			RequestDispatcher rd = req.getRequestDispatcher("/errorSrv");
			rd.include(req, resp);
		}
		
	}
	

}
