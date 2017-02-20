package com.betamedia.automation.framework.pages.tp.login.impl;

import com.betamedia.automation.framework.pages.common.AbstractPage;
import com.betamedia.automation.framework.pages.common.annotation.StoredId;
import com.betamedia.automation.framework.pages.tp.login.DisclaimerNotification;
import org.openqa.selenium.By;

/**
 * Created by mbelyaev on 2/16/17.
 */
public class DisclaimerNotificationImpl extends AbstractPage implements DisclaimerNotification {
    @StoredId("disclaimerCheckbox")
    private By disclaimerCheckbox;
    @StoredId("disclaimerSubmitBtn")
    private By disclaimerSubmitBtn;

    @Override
    public void accept() {
        driver.findElement(disclaimerCheckbox).click();
        driver.findElement(disclaimerSubmitBtn).click();
    }

    @Override
    public boolean isAt() {
        return driver.findElement(disclaimerCheckbox).isDisplayed();
    }
}