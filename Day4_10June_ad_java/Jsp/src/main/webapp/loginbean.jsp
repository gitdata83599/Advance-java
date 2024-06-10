<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java beans</title>
</head>
<body>

  
	<jsp:useBean id="lb" class="com.sunbeam.jsp.LoginBean"/>
	<jsp:setProperty name="lb" property="email" param="email"/>
	<jsp:setProperty name="lb" property="password" param="passwd"/>
	<% lb.authenticate(); %>>
	<% if(lb.getUser() !=null) { %>
	welcome, <jsp:getProperty name="lb" property="email"/>
	<% } else { %>
	Login failed
	<% } %>
	

</body>
</html>