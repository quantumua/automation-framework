package com.betamedia.automation.framework.pages.tp;

import com.betamedia.automation.framework.pages.common.AbstractPage;
import com.betamedia.automation.framework.pages.tp.login.LoginPage;
import com.betamedia.automation.framework.pages.tp.login.LoginPageImpl;
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
}
