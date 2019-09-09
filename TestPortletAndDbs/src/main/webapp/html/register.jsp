<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="dao.Dao" %>
<jsp:useBean id="obj" class="model.User"/>
<jsp:setProperty property="*" name="obj"/>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>


<%
    System.out.println("I'm a register.jsp page");
%>

<portlet:actionURL name="action-view" var="view">
</portlet:actionURL>
<portlet:defineObjects />

<form action="${view}" method="post">
    <input type="submit" value="Back to..."/>
</form>
