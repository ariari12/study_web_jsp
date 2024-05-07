package ex3;



import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NowCommand {

	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd : hh:mm:ss");
		String time = sdf.format(d);
		
		req.setAttribute("msg", time);
		
		return "ex3/now.jsp" ;
	}

}
