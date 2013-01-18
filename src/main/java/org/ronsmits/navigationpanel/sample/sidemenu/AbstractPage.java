/*
 * Copyright 2013 Ron.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ronsmits.navigationpanel.sample.sidemenu;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.ronsmits.navigationpanel.NavigationPanel;
import org.ronsmits.navigationpanel.SideNavigationPanel;
import org.ronsmits.navigationpanel.sample.HomePage;
import org.ronsmits.navigationpanel.sample.Template;

/**
 *
 * @author Ron
 */
public abstract class AbstractPage extends Template {
	private static final long serialVersionUID = 4685823834238906112L;

	public AbstractPage() {
        super();
        setupMenu();
    }

    public AbstractPage(PageParameters parameters) {
        super(parameters);
        System.out.println("page " + getPage().toString());
        setupMenu();
    }

    private void setupMenu() {
        setOutputMarkupId(false);
        add(new SideNavigationPanel(new NavigationPanel.Builder("navigation", getPage())
                .addMenuItem("pagina 1", Page1.class)
                .addMenuItem("pagina 2", Page2.class)
                .addMenuItem("pagina 3", Page3.class)
                .addMenuItem("Home", HomePage.class)));
    }
}
