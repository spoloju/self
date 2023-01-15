package servletsExamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ClientSrv1 extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession sobj= req.getSession(true);	
		String fname = req.getParameter("Fname");
		String lname = req.getParameter("Lname");
		PrintWriter pw = resp.getWriter();
		pw.println("First name received from browser ==> " + fname);
		pw.println("Last name received from browser ==> " + lname);
		
		sobj.setAttribute("fname", fname);
		sobj.setAttribute("lname", lname);
					   
	
	}
	

}
