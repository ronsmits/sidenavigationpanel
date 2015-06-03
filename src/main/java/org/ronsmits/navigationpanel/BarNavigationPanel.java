package org.ronsmits.navigationpanel;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.model.Model;
/**
 * The topbar implementation of the {@link NavigationPanel}. The div that links to this has to be placed within a 
 * <code>&lt;div class="navbar"&gt;&lt;div&gt;</code> This way if you need to place extra stuff like a search panel for
 * example, you can do it within this div.
 * 
 * @author Ron
 *
 */
public class BarNavigationPanel extends NavigationPanel {
	private static final long serialVersionUID = 867749110198841671L;
	
	/**
	 * Creat the BarNavigationPanel
	 * @param brand the brand that will be used as placeholder for the homepage
	 * @param homepage the homepage where the brand will link to.
	 * @param builder the builder initialized with the links needed for the menu.
	 */
	public BarNavigationPanel(String brand, Class<? extends Page> homepage, Builder builder) {
		super(builder);
		add(new BookmarkablePageLink<Void>("link", homepage).setBody(Model.of(brand)));
	}
}
