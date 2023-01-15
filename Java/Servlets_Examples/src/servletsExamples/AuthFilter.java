package servletsExamples;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chainObj) throws IOException, ServletException {
		
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		if (id==450) {
			
			//I wish to chain the request to hello world servlet program
			chainObj.doFilter(req, resp);
			
		}else {
			
			//I wish to redirect to login.html
			
			RequestDispatcher rd  = req.getRequestDispatcher("login.html");
			rd.forward(req,  resp);
			
			
						
		}
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
