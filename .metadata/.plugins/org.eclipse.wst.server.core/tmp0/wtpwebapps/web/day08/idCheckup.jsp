<%@page import="vo.MemberVO"%>
<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// idCheckup.jsp?id=aaa
	
	String id = request.getParameter("id");

	if(id != null){
		
		MemberDAO dao = new MemberDAO();
		// dao.getOne(id) ==> vo를 리턴받는다
		MemberVO vo=dao.getOne(id);
		
		
		if(vo==null){
			// 5. vo가 널이라면 존재하지 않는 아이디 : 화면에 true 출력
			out.println("true");
			
		}else{
			// 6. vo가 널이 아니라면 존재하는 아이디 : 화면에 false 출력
			out.println("false");
			
		}
		
		
	}

%>