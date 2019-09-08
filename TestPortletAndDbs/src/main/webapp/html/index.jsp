<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib uri="http://java.sun.com/portlet" prefix="portlet" %>--%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<form action="register.jsp" method="post">
  <label for="nam">Name: </label>
  <input type="text" id="nam" name="name"/><br><br/>
  <label for="pas">Password: </label>
  <input type="password" id="pas" name="password"/><br><br/>
  <label for="ema">Email ID: </label>
  <input type="text" id="ema" name="email"/><br><br/>
  <input type="submit" value="register"/>
</form>

<%--<a href="<portlet:renderURL>  <portlet:param name="myRenderParameter" value="someValue"/>  </portlet:renderURL>">This is the text for the link</a>--%>

<form action="user-list.jsp" method="post">
  <input type="submit" value="List All"/>
</form>

<portlet:renderURL var="jobStatusURL">
  <portlet:param name="jspPage" value="/html/user-list.jsp" />
  <portlet:param name="tabs" value="JobStatus" />
</portlet:renderURL>
<button onclick="location.ahref='<%System.out.println("ddfddf");%>';">click me</button>
