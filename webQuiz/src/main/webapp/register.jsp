<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="registerOk.jsp">
	<label for="id">ID :</label>
	<input type="text" name="id" id="id">
	<br />
	<label for="name">NAME :</label>
	<input type="text" name="name" id="name">
	<br />
	<label for="birthNum">주민등록번호 :</label>
	<input type="text" name="birthNum1" id="birthNum">
	-
	<input type="text" name="birthNum2">
	<br />
	<label for="pw">비밀번호 :</label>
	<input type="password" name="pw" id="pw">	
	<br />
	<label for="tel">전화번호 :</label>
	<input type="text" name="tel1" id="tel">
	- 
	<input type="text" name="tel2">
	- 
	<input type="text" name="tel3">
	<br />
	<label for="addr">주소 :</label>
	<input type="text" name="addr" id="addr">
	<br />
	<label for="email">EMAIL :</label>
	<input type="text" name="email1" id="email">
	@
	<input type="text" name="email2">
	<select name="email3" id="">
		<option value="">직접입력</option>
		<option value="naver.com">naver.com</option>
		<option value="gmail.com">gmail.com</option>
	</select>
	<br />
	<label for="gender">성별 :</label>
	<div id="gender">
		<input type="radio" name="sex" value="남"  >남
		<input type="radio" name="sex" value="여" >여
	</div>
	<label for="hobby">취미 :</label>
	<div id="hobby">
		<input type="checkbox" name="hob" value="음악감상" >음악감상
		<input type="checkbox" name="hob" value="독서" >독서
		<input type="checkbox" name="hob" value="운동" >운동
	</div>
	<input type="submit" value="가입하기" />
	<input type="reset" value="취소하기" />
</form>

</body>
</html>