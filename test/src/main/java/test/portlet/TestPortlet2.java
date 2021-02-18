package test.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import org.osgi.service.component.annotations.Component;
import test.constants.TestPortletKeys;

import javax.portlet.Portlet;

/**
 * @author inky
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=Test2",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view2.jsp",
                "javax.portlet.name=" + TestPortletKeys.TEST2,
                "javax.portlet.resource-bundle=content.test.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class TestPortlet2 extends MVCPortlet {
}