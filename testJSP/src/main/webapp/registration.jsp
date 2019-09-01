<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Регистрация</title>
</head>
<body>
<h1>Регистрация</h1>

<c:if test="${violations != null}">
    <c:forEach items="${violations}" var="violation">
        <p>${violation}.</p>
    </c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/data.jsp" method="post">
    <label for="firstname">Имя : </label>
    <input type="text" name="firstname" id="firstname" value="${firstname}"/>
    <label for="lastname">Фамилия:</label>
        <input type="text" name="lastname" id="lastname" value="${lastname}"/>
        <label for="email">Email: </label>
        <input type="text" name="email" id="email" value="${email}"/>
        <input type="submit" name="signup" value="Sign Up"/>
</form>
</body>
</html>