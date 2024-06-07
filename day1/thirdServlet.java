package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class thirdServlet extends HttpServlet{
	private String color ="";
	    @Override
	    public void init(ServletConfig config) throws ServletException {
	    	
	    	super.init(config);
	    	System.out.println("thirdServlet.init called");
	    	color = config.getInitParameter("color");
	    }
	    
	    @Override
	    public void destroy() {
	    	System.out.println("thirdservlet.destroy() called");
	    
	    }
	    
	    
	    
	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    System.out.println("thirdServlet.doPost() called");
	    processRequest(req, resp);
	    }
	    
	    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) {
			resp.setContentType("text/html");
			

		}
	    
	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   System.out.println("thirdServlet.doGet() called");
	    processRequest(req, resp);
	    PrintWriter out= resp.getWriter();
	    out.println("<html>");
		out.println("<head>");
		out.println("<title>Third</title>");
		out.println("</head>");
		out.printf("<body bgcolor='%s'>\n", color);
		out.println("<h1>Hello, ThirdServlet</h1>");
		out.println("</body>");
		out.println("</html>");
	    
	    }

}
