<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>delete candidate</title>
</head>
<body>
    <%--<h3>${initParam.appTitle}</h3>
  Hello, Voter ${lb.user.firstName} <hr/>
  <jsp:useBean id="clb" class="com.sunbeam.beans.CandidateListBean"/>
    <form method="post" action="vote.jsp">
     <br/> <input type="submit" value="Sign Out"/>
	</form> --%>  
	
	<h3>${initParam.appTitle}</h3>
     Delete candidate${lb.user.Name} <hr/>
  <jsp:useBean id="clb" class="com.sunbeam.beans.CandidateListBean"/>
    <form method="post" action="result.jsp">
     <br/> <input type="submit" value="Sign Out"/>
	</form>
  
</body>
</html>