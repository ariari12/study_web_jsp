package day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// bigChance.do
// 로또번호 6자리 숫자..
// 이미지로 출력
// <img src="" alt="">
@WebServlet("/bigChance.do")
public class BigChance extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Lotto lotto=new Lotto();
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<head><meta charset=\"UTF-8\"><title></title></head>");
		out.println("<body>");
		for(int i : lotto.getM()) {
			System.out.println(i);
			out.println("<img src= './images/ball/ball"+i+".png' alt=''>");
			
		}
		
		
		out.println("</body>");
		out.println("</html>");
	}

}
