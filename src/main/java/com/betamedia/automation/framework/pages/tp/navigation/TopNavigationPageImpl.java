package com.betamedia.automation.framework.pages.tp.navigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public class TopNavigationPageImpl implements TopNavigationPage {

    @FindBy(how = How.ID, using = "login_btn")
    private WebElement loginBtn;

    @FindBy(how = How.ID, using = "myaccount_btn")
    private WebElement myAccountBtn;

    @Override
    public boolean isLoggedIn() {
        return myAccountBtn.isDisplayed();
    }

    @Override
    public void login() {
        loginBtn.click();
    }
}
