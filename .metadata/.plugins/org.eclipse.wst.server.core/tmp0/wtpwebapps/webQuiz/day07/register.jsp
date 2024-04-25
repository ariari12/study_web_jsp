<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
	window.onload=function(){
		let btn = document.getElementById("btn");
		btn.onclick=openKakaoPostCode; // openKakaoPostCode 함수를 실행해
	}
	
	function openKakaoPostCode(){
		/* console.log("버튼 눌림"); */
		
	    new daum.Postcode({
	        oncomplete: function(data) {
				// 팝업에서 검색 결과 항목을 클릭했을때
				// 실행할 코드를 작성하는 부분
				console.log("팝업에서 검색 버튼 눌림");
				console.dir(data);
				
				let zipcode=document.getElementById("zipcode");
				console.dir(zipcode);
				zipcode.value=data.zonecode;				
	        }
	    }).open();
	}
</script>
</head>
<body>
<form action="../registerOk.jsp">
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
	
	<label for="code">우편번호 :</label>
	<div id="code">
		<input type="text" name="zipcode" id="zipcode" />
		<input type="button" value="우편번호찾기" id="btn" /><br />
	</div>
	
	
	
	<input type="submit" value="가입하기" />
	<input type="reset" value="취소하기" />
</form>

</body>
</html>