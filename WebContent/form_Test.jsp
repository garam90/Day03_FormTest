<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/Day03/param" method="post">
		이름 : <input type="text" name="name"> <br>
		이메일 : <input type="email" name="email"> <br>
		생일 : <input type="date" name="birth"> <br>
		나이 : <input type="number" name="age"> <br>
		성별 : <input type="radio" name="gender" value="남자"> 남자   
				<input type="radio" name="gender" value="여자"> 여자 <br>
		취미 : <input type="checkbox" name="hobby" value="축구"> 축구   
 			<input type="checkbox" name="hobby" value="야구"> 야구  
			<input type="checkbox" name="hobby" value="농구"> 농구 <br>
		회사 : <select name="company">
				<option value="samsung">SAMSUNG</option>
				<option value="lg">LG</option>
				<option value="lotte">LOTTE</option>
			</select>
			<br>
		<input type="submit" value="제출">
	</form>

</body>
</html>