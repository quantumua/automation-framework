package com.betamedia.automation.framework.pages.tp.login.impl;

import com.betamedia.automation.framework.pages.common.AbstractPage;
import com.betamedia.automation.framework.pages.common.annotation.StoredId;
import com.betamedia.automation.framework.pages.tp.TPPages;
import com.betamedia.automation.framework.pages.tp.login.LoginPage;
import org.openqa.selenium.By;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public class LoginPageImpl extends AbstractPage implements LoginPage {

    @StoredId("usernameField")
    private By usernameField;
    @StoredId("passwordField")
    private By passwordField;
    @StoredId("submitButton")
    private By submitButton;

    @Override
    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }

    @Override
    public LoginPage goTo() {
        TPPages.topNavigationPage().logIn();
        return this;
    }

    @Override
    public By getLocator() {
        return submitButton;
    }
}
