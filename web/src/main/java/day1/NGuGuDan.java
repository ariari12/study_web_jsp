package day1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//localhost:8080/web/gugudan2.do
@WebServlet("/gugudan2.do")
public class NGuGuDan extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int dan=Integer.parseInt(req.getParameter("dan"));
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head><meta charset=\"UTF-8\"><title>구구단"+dan+"단</title></head>");
		out.println("<body>");
		for(int i=1; i<=9; i++) {
			out.println("<h3>"+dan+" X "+i+" = "+dan*i+"</h3>");
		}
		out.println("</body>");
		out.println("</html>");

	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int dan=Integer.parseInt(req.getParameter("dan"));
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head><meta charset=\"UTF-8\"><title>구구단"+dan+"단</title></head>");
		out.println("<body>");
		for(int i=1; i<=9; i++) {
			out.println("<h3>"+dan+" X "+i+" = "+dan*i+"</h3>");
		}
		out.println("</body>");
		out.println("</html>");
	}

}
