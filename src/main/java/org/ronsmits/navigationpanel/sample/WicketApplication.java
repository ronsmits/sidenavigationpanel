package org.ronsmits.navigationpanel.sample;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 *
 */
public class WicketApplication extends WebApplication {

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class<? extends WebPage> getHomePage() {
        return HomePage.class;
    }

    /**
     * @see org.apache.wicket.Application#init()
     */
    @Override
    public void init() {
        super.init();
        getMarkupSettings().setStripWicketTags(true);
        mountPackage("/sidebar", org.ronsmits.navigationpanel.sample.sidemenu.Page1.class);
        mountPackage("/navbar", org.ronsmits.navigationpanel.sample.bar.Page1.class);
    }
}
