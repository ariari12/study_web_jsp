package day2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class Login extends HttpServlet{
	// 200: 정상처리
	// 404: 자원을 못 찾음
	// 405: 방식을 지원하지 않음
	// 500: 서버쪽 프로그램 에러
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPro(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPro(req, resp);
	}

	private void doPro(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		//id와 pw를 가지고 db에 가서 데이터를 검색후 존재하는지 여부를 판단..
		PrintWriter out = resp.getWriter();
		//4. 브라우저에 출력
		out.println("<html>");
		out.println("<head><meta charset=\"UTF-8\"><title>로그인</title></head>");
		out.println("<body>");
		out.println("당신의 ID : "+id);
		out.println("<br>");
		out.println("당신의 PW : "+pw);
		out.println("</body>");
		out.println("</html>");
	}

}
