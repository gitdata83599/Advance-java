<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<error-page>
  	<error-code>500</error-code>
 	<location>/error.jsp</location>
  </error-page>
  
<error-page>
  	<exception-type>java.lang.ArithmeticException</exception-type>
  	<location>/error1.jsp</location>
  </error-page>
  
  <error-page>
  	<error-code>404</error-code>
  	<location>/notfound.jsp</location>
  </error-page>
  

</body>
</html>