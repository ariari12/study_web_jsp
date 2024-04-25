<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	window.onload = function (){
		let register =document.getElementById("register");
		let main =document.getElementById("main");
		let frm = document.frm;
		
		register.onclick=()=>{
			frm.action="productRegOk.jsp";
			frm.method="post"
			frm.submit();
		}
		
		main.onclick=()=>{
			frm.action="layout.jsp";			
			frm.submit();
		}
	}
</script>
</head>
<body>
	<form name="frm" enctype="multipart/form-data">
		<tr>
			<th>상품명</th>
			<td><input type="text" name="pname" id="" /></td>
		</tr>
		<tr>
			<th>상품이미지</th>
			<td><input type="file" name="imgfile" id="" /></td>
		</tr>
		<tr>
			<th>상품수량</th>
			<td><input type="text" name="qty" id="" /></td>
		</tr>
		<tr>
			<th>판매가</th>
			<td><input type="text" name="price" id="" /></td>
		</tr>
		<tr>
			<th>할인율</th>
			<td><input type="text" name="dcratio" id="" /></td>
		</tr>
		<tr>
			<th>상세설명</th>
			<td><textarea name="prodesc" id="" cols="30" rows="10"></textarea></td>
		</tr>
		<tr>
			<td><input type="button" value="등록"  id="register" onclick="register" /></td>
			<td><input type="reset" value="리셋" /></td>
			<td><input type="button" value="메인화면" id="main" onclick="main" /></td>			
		</tr>
	</form>
</body>
</html>