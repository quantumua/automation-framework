package com.betamedia.automation.framework.pages.tp;

import com.betamedia.automation.framework.pages.common.AbstractPage;
import com.betamedia.automation.framework.pages.common.PropertiesRepository;
import com.betamedia.automation.framework.pages.tp.login.LoginPage;
import com.betamedia.automation.framework.pages.tp.login.LoginPageImpl;
import com.betamedia.automation.framework.pages.tp.navigation.DisclaimerNotification;
import com.betamedia.automation.framework.pages.tp.navigation.DisclaimerNotificationImpl;
import com.betamedia.automation.framework.pages.tp.navigation.TopNavigationPage;
import com.betamedia.automation.framework.pages.tp.navigation.TopNavigationPageImpl;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public class TPPages extends AbstractPage {

    public static LoginPage loginPage() {
        return new LoginPageImpl(getDriver(),
                PropertiesRepository.getElementLocations(LoginPage.class.getSimpleName()));
    }

    public static TopNavigationPage topNavigationPage(){
        return getPage(TopNavigationPageImpl.class);
    }

    public static DisclaimerNotification disclaimerNotification(){
        return getPage(DisclaimerNotificationImpl.class);
    }


}
