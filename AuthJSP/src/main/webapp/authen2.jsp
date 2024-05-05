<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="p1.*" %> 
 <jsp:useBean id="u" class="p1.User" scope="session"></jsp:useBean> 
 <jsp:setProperty name="u" property="mail" param="mail"/>
<jsp:setProperty name="u" property="password" param="password"/>
<jsp:forward page="affich2.jsp" />
