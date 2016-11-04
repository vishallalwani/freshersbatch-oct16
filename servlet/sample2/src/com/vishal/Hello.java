package com.vishal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
//@WebServlet("/hello")
public class Hello extends HttpServlet {
	String para;
	@Override
	public void init(ServletConfig config)  {
		// TODO Auto-generated method stub
	this.para=config.getInitParameter("myParam");
	System.out.println(para);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username=request.getParameter("uname");
		String passw=request.getParameter("pass");
		PrintWriter out=response.getWriter();
		if(username.equals("vishal"))
		out.println("<html>HELLO</html>"+this.para);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
