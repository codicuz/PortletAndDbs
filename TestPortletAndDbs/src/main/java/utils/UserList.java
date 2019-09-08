package utils;

import javax.portlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class UserList extends GenericPortlet {
    @Override
    protected void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("User_List !");
        writer.close();
        System.out.println("This is test message in SystemOut from User_List");
        PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher("/html/user-list.jsp");
        rd.include(request, response);
    }
}
