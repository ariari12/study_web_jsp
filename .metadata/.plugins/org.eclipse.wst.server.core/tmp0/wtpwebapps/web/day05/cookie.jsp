<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	window.onload=function(){
		document.cookie="name=coffee";
		let date = new Date();
		
		date.setTime(date.getTime()+1*60*1000); //60초
		document.cookie="product=monitor;expires="+date.toUTCString();
		
		let x = document.cookie;
		console.log(x);
	}
</script>
</head>
<body>

</body>
</html>