<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Candidate</title>
</head>
<body>
   <h3>${initParam.appTitle}</h3>
   <jsp:useBean id="fcb" class="com.sunbeam.beans.FindCandidateBean"/>
   <jsp:setProperty name="fcb" property="id" param="id"/>
   ${fcb.fetchCandidate()}
   <form method ="post" action="updatecand.jsp">
          <input type="hidden" name="name" value=${fcb.candidate.id}/>
          Name: <input type="text" name="name" value="${fcb.candidate.name}"/> <br/> <br/>
          party: <input type="text" name="party" value="${fcb.candidate.party}"/> <br/> <br/>
          Votes: <input type="text" name="votes" value="${fcb.candidate.votes}"/> <br/> <br/>
            <input type="submit" value="Update candidate"/>
   </form>>

</body>
</html>