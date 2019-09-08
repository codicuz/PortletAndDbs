package utils;

import javax.portlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloPortletAndDbs extends GenericPortlet {
    String str = "/html/index.jsp";
    @Override
    protected void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("Hello World !");
        writer.close();
        System.out.println("This is test message in SystemOut");
        PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher(str);
        rd.include(request, response);
    }

    @ProcessAction(name="action-list")
    public void action1(ActionRequest request, ActionResponse response)
            throws IOException, PortletException{
        str = "/html/user-list.jsp";
    }

    @ProcessAction(name="action-view")
    public void action2(ActionRequest request, ActionResponse response)
            throws IOException, PortletException{
        str = "/html/index.jsp";
    }

    @ProcessAction(name="action-register")
    public void action3(ActionRequest request, ActionResponse response)
            throws IOException, PortletException{
        str = "/html/register.jsp";
    }
}
