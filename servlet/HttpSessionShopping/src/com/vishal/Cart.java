package com.vishal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Cart
 */
@WebServlet("/cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] result=request.getParameterValues("book");
		PrintWriter out=response.getWriter();
HttpSession session = request.getSession(true);
		
		String un =(String) session.getAttribute("username");
		out.println("<HTML><h1>HELLO"+un+"<br>"+session.getId()+"</h1></html>");
		out.println("<html><body>Selected books are ");
		for(String str:result)
		{
			out.println("<li>"+str+"</li>");
		}
				out.println( "</body> </html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
