package com.betamedia.automation.framework.pages.tp.login.impl;

import com.betamedia.automation.framework.pages.common.AbstractPage;
import com.betamedia.automation.framework.pages.common.annotation.StoredId;
import com.betamedia.automation.framework.pages.tp.login.LoginErrorNotification;
import org.openqa.selenium.By;

/**
 * Created by mbelyaev on 2/17/17.
 */
public class LoginErrorNotificationImpl extends AbstractPage implements LoginErrorNotification {

    @StoredId("errorNotification")
    private By errorNotification;
    @StoredId("errorCloseBtn")
    private By errorCloseBtn;

    @Override
    public boolean isAt() {
        return driver.findElement(errorNotification).isDisplayed();
    }

    @Override
    public void dismiss() {
        driver.findElement(errorCloseBtn).click();
    }
}
