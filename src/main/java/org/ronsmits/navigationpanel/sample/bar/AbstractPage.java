package org.ronsmits.navigationpanel.sample.bar;

import org.ronsmits.navigationpanel.BarNavigationPanel;
import org.ronsmits.navigationpanel.NavigationPanel.Builder;
import org.ronsmits.navigationpanel.sample.HomePage;
import org.ronsmits.navigationpanel.sample.Template;

public class AbstractPage extends Template {
	private static final long serialVersionUID = -4468899368979501116L;

	public AbstractPage() {
		super();
		setupMenu();
	}
	
	private void setupMenu() {
		Builder builder = new Builder("navigation", getPage());
		builder.addMenuItem("page 1", Page1.class);
		builder.addMenuItem("Page 2", Page2.class);
		add(new BarNavigationPanel("Navbar demo", HomePage.class, builder));
	}
}
