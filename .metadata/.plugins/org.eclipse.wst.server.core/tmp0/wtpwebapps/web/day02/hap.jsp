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
		String num1=request.getParameter("num1");
		String num2=request.getParameter("num2");
		int num3=0; 
		
		if(num1!=null && num2!=null){
			num3=(Integer.parseInt(num1))+(Integer.parseInt(num2));	
		}				
	%>

	<form action="">
		<input type="text" name="num1" id="" value=<%=num1 %> />
		+
		<input type="text" name="num2" id="" value=<%=num2 %> />
		<input type="submit" value="=" />
		<input type="text" name="num3" id="" value=<%=num3 %> />
	</form>
	
	
</body>
</html>