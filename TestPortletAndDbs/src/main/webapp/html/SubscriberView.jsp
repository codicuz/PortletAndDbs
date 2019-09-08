<%--
  Created by IntelliJ IDEA.
  User: codicus
  Date: 08.09.2019
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/portlet_2_0"
          prefix="portlet"%><portlet:defineObjects />
<table border="1">
    <tr bgcolor="silver">
        <th align="center" valign="middle">Message Received: <br></th>
    </tr>
    <tr>
        <td><%=request.getAttribute("PUBLISHEVENT_PARAM")%><br></td>
    </tr>
</table>
