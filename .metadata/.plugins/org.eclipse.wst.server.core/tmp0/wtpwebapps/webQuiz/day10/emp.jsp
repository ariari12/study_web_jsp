<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
	$(()=>{
		$("input[value='검색']").on("click",()=>{			
			let empno=$("input[type='text']").val();
			console.log(empno);
			$.ajax({
				url:"search2.jsp",
				type:"get",	
				data:{"empno":empno},
				success:(data)=>{
					let object = JSON.parse(data);
					console.log(object);
					console.log(object.ename);
					$("div").html(
							"<h6> 사원번호 : "+object.empno+"</h6>"+
							"<h6> 사원명 : "+object.ename+"</h6>"+
							"<h6> 직무 : "+object.job+"</h6>"
							);
					
				}
			})
		})
	})
</script>
</head>
<body>

	<input type="text" name="empno" id="" />
	<input type="button" value="검색" />

	
	<div id="info">
		<h6>사원번호</h6>
		<h6>사원명</h6>
		<h6>직무</h6>
	</div>
	

</body>
</html>