package day1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/menu.do")
public class Menu extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String menu =req.getParameter("menu");
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<head><meta charset=\"UTF-8\"><title></title></head>");
		out.println("<body>");
		out.println("선택한 메뉴는 "+menu+" 입니다.");
		out.println("</body>");
		out.println("</html>");
	}

}
