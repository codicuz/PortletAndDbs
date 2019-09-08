package utils;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.Locale;
import java.util.ResourceBundle;

public class TitledChangedPortlet2 extends GenericPortlet {
    public void doView(RenderRequest request, RenderResponse response) throws PortletException, java.io.IOException {
        response.getWriter().println("My Name Is:"+this.getPortletName());
    }

    public String getTitle(RenderRequest request) {
        // Check whether the name of the portlet is programmaticTitleChangePortlet
        if(this.getPortletName().equals("ProgrammaticTitleChangePortlet")){
            // If it's like that, just get the defined bundle
            ResourceBundle bundle = this.getPortletConfig().getResourceBundle(new Locale("en"));
            // Retrun the string that's corresponded for anyTitle property
            return (String)bundle.getObject("anyTitle");
        }
        // else return the default, either that's defined in the portlet.xml or that's defined in the bundle
        return super.getTitle(request);
    }
}

