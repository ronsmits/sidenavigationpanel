package org.ronsmits.navigationpanel.sample;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends Template {
    private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
        super(parameters);

        add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

        // TODO Add your page's components here

    }
}
