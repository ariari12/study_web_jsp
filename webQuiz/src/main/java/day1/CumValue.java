package day1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/totalSum.do")
public class CumValue extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num=Integer.parseInt(req.getParameter("num"));
		int count=0;
		for(int i=1; i<=num; i++) {
			count+=i;
		}
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<head><meta charset=\"UTF-8\"><title></title></head>");
		out.println("<body>");
		out.println(count);
		out.println("</body>");
		out.println("</html>");
	}

}
