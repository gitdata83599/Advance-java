<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Syntax</title>
</head>
<body>

   <h1>JSP syntax Demo</h1>
   <%
   
   Date now = new Date();
   out.println("server Time:" + now);
   
   %>
   
   <%!
    int count =0;
   
   public void jspInit(){
	   System.out.println("demo1 jspInit() called");
   }
   public void jspDestroy(){
	   System.out.println("demo1 jspDestroy() called");
   }
   
   %>
   
   <br/><br/>
   
    <%  count++;%>
  
  <% if(count % 2 == 0) { %>
     Event Count : <%= count %>
     <% } else { %>
     Odd Count: <%=count %>
     <%} %> 
     
   %> 
   
   
   
   

</body>
</html>