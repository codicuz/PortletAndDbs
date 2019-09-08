<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.Dao" %>
<%@ page import="model.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>User Management Application</title>
</head>
<body>

<center>
    <h1>User Management</h1>
    <h2>
        <a href="new">Add New User</a>
        <a href="list">List All Users</a>
    </h2>
</center>

<div align="center">
    <%
        Dao dao = new Dao();
        List<User> listUser = dao.getUsers();
        request.setAttribute("listUser", listUser);
    %>
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.id}" /></td>
                <td><c:out value="${user.name}" /></td>
                <td><c:out value="${user.email}" /></td>
                <td><c:out value="${user.password}" /></td>
                <td>
                    <a href="edit?id=<c:out value='${user.id}' />">Edit</a>
                    <a href="delete?id=<c:out value='${user.id}' />">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>