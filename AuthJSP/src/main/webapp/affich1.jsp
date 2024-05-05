<%@ page import="p1.User" %>
<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
   
    HttpSession s = request.getSession();
    User user = (User) session.getAttribute("user");
    
    String userEmail = user.getMail();
    String userPassword = user.getPassword();
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Affichage</title>
</head>
<body>
    <h2>Informations de l'utilisateur:</h2>
    <p>Adresse email: <%= userEmail %></p>
    <p>Password: <%= userPassword %></p>
</body>
</html>
