package ex3;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IPCommand {

	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String url="ex3/ip.jsp";	
		req.setAttribute("msg", req.getRemoteAddr());
		return url;
	}

}
