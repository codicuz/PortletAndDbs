<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="dao.UserDao"%>
<%@ page import="dao.User" %>
<jsp:useBean id="obj" class="dao.User"/>
<jsp:setProperty property="*" name="obj"/>

<%
//    int i=UserDao.register(obj);
    UserDao ud = new UserDao();
    int i = ud.regi();
    if(i>0)
        System.out.print("You are successfully registered");
%>