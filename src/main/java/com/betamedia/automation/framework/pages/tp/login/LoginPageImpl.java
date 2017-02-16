package com.betamedia.automation.framework.pages.tp.login;

import com.betamedia.automation.framework.pages.tp.TPPages;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public class LoginPageImpl implements LoginPage {
    @Override
    public void login() {

    }

    @Override
    public void goTo() {
        TPPages.topNavigationPage().login();
    }
}
