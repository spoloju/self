package servletsExamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet{
	
	
	public HelloWorld() {
		
		System.out.println("This is default constructor method of HelloWorld Program");
		
	}
	
	@Override
	public void init() throws ServletException {
	
		System.out.println("This is Init Method of HelloWorld Program");
	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is do get method of Hello World Class");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("<h1>This response is from do get method from hello world class</h1>");
	}

	
	@Override
	public void destroy() {
	
		System.out.println("This is destroy method of Hello World Program");
	
	}
	
	
//
}
