<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	window.onload = function(){
		let id = document.getElementById("btn");
		btn.onclick=function(){
			let frm = document.frm;
			
			if(frm[0].value==''){
				alert("id를 입력하세요");
				frm[0].focus();
 				return ;
			}
			if(frm[1].value==''){
				alert("패스워드를 입력하세요");
				frm[1].focus();
				return ;
			}
			
			frm.action="loginOk.jsp";
			frm.method="get";
			frm.submit();
		}
		
		
	}
</script>
</head>
<body>
<form action="login.OK.jsp" name="frm">
	<table>
		<tr>
			<th>ID</th>
			<td><input type="text" name="id" id="" /></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><input type="text" name="pw" id="" /></td>
		</tr>
		<tr>
			<td><input type="button" value="로그인" id="btn" /></td>	
			
		</tr>
	</table>
</form>
</body>
</html>