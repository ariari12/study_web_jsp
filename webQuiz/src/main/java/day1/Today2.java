package day1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/time2.do")
public class Today2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date d=new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		PrintWriter out =resp.getWriter();
		out.println("<html>");
		out.println("<head><meta charset=\"UTF-8\"><title></title></head>");
		out.println("<body>");
		out.println("1. SimpleDateFormat");
		out.println(sdf.format(d));
		out.println("<br>");
		out.println("2. Date");
		out.println((1900+d.getYear())+"년"+
					(d.getMonth()+1)+"월"+
					d.getDate()+"일"+
					d.getHours()+"시"+
					d.getMinutes()+"분"+
					d.getSeconds()+"초");
		out.println("</body>");
		out.println("</html>");
	}
}
