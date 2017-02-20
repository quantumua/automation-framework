package com.betamedia.automation.framework.pages.tp.navigation;

import com.betamedia.automation.framework.pages.common.AbstractPage;
import com.betamedia.automation.framework.pages.common.annotation.StoredId;
import org.openqa.selenium.By;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public class TopNavigationPageImpl extends AbstractPage implements TopNavigationPage {

    @StoredId("loginBtn")
    private By loginBtn;
    @StoredId("myAccountBtn")
    private By myAccountBtn;

    @Override
    public boolean isLoggedIn() {
        return driver.findElement(myAccountBtn).isDisplayed();
    }

    @Override
    public void logIn() {
        driver.findElement(loginBtn).click();
    }
}
