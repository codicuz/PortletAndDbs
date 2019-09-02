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
        PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher("/index.jsp");
        rd.include(request, response);
    }
}
