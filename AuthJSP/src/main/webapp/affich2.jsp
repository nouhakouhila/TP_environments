<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <jsp:useBean id="u" class="p1.User" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Votre Adresse email est: <jsp:getProperty name="u" property="mail"/><br/>
Votre mot de passe: <jsp:getProperty name="u" property="password"/><br/>
</body>
</html>