<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl表单</title>
</head>
<body>
	<sf:form action="${pageContext.request.contextPath}/form/register" method="POST" commandName="user">
		username:<sf:input path="username"/><br/>
		password:<sf:password path="password"/><br/>
		email:<sf:input path="email"/><br/>
		phone:<sf:input path="phone"/><br/>
		<input type="submit" value="注册"/>
	</sf:form>
</body>
</html>