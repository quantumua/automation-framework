package com.betamedia.automation.framework.pages.tp;

import com.betamedia.automation.framework.pages.common.AbstractPage;
import com.betamedia.automation.framework.pages.common.WebElementRepository;
import com.betamedia.automation.framework.pages.tp.login.*;
import com.betamedia.automation.framework.pages.tp.login.impl.DisclaimerNotificationImpl;
import com.betamedia.automation.framework.pages.tp.login.impl.LoginErrorNotificationImpl;
import com.betamedia.automation.framework.pages.tp.login.impl.LoginPageImpl;
import com.betamedia.automation.framework.pages.tp.navigation.*;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public class TPPages extends AbstractPage {

    public static LoginPage loginPage() {
        return new LoginPageImpl(getDriver(),
                WebElementRepository.getLocations(LoginPage.class.getSimpleName()));
    }

    public static TopNavigationPage topNavigationPage(){
        return new TopNavigationPageImpl(getDriver(),
                WebElementRepository.getLocations(TopNavigationPage.class.getSimpleName()));
    }

    public static DisclaimerNotification disclaimerNotification(){
        return new DisclaimerNotificationImpl(getDriver(),
                WebElementRepository.getLocations(DisclaimerNotification.class.getSimpleName()));
    }


    public static LoginErrorNotification loginErrorNotification() {
        return new LoginErrorNotificationImpl(getDriver(),
                WebElementRepository.getLocations(LoginErrorNotification.class.getSimpleName()));
    }
}
