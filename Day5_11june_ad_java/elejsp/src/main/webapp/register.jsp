<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
  <jsp:useBean id="rb" class="com.sunbeam.beans.RegistrationBean" scope="page"/>
  <jsp:setProperty name="rb" property="*"/>
  <jsp:setProperty name="rb" property="status" value="0"/>
  <jsp:setProperty name="rb" property="role" value="voter"/>
 ${rb.registerUser()}
 
  <% if(rb.getCount() == 1) { %>
             Registration Successful.
             <a href="index.jsp">sign In</a>
      <% } else { %>
              Registration Failed.
              <a href="newuser.jsp">sign Up</a>
       <% } %>
              
           
  

</body>
</html>