package com.vishal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Book
 */
@WebServlet("/book")
public class Book extends HttpServlet {
	private static final long serialVersionUID = 1L;




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello");
		PrintWriter out=response.getWriter();
		HttpSession session = request.getSession(true);
		
		String un =(String) session.getAttribute("username");
		String pw=(String) session.getAttribute("password");
		
		out.println("<HTML><h1>HELLO"+un+"<br>"+session.getId()+"</h1></html>");
		
		out.println("<html><body>SELECT THE BOOK"
				+ "<form action=cart method=post ><input type=checkbox value=C name=book>C	<br>  "
				+ "<input type=checkbox value=Cpp name=book>Cpp	<br>"		
				+ "<input type=checkbox value=Java name=book >Java <br>"
				+ " <input type=submit value=Submit> </form></body></html>");
//		ServletContext servletContext = getServletContext();
//		RequestDispatcher requestDispatcher = servletContext
//		.getRequestDispatcher("/cart");
//		requestDispatcher.forward(request, response);


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
