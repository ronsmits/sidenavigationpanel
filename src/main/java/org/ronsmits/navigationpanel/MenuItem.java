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
package org.ronsmits.navigationpanel;

import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

/**
 *
 * @author Ron
 */
public class MenuItem extends Panel {
	private static final long serialVersionUID = 3512802589536861966L;

	public MenuItem(String id, BookmarkablePageLink<?> pageLink, boolean isActive) {
        super(id);
        this.setOutputMarkupId(false);
        pageLink.setOutputMarkupId(false);
        add(pageLink);
        if (isActive) {
            add(new AttributeAppender("class", Model.of("active")));
        }
    }
}
