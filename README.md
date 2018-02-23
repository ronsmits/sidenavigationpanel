# Wicket bootstrap sidebar Navigation

I wanted a simple way of adding a sidebar menu to a wicket application where I use Bootstrap css.

## Including in your project
As this is not released into maven central there are two ways to use this in your project

### compile 
Clone this repository and run the command:
````
mvn clean install
````
This will install the jar and the pom in your local repository.

### Use jitpack
Add the jitpack repo to your pom file:
```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```
Add the dependency:
```xml
<dependency>
  <groupId>com.github.ronsmits</groupId>
  <artifactId>sidenavigationpanel</artifactId>
  <version>release~3.0.0-SNAPSHOT</version>
</dependency>
```

## Using
SideNavigationPanel uses a Builder to add MenuItems to it:

    add(new SideNavigationPanel(new SideNavigationPanel.Builder("navigation", getPage()).
        .addMenuItem("List", ListPage.class)
        .addMenuItem("Add", AddPage.class)
        .addMenuItem("Another Page", AnotherPage.class)));

the markup is

    <div wicket:id="navigation"></div>

or

    <wicket:container wicket:id="navigation"/>

The html coming from this is a div containing an unordered list with the right bootstrap classes added:

    <div>
        <ul class="nav nav-list">
            <li><a href="./index.html">Home</a></li>
            <li class="active"><a href="./list.html">List</a></li>
            <li><a href="./wicket/bookmarkable/com.example.wicket.pages.AddFilm">Add</a></li>
        </ul>
    </div>



The way the builder works you can also add stuff like this:

    Builder builder = new Builder("navigation", getPage());
        builder = builder
                .addMenuItem("Home", HomePage.class)
                .addMenuItem("List", ListPage.class);
        if (checkLogin()) {
            builder.addMenuItem("Add", AddFilm.class);
        }
        add(new SideNavigationPanel(builder));
