<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="StudentController/addStudent.do" method="post">
		<input name="stuNo" />
		<input name="stuName" />
		<input name="stuAge" />
		<input type="submit" value="增加"/>
	</form>
</body>
</html>