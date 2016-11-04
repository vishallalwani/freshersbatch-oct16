package com.vishal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username=request.getParameter("uname");
		String passw=request.getParameter("pass");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session = request.getSession(true);
		
		if(session.isNew()) { //NEW USER
			session.setAttribute("username", username); 
			session.setAttribute("password", passw); 
			out.println("<HTML><h1>HELLO"+username+"<br>"+session.getId()+"</h1></html>");
			ServletContext servletContext = getServletContext();
			RequestDispatcher requestDispatcher = servletContext
			.getRequestDispatcher("/book");
			requestDispatcher.forward(request, response);
		}
		else {
			String un =(String) session.getAttribute("username");
			String pw=(String) session.getAttribute("password");
			
			if(un.equals("vishal") && pw.equals("123"))
			{
				out.println("<HTML><h1>HELLO"+un+"<br>"+session.getId()+"</h1></html>");
				ServletContext servletContext = getServletContext();
				RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/book");
				requestDispatcher.forward(request, response);
			}
			
		}



		


		

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
