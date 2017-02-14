package com.betamedia.automation.framework;

/**
 * Created by mbelyaev on 2/14/17.
 */
public class AboutPage {

    public void goTo()
    {
        Pages.getTopNavigation().about();
    }

    public boolean isAt()
    {
        return Browser.getTitle().contains("About");
    }
}
