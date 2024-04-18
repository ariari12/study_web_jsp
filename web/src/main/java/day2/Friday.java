package day2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/friday.do")
public class Friday extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPro(resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 doPro(resp);
	}

	private void doPro(HttpServletResponse resp) throws IOException {
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<head><meta charset=\"UTF-8\"><title></title></head>");
		out.println("<body>");
		out.println("<h2> 오늘은 금요일같은 수요일입니다.. </h2>");
		out.println("</body>");
		out.println("</html>");
	}

}
