
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/portlet_2_0"
          prefix="portlet"%><portlet:defineObjects />
<form method="POST" action="<portlet:actionURL/>">
    <table border="1">
        <tr bgcolor="silver">
            <th align="center" valign="middle" colspan ="2" >Publisher
                Portlet for the
                WSRP use case <br> <br></th>
        </tr>
        <tr>
            <td>Enter your text message here.</td>
            <td><input name="PUBLISHEVENT_PARAM" value="" type="text"
                       size="50"></td>
        <tr>
            <td colspan ="2" align ="center"><input name="submit"
                                                    value="Pass It On" size ="30" type="submit"></td>
        </tr>
    </table>
</form>