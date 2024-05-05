<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,java.io.* , java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercice 1.1</title>
</head>
<body>
Nous sommes le  <%= new java.util.Date() %> <br>
Le nom  de votre machine : <%= java.net.InetAddress.getLocalHost().getHostName() %><br>
Votre adresse IP est: <%= java.net.InetAddress.getLocalHost().getHostAddress() %><br>
Le nom du serveur sur lequel vous etes connecte: <%= request.getServerName() %><br>

</body>
</html>