package shravanpratice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Rbi extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		String bankName = req.getParameter("BankName");
		
/*		Develop web page  -- Bank.html
		Develop 3 Servlets -- RBI, ICICI, SBI
		If input in the request is ICICI then execute RBI + ICICI with include
		else if input in the request is SBI then execute RBI + SBI with forward
		else just deliver the response from RBI class
*/		
		RequestDispatcher rd;
		
		if(bankName.toLowerCase().equals("icici")) {
			pw.println("This Response is from RBI Class. Bank Name received ==> " + bankName);
			rd = req.getRequestDispatcher("/icici");
			rd.include(req, resp);
			
		}else if (bankName.toLowerCase().equals("sbi")) {
			pw.println("<h1>This Response is from RBI Class. Bank Name received ==> " + bankName+"<h1>");
			rd = req.getRequestDispatcher("/sbi");
			rd.forward(req, resp);
		}else {
			pw.println("This Response is from RBI Class. Bank Name received ==> " + bankName);
		}
		
				
				
		
	}
	

}
