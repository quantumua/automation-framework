package com.betamedia.automation.framework;

import org.openqa.selenium.support.PageFactory;

/**
 * Created by mbelyaev on 2/14/17.
 */
public class Pages {

    private static <T> T getPage (Class<T> clazz) {
        T page;
        try {
            page = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }

        PageFactory.initElements(Browser.getDriver(), page);
        return page;
    }

    public static AboutPage getAbout() {
        return getPage(AboutPage.class);
    }

    public static TopNavigationPage getTopNavigation()
    {
        return getPage(TopNavigationPage.class);
    }
}
