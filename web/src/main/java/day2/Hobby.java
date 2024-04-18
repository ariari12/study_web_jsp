package day2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hobby.do")
public class Hobby extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPro(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPro(req, resp);
	}
	
	private void doPro(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// 사용자가 보내준 파라미터 값 가져오기
		String hobby = req.getParameter("hobby");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><meta charset=\"UTF-8\"><title></title></head>");
		out.println("<body>");
		out.println("<h3>당신의 취미는 " + hobby + " 입니다.</h3>");
		out.println("</body>");
		out.println("</html>");
	}

}
