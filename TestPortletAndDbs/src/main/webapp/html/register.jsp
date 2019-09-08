<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="dao.Dao" %>
<jsp:useBean id="obj" class="model.User"/>
<jsp:setProperty property="*" name="obj"/>

<%
//    int i=UserDao.register(obj);
    Dao dao = new Dao();
    int i = dao.addUser(obj);
    if(i>0)
        System.out.print("You are successfully registered");
%>