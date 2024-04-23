<%@page import="vo.MemberVO"%>
<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
// 1.파라미터 값 가져오기
String id = request.getParameter("id");
String name = request.getParameter("name");
String pw = request.getParameter("pw");
String gender = request.getParameter("gender");
String motive = request.getParameter("motive");


//2. 출력
out.println(id);
out.println(name);
out.println(pw);
out.println(gender);
out.println(motive);

//3. MemberDAO
MemberDAO dao = new MemberDAO();

//4. 파라미터값을 가지고 vo객체를 생성
MemberVO vo = new MemberVO();
vo.setId(id);
vo.setName(name);
vo.setPw(pw);
vo.setGender(gender);
vo.setMotive(motive);

//5. db에 입력
dao.addMember(vo);
//6. login.jsp로 리다이렉트
response.sendRedirect("login.jsp");


%>
</body>
</html>