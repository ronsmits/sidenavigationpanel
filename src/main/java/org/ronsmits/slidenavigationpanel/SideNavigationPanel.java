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
package org.ronsmits.slidenavigationpanel;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import org.apache.wicket.Page;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.model.Model;

/**
 *
 * @author Ron
 */
public class SideNavigationPanel extends Panel {
	private static final long serialVersionUID = -5568250122412968503L;

	public SideNavigationPanel(Builder builder) {

        super(builder.id);
    	System.out.println("builder.id "+ builder.id);
        RepeatingView rv = new RepeatingView("menuItems");

        for (BookmarkablePageLink<?> link : builder.links) {
            boolean isActive = link.getPageClass().equals(builder.activePage.getClass());
            rv.add(new MenuItem(rv.newChildId(), link, isActive));
        }
        add(rv);
    }

    public static class Builder implements Serializable {
		private static final long serialVersionUID = 2395309898068944372L;

		protected String id;
        private Page activePage;
        private List<BookmarkablePageLink<?>> links = new LinkedList<BookmarkablePageLink<?>>();

        public Builder(String id, Page activePage) {
            this.id = id;
            this.activePage = activePage;
        }

        public Builder addMenuItem(String linkTekst, Class<? extends Page> page) {
            BookmarkablePageLink<? extends Page> link = new BookmarkablePageLink<Page>("link", page);
            link.setBody(Model.of(linkTekst));
            links.add(link);
            return this;
        }
    }
}
