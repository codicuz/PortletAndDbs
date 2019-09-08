<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="dao.Dao" %>
<jsp:useBean id="obj" class="model.User"/>
<jsp:setProperty property="*" name="obj"/>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>



<%
//    int i=UserDao.register(obj);
    Dao dao = new Dao();
    int i = dao.addUser(obj);
    if(i>0)
        System.out.print("You are successfully registered");
%>

<portlet:actionURL name="action-view" var="view">
</portlet:actionURL>
<portlet:defineObjects />

<form action="${view}" method="post">
    <input type="submit" value="Back to..."/>
</form>
