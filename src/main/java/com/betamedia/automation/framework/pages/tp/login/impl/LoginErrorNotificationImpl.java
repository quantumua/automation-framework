package com.betamedia.automation.framework.pages.tp.login.impl;

import com.betamedia.automation.framework.pages.tp.login.LoginErrorNotification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

/**
 * Created by mbelyaev on 2/17/17.
 */
public class LoginErrorNotificationImpl implements LoginErrorNotification {

    private WebDriver driver;
    private By errorNotification;
    private By errorCloseBtn;

    public LoginErrorNotificationImpl(WebDriver driver, Map<String, String> locations) {
        this.driver = driver;
        this.errorNotification = By.xpath(locations.get("errorNotification"));
        this.errorCloseBtn = By.xpath(locations.get("errorCloseBtn"));
    }

    @Override
    public boolean isAt() {
        return driver.findElement(errorNotification).isDisplayed();
    }

    @Override
    public void dismiss() {
        driver.findElement(errorCloseBtn).click();
    }
}
