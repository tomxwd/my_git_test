<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<form action='<c:url value="/login"></c:url>' method="post">
		username:<input name="username" type="text" /><br />
		password:<input name="password" type="password" /><br />
		<input type="submit" value="登录"/>
	</form>
</body>
</html>