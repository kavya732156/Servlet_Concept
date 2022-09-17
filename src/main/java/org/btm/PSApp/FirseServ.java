package org.btm.PSApp;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.PrintWriter;

public class FirseServ extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		String gender=req.getParameter("ge");
		PrintWriter out=resp.getWriter();
		out.println("<html> <body bgcolor='yellow'>" + " "
				+ "<h1>The person name is " + name+ "  from" + place+ " " + gender +
				"</h1>+</body></html>");
	   out.close();
	   out.flush();
	}

}
