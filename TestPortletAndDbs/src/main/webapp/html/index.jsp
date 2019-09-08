<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib uri="http://java.sun.com/portlet" prefix="portlet" %>--%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<html>
<head>
  <title>User Management Application</title>
</head>
<body>
<portlet:actionURL name="action-register" var="register">
</portlet:actionURL>
<portlet:defineObjects />

<form action="${register}" method="post">
  <label for="nam">Name: </label>
  <input type="text" id="nam" name="name"/><br><br/>
  <label for="pas">Password: </label>
  <input type="password" id="pas" name="password"/><br><br/>
  <label for="ema">Email ID: </label>
  <input type="text" id="ema" name="email"/><br><br/>
  <input type="submit" value="register"/>
</form>

<portlet:actionURL name="action-list" var="list">
</portlet:actionURL>
<portlet:defineObjects />

<form action="${list}" method="post">
  <input type="submit" value="List Users"/>
</form>
</body>
</html>