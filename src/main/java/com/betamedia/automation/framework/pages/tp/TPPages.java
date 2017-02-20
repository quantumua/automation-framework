package com.betamedia.automation.framework.pages.tp;

import com.betamedia.automation.framework.pages.common.AbstractPage;
import com.betamedia.automation.framework.pages.tp.login.DisclaimerNotification;
import com.betamedia.automation.framework.pages.tp.login.LoginErrorNotification;
import com.betamedia.automation.framework.pages.tp.login.LoginPage;
import com.betamedia.automation.framework.pages.tp.login.impl.DisclaimerNotificationImpl;
import com.betamedia.automation.framework.pages.tp.login.impl.LoginErrorNotificationImpl;
import com.betamedia.automation.framework.pages.tp.login.impl.LoginPageImpl;
import com.betamedia.automation.framework.pages.tp.navigation.TopNavigationPage;
import com.betamedia.automation.framework.pages.tp.navigation.TopNavigationPageImpl;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public class TPPages extends AbstractPage {

    public static LoginPage loginPage() {
        return getPage(LoginPageImpl.class);
    }

    public static TopNavigationPage topNavigationPage(){
        return getPage(TopNavigationPageImpl.class);
    }

    public static DisclaimerNotification disclaimerNotification(){
        return getPage(DisclaimerNotificationImpl.class);
    }


    public static LoginErrorNotification loginErrorNotification() {
        return getPage(LoginErrorNotificationImpl.class);
    }
}
