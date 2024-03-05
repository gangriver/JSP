package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddtionServlet01")
public class AddtionServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		System.out.println("doGet.....");
		
		int num1 = 10;
		int num2 = 20;
		int add = num1 + num2;
		
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body<h1>");
		out.println(num1 + " + " + num2 + " = " + add);
		out.println("</h1></body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost.....");
	}

}