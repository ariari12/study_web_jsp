package day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hobby2.do")
public class Hobby2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1. 한글처리
		//2. 파라미터값 가져오기
		String[] hList=req.getParameterValues("hobby");
		//3. 쓰기 객체
		//4. 출력
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<head><meta charset=\"UTF-8\"><title></title></head>");
		out.println("<body>");
		Arrays.asList(hList).forEach(s->out.println("당신의 취미는 : "+s+"입니다.<br>"));
		
		out.println("</body>");
		out.println("</html>");
	}

}
