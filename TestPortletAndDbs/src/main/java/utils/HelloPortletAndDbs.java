package utils;

import javax.portlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloPortletAndDbs extends GenericPortlet {
    @Override
    protected void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("Hello World !");
        writer.close();
        System.out.println("This is test message in SystemOut");
        PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher("/html/index.jsp");
        rd.include(request, response);
    }

    @Override
    protected void doEdit(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        response.setContentType(request.getResponseContentType());
        PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher("/html/edit.jsp");
        rd.include(request, response);

    }

    @Override
    protected void doHelp(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        response.setContentType(request.getResponseContentType());
        PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher("/html/help.jsp");
        rd.include(request, response);
    }


    public void action1(ActionRequest request, ActionResponse response)
            throws IOException, PortletException{
        System.out.println("fuck my big tits");
    }
}
