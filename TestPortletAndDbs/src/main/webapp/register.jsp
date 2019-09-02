<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="dao.UserDao"%>
<jsp:useBean id="obj" class="dao.User"/>
<jsp:setProperty property="*" name="obj"/>

<%
    int i=UserDao.register(obj);
    if(i>0)
        System.out.print("You are successfully registered");
%>