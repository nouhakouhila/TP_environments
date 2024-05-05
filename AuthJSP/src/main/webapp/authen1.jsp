<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ page import="p1.User" %>
   <%@ page import="java.io.*" %>
	<%@ page import="javax.servlet.*" %>
	<%@ page import="javax.servlet.http.*" %>
    
    <%
    	String email = request.getParameter("email");
   	    String password = request.getParameter("password");
    	
   	    User user = new User();
   	    user.setMail(email);
   	    user.setPassword(password);
    	
   	 HttpSession s = request.getSession();
     session.setAttribute("user", user);
     
     response.sendRedirect("affich1.jsp");
     
     
    %>
    
    
